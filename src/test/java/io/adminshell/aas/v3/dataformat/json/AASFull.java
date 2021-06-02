package io.adminshell.aas.v3.dataformat.json;

import java.util.Arrays;

import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.builder.*;

public class AASFull {

	public static final java.io.File FILE = new java.io.File("src/test/resources/test_demo_full_example.json");

	public static final AssetAdministrationShell AAS_1 = new DefaultAssetAdministrationShellBuilder()
			.idShort("TestAssetAdministrationShell")
			.descriptions(Arrays.asList(
					new LangString("An Example Asset Administration Shell for the test application", "en-us"),
					new LangString("Ein Beispiel-Verwaltungsschale für eine Test-Anwendung", "de")))
			.identification(new DefaultIdentifierBuilder().idType(IdentifierType.IRI)
					.identifier("https://acplt.org/Test_AssetAdministrationShell").build())
			.administration(new DefaultAdministrativeInformationBuilder().version("0.9").revision("0").build())
			.derivedFrom(new DefaultReferenceBuilder()
					.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.ASSET_ADMINISTRATION_SHELL)
							.idType(KeyType.IRI).value("https://acplt.org/TestAssetAdministrationShell2").build()))
					.build())
			.assetInformation(
					new DefaultAssetInformationBuilder().assetKind(AssetKind.INSTANCE)
							.globalAssetId(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.ASSET)
											.idType(KeyType.IRI).value("https://acplt.org/Test_Asset").build()))
									.build())
							.build())
			.submodels(
					Arrays.asList(
							new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.SUBMODEL)
											.value("https://acplt.org/Test_Submodel").idType(KeyType.IRI).build()))
									.build(),
							new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.SUBMODEL)
											.value("http://acplt.org/Submodels/Assets/TestAsset/BillOfMaterial")
											.idType(KeyType.IRI).build()))
									.build(),
							new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.SUBMODEL)
											.value("http://acplt.org/Submodels/Assets/TestAsset/Identification")
											.idType(KeyType.IRI).build()))
									.build()))
			.build();

	public static final AssetAdministrationShell AAS_2 = new DefaultAssetAdministrationShellBuilder().idShort("")
			.identification(new DefaultIdentifierBuilder().idType(IdentifierType.IRI)
					.identifier("https://acplt.org/Test_AssetAdministrationShell_Mandatory").build())
			.assetInformation(
					new DefaultAssetInformationBuilder().assetKind(AssetKind.INSTANCE)
							.globalAssetId(
									new DefaultReferenceBuilder()
											.keys(Arrays.asList(
													new DefaultKeyBuilder().type(KeyElements.ASSET).idType(KeyType.IRI)
															.value("https://acplt.org/Test_Asset_Mandatory").build()))
											.build())
							.build())
			.submodels(Arrays.asList(
					new DefaultReferenceBuilder()
							.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.SUBMODEL)
									.value("https://acplt.org/Test_Submodel_Mandatory").idType(KeyType.IRI).build()))
							.build(),
					new DefaultReferenceBuilder()
							.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.SUBMODEL)
									.value("https://acplt.org/Test_Submodel2_Mandatory").idType(KeyType.IRI).build()))
							.build()))
			.build();

	public static final AssetAdministrationShell AAS_3 = new DefaultAssetAdministrationShellBuilder().idShort("")
			.identification(new DefaultIdentifierBuilder().idType(IdentifierType.IRI)
					.identifier("https://acplt.org/Test_AssetAdministrationShell2_Mandatory").build())
			.assetInformation(
					new DefaultAssetInformationBuilder().assetKind(AssetKind.INSTANCE)
							.globalAssetId(
									new DefaultReferenceBuilder()
											.keys(Arrays.asList(
													new DefaultKeyBuilder().type(KeyElements.ASSET).idType(KeyType.IRI)
															.value("https://acplt.org/Test_Asset_Mandatory").build()))
											.build())
							.build())
			.build();

	public static final AssetAdministrationShell AAS_4 = new DefaultAssetAdministrationShellBuilder()
			.idShort("TestAssetAdministrationShell")
			.descriptions(Arrays.asList(
					new LangString("An Example Asset Administration Shell for the test application", "en-us"),
					new LangString("Ein Beispiel-Verwaltungsschale für eine Test-Anwendung", "de")))
			.identification(new DefaultIdentifierBuilder().idType(IdentifierType.IRI)
					.identifier("https://acplt.org/Test_AssetAdministrationShell_Missing").build())
			.administration(new DefaultAdministrativeInformationBuilder().version("0.9").revision("0").build())
			.assetInformation(
					new DefaultAssetInformationBuilder().assetKind(AssetKind.INSTANCE)
							.globalAssetId(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.ASSET)
											.idType(KeyType.IRI).value("https://acplt.org/Test_Asset_Missing").build()))
									.build())
							.build())
			.submodels(
					Arrays.asList(new DefaultReferenceBuilder()
							.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.SUBMODEL)
									.value("https://acplt.org/Test_Submodel_Missing").idType(KeyType.IRI).build()))
							.build()))
			.views(Arrays.asList(
					new DefaultViewBuilder().idShort("ExampleView")
							.containedElements(Arrays
									.asList((new DefaultReferenceBuilder().keys(Arrays.asList(new DefaultKeyBuilder()
											.type(KeyElements.SUBMODEL).value("https://acplt.org/Test_Submodel_Missing")
											.idType(KeyType.IRI).build()))).build()))
							.build(),
					new DefaultViewBuilder().idShort("ExampleView2").build()))
			.build();

	public static final Submodel SUBMODEL_1 = new DefaultSubmodelBuilder().idShort("Identification")
			.descriptions(Arrays.asList(
					new LangString("An example asset identification submodel for the test application", "en-us"),
					new LangString("Ein Beispiel-Identifikations-Submodel für eine Test-Anwendung", "de")))
			.identification(new DefaultIdentifierBuilder().idType(IdentifierType.IRI)
					.identifier("http://acplt.org/Submodels/Assets/TestAsset/Identification").build())
			.administration(new DefaultAdministrativeInformationBuilder().version("0.9").revision("0").build())
			.semanticId(new DefaultReferenceBuilder()
					.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.SUBMODEL).idType(KeyType.IRI)
							.value("http://acplt.org/SubmodelTemplates/AssetIdentification").build()))
					.build())
			.submodelElements(Arrays.asList(
					new DefaultPropertyBuilder().idShort("ManufacturerName").descriptions(Arrays.asList(new LangString(
							"Legally valid designation of the natural or judicial person which is directly responsible for the design, production, packaging and labeling of a product in respect to its being brought into circulation.",
							"en-us"),
							new LangString(
									"Bezeichnung für eine natürliche oder juristische Person, die für die Auslegung, Herstellung und Verpackung sowie die Etikettierung eines Produkts im Hinblick auf das 'Inverkehrbringen' im eigenen Namen verantwortlich ist",
									"de")))
							.semanticId(
									new DefaultReferenceBuilder()
											.keys(Arrays
													.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
															.value("0173-1#02-AAO677#002").idType(KeyType.IRI).build()))
											.build())
							.qualifiers(Arrays.asList(
									new DefaultQualifierBuilder().value("100")
											.valueId(new DefaultReferenceBuilder()
													.keys(Arrays.asList(new DefaultKeyBuilder()
															.type(KeyElements.GLOBAL_REFERENCE).idType(KeyType.IRI)
															.value("http://acplt.org/ValueId/ExampleValueId").build()))
													.build())
											.valueType("int").type("http://acplt.org/Qualifier/ExampleQualifier")
											.build(),
									new DefaultQualifierBuilder().value("50")
											.valueId(new DefaultReferenceBuilder()
													.keys(Arrays.asList(new DefaultKeyBuilder()
															.type(KeyElements.GLOBAL_REFERENCE).idType(KeyType.IRI)
															.value("http://acplt.org/ValueId/ExampleValueId").build()))
													.build())
											.valueType("int").type("http://acplt.org/Qualifier/ExampleQualifier2")
											.build()))
							.value("ACPLT")
							.valueId(new DefaultReferenceBuilder().keys(Arrays.asList(new DefaultKeyBuilder()
									.type(KeyElements.GLOBAL_REFERENCE).idType(KeyType.IRI)
									.value("http://acplt.org/ValueId/ExampleValueId").build())).build())
							.valueType("string").build(),
					new DefaultPropertyBuilder().idShort("InstanceId").descriptions(Arrays.asList(new LangString(
							"Legally valid designation of the natural or judicial person which is directly responsible for the design, production, packaging and labeling of a product in respect to its being brought into circulation.",
							"en-us"),
							new LangString(
									"Bezeichnung für eine natürliche oder juristische Person, die für die Auslegung, Herstellung und Verpackung sowie die Etikettierung eines Produkts im Hinblick auf das 'Inverkehrbringen' im eigenen Namen verantwortlich ist",
									"de")))
							.semanticId(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
											.value("http://opcfoundation.org/UA/DI/1.1/DeviceType/Serialnumber")
											.idType(KeyType.IRI).build()))
									.build())
							.value("978-8234-234-342")
							.valueId(new DefaultReferenceBuilder().keys(Arrays.asList(
									new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE).idType(KeyType.IRI)
											.value("http://acplt.org/ValueId/ExampleValueId").build()))
									.build())
							.valueType("string").build()))
			.build();

	public static final Submodel SUBMODEL_2 = new DefaultSubmodelBuilder().idShort("BillOfMaterial")
			.descriptions(Arrays.asList(
					new LangString("An example bill of material submodel for the test application", "en-us"),
					new LangString("Ein Beispiel-BillofMaterial-Submodel für eine Test-Anwendung", "de")))
			.identification(new DefaultIdentifierBuilder().idType(IdentifierType.IRI)
					.identifier("http://acplt.org/Submodels/Assets/TestAsset/BillOfMaterial").build())
			.administration(new DefaultAdministrativeInformationBuilder().version("0.9").build())
			.semanticId(new DefaultReferenceBuilder()
					.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.SUBMODEL).idType(KeyType.IRI)
							.value("http://acplt.org/SubmodelTemplates/BillOfMaterial").build()))
					.build())
			.submodelElements(Arrays.asList(
					new DefaultEntityBuilder().idShort("ExampleEntity").descriptions(Arrays.asList(new LangString(
							"Legally valid designation of the natural or judicial person which is directly responsible for the design, production, packaging and labeling of a product in respect to its being brought into circulation.",
							"en-us"),
							new LangString(
									"Bezeichnung für eine natürliche oder juristische Person, die für die Auslegung, Herstellung und Verpackung sowie die Etikettierung eines Produkts im Hinblick auf das 'Inverkehrbringen' im eigenen Namen verantwortlich ist",
									"de")))
							.semanticId(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
											.value("http://opcfoundation.org/UA/DI/1.1/DeviceType/Serialnumber")
											.idType(KeyType.IRI).build()))
									.build())
							.statements(
									Arrays.asList(
											new DefaultPropertyBuilder().idShort("ExampleProperty2")
													.category("CONSTANT")
													.descriptions(Arrays.asList(
															new LangString("Example Property object", "en-us"),
															new LangString("Beispiel Property Element", "de")))
													.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(
															new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
																	.value("http://acplt.org/Properties/ExampleProperty")
																	.idType(KeyType.IRI).build()))
															.build())
													.value("exampleValue2")
													.valueId(new DefaultReferenceBuilder().keys(Arrays.asList(
															new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
																	.idType(KeyType.IRI)
																	.value("http://acplt.org/ValueId/ExampleValueId")
																	.build()))
															.build())
													.valueType("string").build(),
											new DefaultPropertyBuilder().idShort("ExampleProperty").category("CONSTANT")
													.descriptions(Arrays.asList(
															new LangString("Example Property object", "en-us"),
															new LangString("Beispiel Property Element", "de")))
													.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(
															new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
																	.value("http://acplt.org/Properties/ExampleProperty")
																	.idType(KeyType.IRI).build()))
															.build())
													.value("exampleValue")
													.valueId(new DefaultReferenceBuilder().keys(Arrays.asList(
															new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
																	.idType(KeyType.IRI)
																	.value("http://acplt.org/ValueId/ExampleValueId")
																	.build()))
															.build())
													.valueType("string").build()))
							.entityType(EntityType.CO_MANAGED_ENTITY).build(),
					new DefaultEntityBuilder().idShort("ExampleEntity2").descriptions(Arrays.asList(new LangString(
							"Legally valid designation of the natural or judicial person which is directly responsible for the design, production, packaging and labeling of a product in respect to its being brought into circulation.",
							"en-us"),
							new LangString(
									"Bezeichnung für eine natürliche oder juristische Person, die für die Auslegung, Herstellung und Verpackung sowie die Etikettierung eines Produkts im Hinblick auf das 'Inverkehrbringen' im eigenen Namen verantwortlich ist",
									"de")))
							.semanticId(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
											.value("http://opcfoundation.org/UA/DI/1.1/DeviceType/Serialnumber")
											.idType(KeyType.IRI).build()))
									.build())
							.entityType(EntityType.SELF_MANAGED_ENTITY).build()))
			.build();

	public static final Submodel SUBMODEL_3 = new DefaultSubmodelBuilder().idShort("TestSubmodel")
			.descriptions(Arrays.asList(new LangString("An example submodel for the test application", "en-us"),
					new LangString("Ein Beispiel-Teilmodell für eine Test-Anwendung", "de")))
			.identification(new DefaultIdentifierBuilder().idType(IdentifierType.IRI)
					.identifier("https://acplt.org/Test_Submodel").build())
			.administration(new DefaultAdministrativeInformationBuilder().version("0.9").revision("0").build())
			.semanticId(new DefaultReferenceBuilder()
					.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE).idType(KeyType.IRI)
							.value("http://acplt.org/SubmodelTemplates/ExampleSubmodel").build()))
					.build())
			.submodelElements(Arrays.asList(
					new DefaultRelationshipElementBuilder().idShort("ExampleRelationshipElement").category("PARAMETER")
							.descriptions(Arrays.asList(new LangString("Example RelationshipElement object", "en-us"),
									new LangString("Beispiel RelationshipElement Element", "de")))
							.semanticId(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
											.value("http://acplt.org/RelationshipElements/ExampleRelationshipElement")
											.idType(KeyType.IRI).build()))
									.build())
							.first(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
											.value("ExampleProperty").idType(KeyType.IDSHORT).build()))
									.build())
							.second(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
											.value("ExampleProperty2").idType(KeyType.IDSHORT).build()))
									.build())
							.build(),
					new DefaultAnnotatedRelationshipElementBuilder().idShort("ExampleAnnotatedRelationshipElement")
							.category("PARAMETER")
							.descriptions(Arrays.asList(
									new LangString("Example AnnotatedRelationshipElement object", "en-us"),
									new LangString("Beispiel AnnotatedRelationshipElement Element", "de")))
							.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(new DefaultKeyBuilder()
									.type(KeyElements.GLOBAL_REFERENCE)
									.value("http://acplt.org/RelationshipElements/ExampleAnnotatedRelationshipElement")
									.idType(KeyType.IRI).build())).build())
							.first(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
											.value("ExampleProperty").idType(KeyType.IDSHORT).build()))
									.build())
							.second(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
											.value("ExampleProperty2").idType(KeyType.IDSHORT).build()))
									.build())
							.annotations(
									Arrays.asList(new DefaultReferenceBuilder()
											.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
													.value("ExampleProperty3").idType(KeyType.IDSHORT).build()))
											.build()))
							.build(),
					new DefaultOperationBuilder().idShort("ExampleOperation").category("PARAMETER")
							.descriptions(Arrays.asList(new LangString("Example Operation object", "en-us"),
									new LangString("Beispiel Operation Element", "de")))
							.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(new DefaultKeyBuilder()
									.type(KeyElements.GLOBAL_REFERENCE)
									.value("http://acplt.org/Operations/ExampleOperation").idType(KeyType.IRI).build()))
									.build())
							.inputVariables(
									Arrays.asList(new DefaultOperationVariableBuilder()
											.value(new DefaultPropertyBuilder().idShort("ExampleProperty")
													.category("CONSTANT")
													.descriptions(Arrays.asList(
															new LangString("Example Property object", "en-us"),
															new LangString("Beispiel Property Element", "de")))
													.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(
															new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
																	.value("http://acplt.org/Properties/ExampleProperty")
																	.idType(KeyType.IRI).build()))
															.build())
													.value("exampleValue")
													.valueId(new DefaultReferenceBuilder().keys(Arrays.asList(
															new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
																	.idType(KeyType.IRI)
																	.value("http://acplt.org/ValueId/ExampleValueId")
																	.build()))
															.build())
													.valueType("string").build())
											.build()))
							.outputVariables(
									Arrays.asList(new DefaultOperationVariableBuilder()
											.value(new DefaultPropertyBuilder().idShort("ExampleProperty")
													.category("CONSTANT")
													.descriptions(Arrays.asList(
															new LangString("Example Property object", "en-us"),
															new LangString("Beispiel Property Element", "de")))
													.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(
															new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
																	.value("http://acplt.org/Properties/ExampleProperty")
																	.idType(KeyType.IRI).build()))
															.build())
													.value("exampleValue")
													.valueId(new DefaultReferenceBuilder().keys(Arrays.asList(
															new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
																	.idType(KeyType.IRI)
																	.value("http://acplt.org/ValueId/ExampleValueId")
																	.build()))
															.build())
													.valueType("string").build())
											.build()))
							.inoutputVariables(
									Arrays.asList(new DefaultOperationVariableBuilder()
											.value(new DefaultPropertyBuilder().idShort("ExampleProperty")
													.category("CONSTANT")
													.descriptions(Arrays.asList(
															new LangString("Example Property object", "en-us"),
															new LangString("Beispiel Property Element", "de")))
													.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(
															new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
																	.value("http://acplt.org/Properties/ExampleProperty")
																	.idType(KeyType.IRI).build()))
															.build())
													.value("exampleValue")
													.valueId(new DefaultReferenceBuilder().keys(Arrays.asList(
															new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
																	.idType(KeyType.IRI)
																	.value("http://acplt.org/ValueId/ExampleValueId")
																	.build()))
															.build())
													.valueType("string").build())
											.build()))
							.build(),
					new DefaultCapabilityBuilder().idShort("ExampleCapability").category("PARAMETER")
							.descriptions(Arrays.asList(new LangString("Example Capability object", "en-us"),
									new LangString("Beispiel Capability Element", "de")))
							.semanticId(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
											.value("http://acplt.org/Capabilities/ExampleCapability")
											.idType(KeyType.IRI).build()))
									.build())
							.build(),
					new DefaultBasicEventBuilder().idShort("ExampleBasicEvent").category("PARAMETER")
							.descriptions(Arrays.asList(new LangString("Example BasicEvent object", "en-us"),
									new LangString("Beispiel BasicEvent Element", "de")))
							.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(new DefaultKeyBuilder()
									.type(KeyElements.GLOBAL_REFERENCE)
									.value("http://acplt.org/Events/ExampleBasicEvent").idType(KeyType.IRI).build()))
									.build())
							.observed(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
											.idType(KeyType.IDSHORT).value("ExampleProperty").build()))
									.build())
							.build(),
					new DefaultSubmodelElementCollectionBuilder().idShort("ExampleSubmodelCollectionOrdered")
							.category("PARAMETER")
							.descriptions(Arrays.asList(
									new LangString("Example SubmodelElementCollectionOrdered object", "en-us"),
									new LangString("Beispiel SubmodelElementCollectionOrdered Element", "de")))
							.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(new DefaultKeyBuilder()
									.type(KeyElements.GLOBAL_REFERENCE)
									.value("http://acplt.org/SubmodelElementCollections/ExampleSubmodelElementCollectionOrdered")
									.idType(KeyType.IRI).build())).build())
							.values(Arrays.asList(
									new DefaultPropertyBuilder()
											.idShort("ExampleProperty").category("CONSTANT")
											.descriptions(
													Arrays.asList(new LangString("Example Property object", "en-us"),
															new LangString("Beispiel Property Element", "de")))
											.semanticId(new DefaultReferenceBuilder().keys(Arrays
													.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
															.value("http://acplt.org/Properties/ExampleProperty")
															.idType(KeyType.IRI).build()))
													.build())
											.value("exampleValue")
											.valueId(new DefaultReferenceBuilder()
													.keys(Arrays.asList(new DefaultKeyBuilder()
															.type(KeyElements.GLOBAL_REFERENCE).idType(KeyType.IRI)
															.value("http://acplt.org/ValueId/ExampleValueId").build()))
													.build())
											.valueType("string").build(),
									new DefaultMultiLanguagePropertyBuilder().idShort("ExampleMultiLanguageProperty")
											.category("CONSTANT")
											.descriptions(Arrays.asList(
													new LangString("Example MultiLanguageProperty object", "en-us"),
													new LangString("Beispiel MulitLanguageProperty Element", "de")))
											.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(
													new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE).value(
															"http://acplt.org/MultiLanguageProperties/ExampleMultiLanguageProperty")
															.idType(KeyType.IRI).build()))
													.build())
											.values(Arrays.asList(
													new LangString("Example value of a MultiLanguageProperty element",
															"en-us"),
													new LangString(
															"Beispielswert für ein MulitLanguageProperty-Element",
															"de")))
											.valueId(new DefaultReferenceBuilder()
													.keys(Arrays.asList(new DefaultKeyBuilder()
															.type(KeyElements.GLOBAL_REFERENCE).idType(KeyType.IRI)
															.value("http://acplt.org/ValueId/ExampleMultiLanguageValueId")
															.build()))
													.build())
											.build(),
									new DefaultRangeBuilder().idShort("ExampleRange").category("PARAMETER")
											.descriptions(Arrays.asList(new LangString("Example Range object", "en-us"),
													new LangString("Beispiel Range Element", "de")))
											.semanticId(new DefaultReferenceBuilder().keys(Arrays
													.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
															.value("http://acplt.org/Ranges/ExampleRange")
															.idType(KeyType.IRI).build()))
													.build())
											.valueType("int").min("0").max("100").build()))
							.ordered(true).build(),
					new DefaultSubmodelElementCollectionBuilder().idShort("ExampleSubmodelCollectionUnordered")
							.category("PARAMETER")
							.descriptions(Arrays.asList(
									new LangString("Example SubmodelElementCollectionUnordered object", "en-us"),
									new LangString("Beispiel SubmodelElementCollectionUnordered Element", "de")))
							.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(new DefaultKeyBuilder()
									.type(KeyElements.GLOBAL_REFERENCE)
									.value("http://acplt.org/SubmodelElementCollections/ExampleSubmodelElementCollectionUnordered")
									.idType(KeyType.IRI).build())).build())
							.values(Arrays.asList(
									new DefaultBlobBuilder().idShort("ExampleBlob").category("PARAMETER")
											.descriptions(Arrays.asList(
													new LangString("Example Blob object", "en-us"),
													new LangString("Beispiel Blob Element", "de")))
											.semanticId(new DefaultReferenceBuilder().keys(Arrays
													.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
															.value("http://acplt.org/Blobs/ExampleBlob")
															.idType(KeyType.IRI).build()))
													.build())
											.mimeType("application/pdf")
											.value("AQIDBAU=".getBytes())
											.build(),
									new DefaultFileBuilder().idShort("ExampleFile").category("PARAMETER")
											.descriptions(Arrays.asList(new LangString("Example File object", "en-us"),
													new LangString("Beispiel File Element", "de")))
											.semanticId(new DefaultReferenceBuilder().keys(Arrays
													.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
															.value("http://acplt.org/Files/ExampleFile")
															.idType(KeyType.IRI).build()))
													.build())
											.value("/TestFile.pdf").mimeType("application/pdf").build(),
									new DefaultReferenceElementBuilder().idShort("ExampleReferenceElement")
											.category("PARAMETER")
											.descriptions(Arrays.asList(
													new LangString("Example Reference Element object", "en-us"),
													new LangString("Beispiel Reference Element Element", "de")))
											.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(
													new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE).value(
															"http://acplt.org/ReferenceElements/ExampleReferenceElement")
															.idType(KeyType.IRI).build()))
													.build())
											.value(new DefaultReferenceBuilder().keys(
													Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
															.idType(KeyType.IDSHORT).value("ExampleProperty").build()))
													.build())
											.build()))
							.ordered(false).build()))
			.build();

	public static final Submodel SUBMODEL_4 = new DefaultSubmodelBuilder().idShort("")
			.identification(new DefaultIdentifierBuilder().idType(IdentifierType.IRI)
					.identifier("https://acplt.org/Test_Submodel_Mandatory").build())
			.submodelElements(Arrays.asList(
					new DefaultRelationshipElementBuilder().idShort("ExampleRelationshipElement")
							.first(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
											.value("ExampleProperty").idType(KeyType.IDSHORT).build()))
									.build())
							.second(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
											.value("ExampleProperty").idType(KeyType.IDSHORT).build()))
									.build())
							.build(),
					new DefaultAnnotatedRelationshipElementBuilder().idShort("ExampleAnnotatedRelationshipElement")
							.first(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
											.value("ExampleProperty").idType(KeyType.IDSHORT).build()))
									.build())
							.second(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
											.value("ExampleProperty").idType(KeyType.IDSHORT).build()))
									.build())
							.build(),
					new DefaultOperationBuilder().idShort("ExampleOperation").build(),
					new DefaultCapabilityBuilder().idShort("ExampleCapability").build(),
					new DefaultBasicEventBuilder().idShort("ExampleBasicEvent")
							.observed(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
											.idType(KeyType.IDSHORT).value("ExampleProperty").build()))
									.build())
							.build(),
					new DefaultSubmodelElementCollectionBuilder().idShort("ExampleSubmodelCollectionOrdered")
							.values(Arrays.asList(
									new DefaultPropertyBuilder().idShort("ExampleProperty").value(null)
											.valueType("string").build(),
									new DefaultMultiLanguagePropertyBuilder().idShort("ExampleMultiLanguageProperty")
											.build(),
									new DefaultRangeBuilder().idShort("ExampleRange").valueType("int").min(null)
											.max(null).build()))
							.ordered(true).build(),
					new DefaultSubmodelElementCollectionBuilder().idShort("ExampleSubmodelCollectionUnordered")
							.values(Arrays.asList(
									new DefaultBlobBuilder().idShort("ExampleBlob").mimeType("application/pdf").build(),
									new DefaultFileBuilder().idShort("ExampleFile").value(null)
											.mimeType("application/pdf").build(),
									new DefaultReferenceElementBuilder().idShort("ExampleReferenceElement").build()))
							.ordered(false).build(),
					new DefaultSubmodelElementCollectionBuilder().idShort("ExampleSubmodelCollectionUnordered2")
							.ordered(false).build()))
			.build();

	public static final Submodel SUBMODEL_5 = new DefaultSubmodelBuilder().idShort("")
			.identification(new DefaultIdentifierBuilder().idType(IdentifierType.IRI)
					.identifier("https://acplt.org/Test_Submodel2_Mandatory").build())
			.build();

	public static final Submodel SUBMODEL_6 = new DefaultSubmodelBuilder().idShort("TestSubmodel")
			.descriptions(Arrays.asList(new LangString("An example submodel for the test application", "en-us"),
					new LangString("Ein Beispiel-Teilmodell für eine Test-Anwendung", "de")))
			.identification(new DefaultIdentifierBuilder().idType(IdentifierType.IRI)
					.identifier("https://acplt.org/Test_Submodel_Missing").build())
			.administration(new DefaultAdministrativeInformationBuilder().version("0.9").revision("0").build())
			.semanticId(new DefaultReferenceBuilder()
					.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE).idType(KeyType.IRI)
							.value("http://acplt.org/SubmodelTemplates/ExampleSubmodel").build()))
					.build())
			.submodelElements(Arrays.asList(
					new DefaultRelationshipElementBuilder().idShort("ExampleRelationshipElement").category("PARAMETER")
							.descriptions(Arrays.asList(new LangString("Example RelationshipElement object", "en-us"),
									new LangString("Beispiel RelationshipElement Element", "de")))
							.semanticId(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
											.value("http://acplt.org/RelationshipElements/ExampleRelationshipElement")
											.idType(KeyType.IRI).build()))
									.build())
							.first(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
											.value("ExampleProperty").idType(KeyType.IDSHORT).build()))
									.build())
							.second(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
											.value("ExampleProperty").idType(KeyType.IDSHORT).build()))
									.build())
							.build(),
					new DefaultAnnotatedRelationshipElementBuilder().idShort("ExampleAnnotatedRelationshipElement")
							.category("PARAMETER")
							.descriptions(Arrays.asList(
									new LangString("Example AnnotatedRelationshipElement object", "en-us"),
									new LangString("Beispiel AnnotatedRelationshipElement Element", "de")))
							.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(new DefaultKeyBuilder()
									.type(KeyElements.GLOBAL_REFERENCE)
									.value("http://acplt.org/RelationshipElements/ExampleAnnotatedRelationshipElement")
									.idType(KeyType.IRI).build())).build())
							.first(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
											.value("ExampleProperty").idType(KeyType.IDSHORT).build()))
									.build())
							.second(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
											.value("ExampleProperty").idType(KeyType.IDSHORT).build()))
									.build())
							.annotations(
									Arrays.asList(new DefaultReferenceBuilder()
											.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
													.value("ExampleProperty").idType(KeyType.IDSHORT).build()))
											.build()))
							.build(),
					new DefaultOperationBuilder().idShort("ExampleOperation").category("PARAMETER")
							.descriptions(Arrays.asList(new LangString("Example Operation object", "en-us"),
									new LangString("Beispiel Operation Element", "de")))
							.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(new DefaultKeyBuilder()
									.type(KeyElements.GLOBAL_REFERENCE)
									.value("http://acplt.org/Operations/ExampleOperation").idType(KeyType.IRI).build()))
									.build())
							.inputVariables(
									Arrays.asList(new DefaultOperationVariableBuilder().value(
											new DefaultPropertyBuilder().idShort("ExampleProperty").category("CONSTANT")
													.descriptions(Arrays.asList(
															new LangString("Example Property object", "en-us"),
															new LangString("Beispiel Property Element", "de")))
													.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(
															new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
																	.value("http://acplt.org/Properties/ExampleProperty")
																	.idType(KeyType.IRI).build()))
															.build())
													.qualifiers(Arrays
															.asList(new DefaultQualifierBuilder().valueType("string")
																	.type("http://acplt.org/Qualifier/ExampleQualifier")
																	.build()))
													.value("exampleValue").valueType("string").build())
											.build()))
							.outputVariables(
									Arrays.asList(new DefaultOperationVariableBuilder().value(
											new DefaultPropertyBuilder().idShort("ExampleProperty").category("CONSTANT")
													.descriptions(Arrays.asList(
															new LangString("Example Property object", "en-us"),
															new LangString("Beispiel Property Element", "de")))
													.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(
															new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
																	.value("http://acplt.org/Properties/ExampleProperty")
																	.idType(KeyType.IRI).build()))
															.build())
													.qualifiers(Arrays
															.asList(new DefaultQualifierBuilder().valueType("string")
																	.type("http://acplt.org/Qualifier/ExampleQualifier")
																	.build()))
													.value("exampleValue").valueType("string").build())
											.build()))
							.inoutputVariables(
									Arrays.asList(new DefaultOperationVariableBuilder().value(
											new DefaultPropertyBuilder().idShort("ExampleProperty").category("CONSTANT")
													.descriptions(Arrays.asList(
															new LangString("Example Property object", "en-us"),
															new LangString("Beispiel Property Element", "de")))
													.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(
															new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
																	.value("http://acplt.org/Properties/ExampleProperty")
																	.idType(KeyType.IRI).build()))
															.build())
													.qualifiers(Arrays
															.asList(new DefaultQualifierBuilder().valueType("string")
																	.type("http://acplt.org/Qualifier/ExampleQualifier")
																	.build()))
													.value("exampleValue").valueType("string").build())
											.build()))
							.build(),
					new DefaultCapabilityBuilder().idShort("ExampleCapability").category("PARAMETER")
							.descriptions(Arrays.asList(new LangString("Example Capability object", "en-us"),
									new LangString("Beispiel Capability Element", "de")))
							.semanticId(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
											.value("http://acplt.org/Capabilities/ExampleCapability")
											.idType(KeyType.IRI).build()))
									.build())
							.build(),
					new DefaultBasicEventBuilder().idShort("ExampleBasicEvent").category("PARAMETER")
							.descriptions(Arrays.asList(new LangString("Example BasicEvent object", "en-us"),
									new LangString("Beispiel BasicEvent Element", "de")))
							.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(new DefaultKeyBuilder()
									.type(KeyElements.GLOBAL_REFERENCE)
									.value("http://acplt.org/Events/ExampleBasicEvent").idType(KeyType.IRI).build()))
									.build())
							.observed(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
											.idType(KeyType.IDSHORT).value("ExampleProperty").build()))
									.build())
							.build(),
					new DefaultSubmodelElementCollectionBuilder().idShort("ExampleSubmodelCollectionOrdered")
							.category("PARAMETER")
							.descriptions(Arrays.asList(
									new LangString("Example SubmodelElementCollectionOrdered object", "en-us"),
									new LangString("Beispiel SubmodelElementCollectionOrdered Element", "de")))
							.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(new DefaultKeyBuilder()
									.type(KeyElements.GLOBAL_REFERENCE)
									.value("http://acplt.org/SubmodelElementCollections/ExampleSubmodelElementCollectionOrdered")
									.idType(KeyType.IRI).build())).build())
							.values(Arrays.asList(
									new DefaultPropertyBuilder()
											.idShort("ExampleProperty").category("CONSTANT")
											.descriptions(
													Arrays.asList(new LangString("Example Property object", "en-us"),
															new LangString("Beispiel Property Element", "de")))
											.semanticId(new DefaultReferenceBuilder().keys(Arrays
													.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
															.value("http://acplt.org/Properties/ExampleProperty")
															.idType(KeyType.IRI).build()))
													.build())
											.qualifiers(Arrays.asList(new DefaultQualifierBuilder().valueType("string")
													.type("http://acplt.org/Qualifier/ExampleQualifier").build()))
											.value("exampleValue").valueType("string").build(),
									new DefaultMultiLanguagePropertyBuilder().idShort("ExampleMultiLanguageProperty")
											.category("CONSTANT")
											.descriptions(Arrays.asList(
													new LangString("Example MultiLanguageProperty object", "en-us"),
													new LangString("Beispiel MulitLanguageProperty Element", "de")))
											.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(
													new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE).value(
															"http://acplt.org/MultiLanguageProperties/ExampleMultiLanguageProperty")
															.idType(KeyType.IRI).build()))
													.build())
											.values(Arrays.asList(
													new LangString("Example value of a MultiLanguageProperty element",
															"en-us"),
													new LangString(
															"Beispielswert für ein MulitLanguageProperty-Element",
															"de")))
											.build(),
									new DefaultRangeBuilder().idShort("ExampleRange").category("PARAMETER")
											.descriptions(Arrays.asList(new LangString("Example Range object", "en-us"),
													new LangString("Beispiel Range Element", "de")))
											.semanticId(new DefaultReferenceBuilder().keys(Arrays
													.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
															.value("http://acplt.org/Ranges/ExampleRange")
															.idType(KeyType.IRI).build()))
													.build())
											.valueType("int").min("0").max("100").build()))
							.ordered(true).build(),
					new DefaultSubmodelElementCollectionBuilder().idShort("ExampleSubmodelCollectionUnordered")
							.category("PARAMETER")
							.descriptions(Arrays.asList(
									new LangString("Example SubmodelElementCollectionUnordered object", "en-us"),
									new LangString("Beispiel SubmodelElementCollectionUnordered Element", "de")))
							.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(new DefaultKeyBuilder()
									.type(KeyElements.GLOBAL_REFERENCE)
									.value("http://acplt.org/SubmodelElementCollections/ExampleSubmodelElementCollectionUnordered")
									.idType(KeyType.IRI).build())).build())
							.values(Arrays.asList(
									new DefaultBlobBuilder().idShort("ExampleBlob").category("PARAMETER")
											.descriptions(Arrays.asList(
													new LangString("Example Blob object", "en-us"),
													new LangString("Beispiel Blob Element", "de")))
											.semanticId(new DefaultReferenceBuilder().keys(Arrays
													.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
															.value("http://acplt.org/Blobs/ExampleBlob")
															.idType(KeyType.IRI).build()))
													.build())
											.mimeType("application/pdf")
											.value("AQIDBAU=".getBytes())
											.build(),
									new DefaultFileBuilder().idShort("ExampleFile").category("PARAMETER")
											.descriptions(Arrays.asList(new LangString("Example File object", "en-us"),
													new LangString("Beispiel File Element", "de")))
											.semanticId(new DefaultReferenceBuilder().keys(Arrays
													.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
															.value("http://acplt.org/Files/ExampleFile")
															.idType(KeyType.IRI).build()))
													.build())
											.value("/TestFile.pdf").mimeType("application/pdf").build(),
									new DefaultReferenceElementBuilder().idShort("ExampleReferenceElement")
											.category("PARAMETER")
											.descriptions(Arrays.asList(
													new LangString("Example Reference Element object", "en-us"),
													new LangString("Beispiel Reference Element Element", "de")))
											.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(
													new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE).value(
															"http://acplt.org/ReferenceElements/ExampleReferenceElement")
															.idType(KeyType.IRI).build()))
													.build())
											.value(new DefaultReferenceBuilder().keys(
													Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
															.idType(KeyType.IDSHORT).value("ExampleProperty").build()))
													.build())
											.build()))
							.ordered(false).build()))
			.build();

	public static final Submodel SUBMODEL_7 = new DefaultSubmodelBuilder().idShort("TestSubmodel")
			.descriptions(Arrays.asList(new LangString("An example submodel for the test application", "en-us"),
					new LangString("Ein Beispiel-Teilmodell für eine Test-Anwendung", "de")))
			.identification(new DefaultIdentifierBuilder().idType(IdentifierType.IRI)
					.identifier("https://acplt.org/Test_Submodel_Template").build())
			.administration(new DefaultAdministrativeInformationBuilder().version("0.9").revision("0").build())
			.semanticId(new DefaultReferenceBuilder()
					.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE).idType(KeyType.IRI)
							.value("http://acplt.org/SubmodelTemplates/ExampleSubmodel").build()))
					.build())
			.kind(ModelingKind.TEMPLATE)
			.submodelElements(Arrays.asList(
					new DefaultRelationshipElementBuilder().idShort("ExampleRelationshipElement").category("PARAMETER")
							.descriptions(Arrays.asList(new LangString("Example RelationshipElement object", "en-us"),
									new LangString("Beispiel RelationshipElement Element", "de")))
							.semanticId(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
											.value("http://acplt.org/RelationshipElements/ExampleRelationshipElement")
											.idType(KeyType.IRI).build()))
									.build())
							.kind(ModelingKind.TEMPLATE)
							.first(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
											.value("ExampleProperty").idType(KeyType.IDSHORT).build()))
									.build())
							.second(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
											.value("ExampleProperty").idType(KeyType.IDSHORT).build()))
									.build())
							.build(),
					new DefaultAnnotatedRelationshipElementBuilder().idShort("ExampleAnnotatedRelationshipElement")
							.category("PARAMETER")
							.descriptions(Arrays.asList(
									new LangString("Example AnnotatedRelationshipElement object", "en-us"),
									new LangString("Beispiel AnnotatedRelationshipElement Element", "de")))
							.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(new DefaultKeyBuilder()
									.type(KeyElements.GLOBAL_REFERENCE)
									.value("http://acplt.org/RelationshipElements/ExampleAnnotatedRelationshipElement")
									.idType(KeyType.IRI).build())).build())
							.kind(ModelingKind.TEMPLATE)
							.first(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
											.value("ExampleProperty").idType(KeyType.IDSHORT).build()))
									.build())
							.second(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
											.value("ExampleProperty").idType(KeyType.IDSHORT).build()))
									.build())
							.build(),
					new DefaultOperationBuilder().idShort("ExampleOperation").category("PARAMETER")
							.descriptions(Arrays.asList(new LangString("Example Operation object", "en-us"),
									new LangString("Beispiel Operation Element", "de")))
							.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(new DefaultKeyBuilder()
									.type(KeyElements.GLOBAL_REFERENCE)
									.value("http://acplt.org/Operations/ExampleOperation").idType(KeyType.IRI).build()))
									.build())
							.kind(ModelingKind.TEMPLATE)
							.inputVariables(Arrays
									.asList(new DefaultOperationVariableBuilder()
											.value(new DefaultPropertyBuilder().idShort("ExampleProperty")
													.category("CONSTANT")
													.descriptions(Arrays.asList(
															new LangString("Example Property object", "en-us"),
															new LangString("Beispiel Property Element", "de")))
													.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(
															new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
																	.value("http://acplt.org/Properties/ExampleProperty")
																	.idType(KeyType.IRI).build()))
															.build())
													.kind(ModelingKind.TEMPLATE).value(null).valueType("string")
													.build())
											.build()))
							.outputVariables(Arrays
									.asList(new DefaultOperationVariableBuilder()
											.value(new DefaultPropertyBuilder().idShort("ExampleProperty")
													.category("CONSTANT")
													.descriptions(Arrays.asList(
															new LangString("Example Property object", "en-us"),
															new LangString("Beispiel Property Element", "de")))
													.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(
															new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
																	.value("http://acplt.org/Properties/ExampleProperty")
																	.idType(KeyType.IRI).build()))
															.build())
													.kind(ModelingKind.TEMPLATE).value(null).valueType("string")
													.build())
											.build()))
							.inoutputVariables(Arrays
									.asList(new DefaultOperationVariableBuilder()
											.value(new DefaultPropertyBuilder().idShort("ExampleProperty")
													.category("CONSTANT")
													.descriptions(Arrays.asList(
															new LangString("Example Property object", "en-us"),
															new LangString("Beispiel Property Element", "de")))
													.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(
															new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
																	.value("http://acplt.org/Properties/ExampleProperty")
																	.idType(KeyType.IRI).build()))
															.build())
													.kind(ModelingKind.TEMPLATE).value(null).valueType("string")
													.build())
											.build()))
							.build(),
					new DefaultCapabilityBuilder().idShort("ExampleCapability").category("PARAMETER")
							.descriptions(Arrays.asList(new LangString("Example Capability object", "en-us"),
									new LangString("Beispiel Capability Element", "de")))
							.semanticId(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
											.value("http://acplt.org/Capabilities/ExampleCapability")
											.idType(KeyType.IRI).build()))
									.build())
							.kind(ModelingKind.TEMPLATE).build(),
					new DefaultBasicEventBuilder().idShort("ExampleBasicEvent").category("PARAMETER")
							.descriptions(Arrays.asList(new LangString("Example BasicEvent object", "en-us"),
									new LangString("Beispiel BasicEvent Element", "de")))
							.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(new DefaultKeyBuilder()
									.type(KeyElements.GLOBAL_REFERENCE)
									.value("http://acplt.org/Events/ExampleBasicEvent").idType(KeyType.IRI).build()))
									.build())
							.kind(ModelingKind.TEMPLATE)
							.observed(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.PROPERTY)
											.idType(KeyType.IDSHORT).value("ExampleProperty").build()))
									.build())
							.build(),
					new DefaultSubmodelElementCollectionBuilder().idShort("ExampleSubmodelCollectionOrdered")
							.category("PARAMETER")
							.descriptions(Arrays.asList(
									new LangString("Example SubmodelElementCollectionOrdered object", "en-us"),
									new LangString("Beispiel SubmodelElementCollectionOrdered Element", "de")))
							.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(new DefaultKeyBuilder()
									.type(KeyElements.GLOBAL_REFERENCE)
									.value("http://acplt.org/SubmodelElementCollections/ExampleSubmodelElementCollectionOrdered")
									.idType(KeyType.IRI).build())).build())
							.kind(ModelingKind.TEMPLATE)
							.values(Arrays.asList(
									new DefaultPropertyBuilder().idShort("ExampleProperty").category("CONSTANT")
											.descriptions(Arrays.asList(
													new LangString("Example Property object", "en-us"),
													new LangString("Beispiel Property Element", "de")))
											.semanticId(new DefaultReferenceBuilder().keys(Arrays
													.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
															.value("http://acplt.org/Properties/ExampleProperty")
															.idType(KeyType.IRI).build()))
													.build())
											.kind(ModelingKind.TEMPLATE).value(null).valueType("string").build(),
									new DefaultMultiLanguagePropertyBuilder().idShort("ExampleMultiLanguageProperty")
											.category("CONSTANT")
											.descriptions(Arrays.asList(
													new LangString("Example MultiLanguageProperty object", "en-us"),
													new LangString("Beispiel MulitLanguageProperty Element", "de")))
											.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(
													new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE).value(
															"http://acplt.org/MultiLanguageProperties/ExampleMultiLanguageProperty")
															.idType(KeyType.IRI).build()))
													.build())
											.kind(ModelingKind.TEMPLATE).build(),
									new DefaultRangeBuilder().idShort("ExampleRange").category("PARAMETER")
											.descriptions(Arrays.asList(new LangString("Example Range object", "en-us"),
													new LangString("Beispiel Range Element", "de")))
											.semanticId(new DefaultReferenceBuilder().keys(Arrays
													.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
															.value("http://acplt.org/Ranges/ExampleRange")
															.idType(KeyType.IRI).build()))
													.build())
											.kind(ModelingKind.TEMPLATE).valueType("int").min(null).max("100").build(),
									new DefaultRangeBuilder().idShort("ExampleRange2").category("PARAMETER")
											.descriptions(Arrays.asList(new LangString("Example Range object", "en-us"),
													new LangString("Beispiel Range Element", "de")))
											.semanticId(new DefaultReferenceBuilder().keys(Arrays
													.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
															.value("http://acplt.org/Ranges/ExampleRange")
															.idType(KeyType.IRI).build()))
													.build())
											.kind(ModelingKind.TEMPLATE).valueType("int").min("0").max(null).build()))
							.ordered(true).build(),
					new DefaultSubmodelElementCollectionBuilder().idShort("ExampleSubmodelCollectionUnordered")
							.category("PARAMETER")
							.descriptions(Arrays.asList(
									new LangString("Example SubmodelElementCollectionUnordered object", "en-us"),
									new LangString("Beispiel SubmodelElementCollectionUnordered Element", "de")))
							.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(new DefaultKeyBuilder()
									.type(KeyElements.GLOBAL_REFERENCE)
									.value("http://acplt.org/SubmodelElementCollections/ExampleSubmodelElementCollectionUnordered")
									.idType(KeyType.IRI).build())).build())
							.kind(ModelingKind.TEMPLATE)
							.values(Arrays.asList(
									new DefaultBlobBuilder().idShort("ExampleBlob").category("PARAMETER")
											.descriptions(Arrays.asList(new LangString("Example Blob object", "en-us"),
													new LangString("Beispiel Blob Element", "de")))
											.semanticId(new DefaultReferenceBuilder().keys(Arrays
													.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
															.value("http://acplt.org/Blobs/ExampleBlob")
															.idType(KeyType.IRI).build()))
													.build())
											.kind(ModelingKind.TEMPLATE).mimeType("application/pdf").build(),
									new DefaultFileBuilder().idShort("ExampleFile").category("PARAMETER")
											.descriptions(Arrays.asList(new LangString("Example File object", "en-us"),
													new LangString("Beispiel File Element", "de")))
											.semanticId(new DefaultReferenceBuilder().keys(Arrays
													.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
															.value("http://acplt.org/Files/ExampleFile")
															.idType(KeyType.IRI).build()))
													.build())
											.kind(ModelingKind.TEMPLATE).value(null).mimeType("application/pdf")
											.build(),
									new DefaultReferenceElementBuilder().idShort("ExampleReferenceElement")
											.category("PARAMETER")
											.descriptions(Arrays.asList(
													new LangString("Example Reference Element object", "en-us"),
													new LangString("Beispiel Reference Element Element", "de")))
											.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(
													new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE).value(
															"http://acplt.org/ReferenceElements/ExampleReferenceElement")
															.idType(KeyType.IRI).build()))
													.build())
											.kind(ModelingKind.TEMPLATE).build()))
							.ordered(false).build(),
					new DefaultSubmodelElementCollectionBuilder().idShort("ExampleSubmodelCollectionUnordered2")
							.category("PARAMETER")
							.descriptions(Arrays.asList(
									new LangString("Example SubmodelElementCollectionUnordered object", "en-us"),
									new LangString("Beispiel SubmodelElementCollectionUnordered Element", "de")))
							.semanticId(new DefaultReferenceBuilder().keys(Arrays.asList(new DefaultKeyBuilder()
									.type(KeyElements.GLOBAL_REFERENCE)
									.value("http://acplt.org/SubmodelElementCollections/ExampleSubmodelElementCollectionUnordered")
									.idType(KeyType.IRI).build())).build())
							.kind(ModelingKind.TEMPLATE).ordered(false).build()))
			.build();

	public final static Asset ASSET_1 = new DefaultAssetBuilder().idShort("Test_Asset")
			.descriptions(Arrays.asList(new LangString("An example asset for the test application", "en-us"),
					new LangString("Ein Beispiel-Asset für eine Test-Anwendung", "de")))
			.identification(new DefaultIdentifierBuilder().idType(IdentifierType.IRI)
					.identifier("https://acplt.org/Test_Asset").build())
			.administration(new DefaultAdministrativeInformationBuilder().version("0.9").revision("0").build())
			// TODO removed AssetIdentificationModel in full example json
			// TODO removed BillOfMaterial in full example json
			.build();

	public final static Asset ASSET_2 = new DefaultAssetBuilder().idShort("")
			.identification(new DefaultIdentifierBuilder().idType(IdentifierType.IRI)
					.identifier("https://acplt.org/Test_Asset_Mandatory").build())
			.build();

	public final static Asset ASSET_3 = new DefaultAssetBuilder().idShort("Test_Asset")
			.descriptions(Arrays.asList(new LangString("An example asset for the test application", "en-us"),
					new LangString("Ein Beispiel-Asset für eine Test-Anwendung", "de")))
			.identification(new DefaultIdentifierBuilder().idType(IdentifierType.IRI)
					.identifier("https://acplt.org/Test_Asset_Missing").build())
			.administration(new DefaultAdministrativeInformationBuilder().build()).build();

	public final static ConceptDescription CONCEPT_DESCRIPTION_1 = new DefaultConceptDescriptionBuilder()
			.idShort("TestConceptDescription")
			.descriptions(
					Arrays.asList(new LangString("An example concept description  for the test application", "en-us"),
							new LangString("Ein Beispiel-ConceptDescription für eine Test-Anwendung", "de")))
			.identification(new DefaultIdentifierBuilder().idType(IdentifierType.IRI)
					.identifier("https://acplt.org/Test_ConceptDescription").build())
			.administration(new DefaultAdministrativeInformationBuilder().version("0.9").revision("0").build())
			.isCaseOfs(Arrays.asList(new DefaultReferenceBuilder().keys(Arrays.asList(new DefaultKeyBuilder()
					.type(KeyElements.GLOBAL_REFERENCE).idType(KeyType.IRI)
					.value("http://acplt.org/DataSpecifications/ConceptDescriptions/TestConceptDescription").build()))
					.build()))
			.build();

	public final static ConceptDescription CONCEPT_DESCRIPTION_2 = new DefaultConceptDescriptionBuilder().idShort("")
			.identification(new DefaultIdentifierBuilder().idType(IdentifierType.IRI)
					.identifier("https://acplt.org/Test_ConceptDescription_Mandatory").build())
			.build();

	public final static ConceptDescription CONCEPT_DESCRIPTION_3 = new DefaultConceptDescriptionBuilder()
			.idShort("TestConceptDescription")
			.descriptions(
					Arrays.asList(new LangString("An example concept description  for the test application", "en-us"),
							new LangString("Ein Beispiel-ConceptDescription für eine Test-Anwendung", "de")))
			.identification(new DefaultIdentifierBuilder().idType(IdentifierType.IRI)
					.identifier("https://acplt.org/Test_ConceptDescription_Missing").build())
			.administration(new DefaultAdministrativeInformationBuilder().version("0.9").revision("0").build()).build();

	public final static ConceptDescription CONCEPT_DESCRIPTION_4 = new DefaultConceptDescriptionBuilder()
			.idShort("TestSpec_01")
			.identification(new DefaultIdentifierBuilder().idType(IdentifierType.IRI)
					.identifier("http://acplt.org/DataSpecifciations/Example/Identification").build())
			.administration(new DefaultAdministrativeInformationBuilder().version("0.9").revision("0").build())
			.isCaseOfs(
					Arrays.asList(new DefaultReferenceBuilder()
							.keys(Arrays.asList(
									new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE).idType(KeyType.IRI)
											.value("http://acplt.org/ReferenceElements/ConceptDescriptionX").build()))
							.build()))
			.embeddedDataSpecifications(Arrays.asList(new DefaultDataSpecificationBuilder()
					.dataSpecificationContent(new DefaultDataSpecificationIEC61360Builder()
							.preferredNames(Arrays.asList(new LangString("Test Specification", "de"),
									new LangString("TestSpecification", "en-us")))
							.dataType(DataTypeIEC61360.REAL_MEASURE)
							.definitions(Arrays.asList(
									new LangString("Dies ist eine Data Specification für Testzwecke", "de"),
									new LangString("This is a DataSpecification for testing purposes", "en-us")))
							.shortNames(Arrays
									.asList(new LangString("Test Spec", "de"), new LangString("TestSpec", "en-us")))
							.unit("SpaceUnit")
							.unitId(new DefaultReferenceBuilder()
									.keys(Arrays.asList(new DefaultKeyBuilder().type(KeyElements.GLOBAL_REFERENCE)
											.idType(KeyType.IRI).value("http://acplt.org/Units/SpaceUnit").build()))
									.build())
							.sourceOfDefinition("http://acplt.org/DataSpec/ExampleDef").symbol("SU")
							.valueFormat("string").value("TEST").levelTypes(Arrays.asList(LevelType.MIN, LevelType.MAX))
							.valueList(new DefaultValueListBuilder().valueReferencePairTypes(Arrays.asList(
									new DefaultValueReferencePairBuilder().value("exampleValue")
											.valueId(new DefaultReferenceBuilder()
													.keys(Arrays.asList(new DefaultKeyBuilder()
															.type(KeyElements.GLOBAL_REFERENCE).idType(KeyType.IRI)
															.value("http://acplt.org/ValueId/ExampleValueId").build()))
													.build())
											// TODO valueType
											.build(),
									new DefaultValueReferencePairBuilder().value("exampleValue2")
											.valueId(new DefaultReferenceBuilder()
													.keys(Arrays.asList(new DefaultKeyBuilder()
															.type(KeyElements.GLOBAL_REFERENCE).idType(KeyType.IRI)
															.value("http://acplt.org/ValueId/ExampleValueId2").build()))
													.build())
											// TODO valueType
											.build()))
									.build())
							.build())
					.build()))
			.build();

	public static final AssetAdministrationShellEnvironment ENVIRONMENT = new DefaultAssetAdministrationShellEnvironmentBuilder()
			.assetAdministrationShells(Arrays.asList(AAS_1, AAS_2, AAS_3, AAS_4))
			.submodels(
					Arrays.asList(SUBMODEL_1, SUBMODEL_2, SUBMODEL_3, SUBMODEL_4, SUBMODEL_5, SUBMODEL_6, SUBMODEL_7))
			.conceptDescriptions(Arrays.asList(CONCEPT_DESCRIPTION_1, CONCEPT_DESCRIPTION_2, CONCEPT_DESCRIPTION_3,
					CONCEPT_DESCRIPTION_4))
			.assets(Arrays.asList(ASSET_1, ASSET_2, ASSET_3)).build();
}
