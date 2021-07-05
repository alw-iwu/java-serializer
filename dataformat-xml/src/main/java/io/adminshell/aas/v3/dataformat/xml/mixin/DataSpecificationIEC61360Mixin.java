package io.adminshell.aas.v3.dataformat.xml.mixin;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.adminshell.aas.v3.dataformat.xml.AasXmlNamespaceContext;
import io.adminshell.aas.v3.dataformat.xml.deserialization.LangStringsDeserializer;
import io.adminshell.aas.v3.dataformat.xml.serialization.LangStringsSerializer;
import io.adminshell.aas.v3.dataformat.xml.serialization.NamespaceIndependentReferenceSerializer;
import io.adminshell.aas.v3.model.DataTypeIEC61360;
import io.adminshell.aas.v3.model.LangString;
import io.adminshell.aas.v3.model.LevelType;
import io.adminshell.aas.v3.model.Reference;
import io.adminshell.aas.v3.model.ValueList;

@JsonPropertyOrder({"preferredName", "shortName", "unit", "unitId", "sourceOfDefinition", "symbol", "dataType",
    "definition", "valueFormat", "valueList", "value", "valueId", "leyelTypes"})
public interface DataSpecificationIEC61360Mixin {

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "preferredName")
    @JsonSerialize(using = LangStringsSerializer.class)
    @JsonDeserialize(using = LangStringsDeserializer.class)
    public List<LangString> getPreferredNames();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "shortName")
    @JsonSerialize(using = LangStringsSerializer.class)
    @JsonDeserialize(using = LangStringsDeserializer.class)
    public List<LangString> getShortNames();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "unit")
    public String getUnit();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "unitId")
    @JsonSerialize(using = NamespaceIndependentReferenceSerializer.class)
    public Reference getUnitId();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "sourceOfDefinition")
    public String getSourceOfDefinition();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "symbol")
    public String getSymbol();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "dataType")
    public DataTypeIEC61360 getDataType();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "definition")
    @JsonSerialize(using = LangStringsSerializer.class)
    @JsonDeserialize(using = LangStringsDeserializer.class)
    public List<LangString> getDefinitions();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "valueFormat")
    public String getValueFormat();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "valueList")
    public ValueList getValueList();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "value")
    public String getValue();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "valueId")
    @JsonSerialize(using = NamespaceIndependentReferenceSerializer.class)
    public Reference getValueId();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "levelType")
    public List<LevelType> getLevelTypes();
}
