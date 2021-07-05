package io.adminshell.aas.v3.dataformat.xml;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.hamcrest.MatcherAssert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;
import org.xmlunit.diff.DefaultNodeMatcher;
import org.xmlunit.diff.ElementSelectors;
import org.xmlunit.matchers.CompareMatcher;

import com.fasterxml.jackson.core.JsonProcessingException;

import io.adminshell.aas.v3.dataformat.SerializationException;
import io.adminshell.aas.v3.model.AssetAdministrationShellEnvironment;
import io.adminshell.aas.v3.model.impl.DefaultAssetAdministrationShellEnvironment;

public class XmlSerializerTest {
    private static final Logger logger = LoggerFactory.getLogger(XmlSerializerTest.class);

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void testWriteToFile() throws JsonProcessingException, IOException, SerializationException {
        File file = tempFolder.newFile("output.xml");
        new XmlSerializer().write(file, AASSimple.ENVIRONMENT);
        assertTrue(file.exists());
    }

    @Test
    public void testSerializeMinimal() throws IOException, SerializationException, SAXException {
        File file = new File("src/test/resources/minimum.xml");
        AssetAdministrationShellEnvironment environment = new DefaultAssetAdministrationShellEnvironment.Builder()
                .build();
        validateXmlSerializer(file, environment);
    }

    @Test
    public void testSerializeSimpleWithTestNamespacePrefix() throws IOException, SerializationException, SAXException {
        Map<String, String> nsPrefixes = new HashMap<>(AasXmlNamespaceContext.PREFERRED_PREFIX_CONTEXT);
        nsPrefixes.put("test", nsPrefixes.get("aas"));
        nsPrefixes.remove("aas");
        validateXmlSerializer(AASSimple.FILE_WITH_TEST_NAMESPACE, AASSimple.ENVIRONMENT, new XmlSerializer(nsPrefixes));
    }

    @Test
    public void testSerializeSimple() throws IOException, SerializationException, SAXException {
        validateXmlSerializer(AASSimple.FILE, AASSimple.ENVIRONMENT);
    }

    @Test
    public void testSerializeFull() throws IOException, SerializationException, SAXException {
        validateXmlSerializer(AASFull.FILE, AASFull.ENVIRONMENT);
    }

    private void validateXmlSerializer(File expectedFile, AssetAdministrationShellEnvironment environment)
            throws IOException, SerializationException, SAXException {
        validateXmlSerializer(expectedFile, environment, new XmlSerializer());
    }

    private void validateXmlSerializer(File expectedFile, AssetAdministrationShellEnvironment environment, XmlSerializer xmlSerializer)
            throws SerializationException, SAXException {
        String actual = xmlSerializer.write(environment);
        Set<String> errors = new XmlSchemaValidator().validateSchema(actual);
        logger.info(actual);
        logErrors(expectedFile.getName(), errors);
        assertTrue(errors.isEmpty());
        CompareMatcher xmlTestMatcher = CompareMatcher.isSimilarTo(expectedFile).normalizeWhitespace().ignoreComments()
                .withNodeMatcher(new DefaultNodeMatcher(ElementSelectors.byNameAndAllAttributes));
        MatcherAssert.assertThat(actual, xmlTestMatcher);
    }

    private void logErrors(String validatedFileName, Set<String> errors) {
        if (errors.isEmpty())
            return;
        logger.info("Validate file: " + validatedFileName);
        for (String error : errors) {
            logger.info(error);
        }
    }
}
