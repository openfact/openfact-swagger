
# DocumentResponseRepresentation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID único del comprobante |  [optional]
**documentId** | **String** | Serie y número del comprobante |  [optional]
**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) | Tipo de comprobante |  [optional]
**createdTimestamp** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha en el que el comprobante se envió a OPENFACT |  [optional]
**issueDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha en el que el comprobante se creó. Esta fecha será utilizada para declarar a la SUNAT |  [optional]
**documentCurrencyCode** | **String** | Moneda del comprobante |  [optional]
**customerRegistrationName** | **String** | Nombre del cliente |  [optional]
**customerAssignedAccountId** | **String** | Número de documento del cliente |  [optional]
**customerElectronicMail** | **String** | Correo electrónico del cliente |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Estado del comprobante en la SUNAT |  [optional]
**statusCode** | **Integer** | Código del estado del comprobante en la SUNAT. Los valores son números entre 0 y 5000 |  [optional]
**statusMessage** | **String** | Mensaje del estado del comprobante en la SUNAT. |  [optional]
**summaryVoided** | **Boolean** | Válido solo para boletas. Determina si una boleta fue marcada para ser dada de baja o no |  [optional]
**bajaEnProceso** | **Boolean** | Válido solo para boletas. Determina si una boleta fue marcada para ser dada de baja o no |  [optional]
**closed** | **Boolean** | Determina si el comprobante se puede o no editar. Si FALSE entonces se puede editar y su firma electrónica todavia no es válida |  [optional]
**attributes** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | Conjunto de informacion extra que el comprobante guarda. Esta información varía dependiendo del documento |  [optional]
**requiredActions** | **List&lt;String&gt;** | Conjunto de acciones pendientes en el comprobante. |  [optional]
**attachedDocumentsAsOrigin** | [**List&lt;DocumentResponseRepresentation&gt;**](DocumentResponseRepresentation.md) | Lista de comprobantes afectados por el presente comprobante |  [optional]
**attachedDocumentsAsDestiny** | [**List&lt;DocumentResponseRepresentation&gt;**](DocumentResponseRepresentation.md) | Lista de comprobantes que afectan al presente comprobante |  [optional]
**documentLines** | [**List&lt;Map&lt;String, String&gt;&gt;**](Map.md) | Lista de productos o servicios contenidos dentro del comprobante de pago |  [optional]
**xmlDigestValue** | **String** | HASH de la firma digital del comprobante electrónico |  [optional]
**xmlBase64** | **String** |  |  [optional]
**pdfBase64** | **String** |  |  [optional]


<a name="DocumentTypeEnum"></a>
## Enum: DocumentTypeEnum
Name | Value
---- | -----
INVOICE | &quot;INVOICE&quot;
CREDIT_NOTE | &quot;CREDIT_NOTE&quot;
DEBIT_NOTE | &quot;DEBIT_NOTE&quot;
PERCEPTION | &quot;PERCEPTION&quot;
RETENTION | &quot;RETENTION&quot;
VOIDED_DOCUMENTS | &quot;VOIDED_DOCUMENTS&quot;
SUMMARY_DOCUMENTS | &quot;SUMMARY_DOCUMENTS&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACEPTADO | &quot;ACEPTADO&quot;
RECHAZADO | &quot;RECHAZADO&quot;
BAJA | &quot;BAJA&quot;
EXCEPCION | &quot;EXCEPCION&quot;
EN_PROCESO | &quot;EN_PROCESO&quot;



