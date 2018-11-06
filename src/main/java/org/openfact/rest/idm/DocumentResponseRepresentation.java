package org.openfact.rest.idm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@ApiModel(subTypes = {Invoice.class, CreditNote.class, DebitNote.class})
public class DocumentResponseRepresentation {

    @ApiModelProperty(
            value = "ID único del comprobante",
            example = "ab84523c-85d9-4545-b679-ba9522a1ed1f"
    )
    private String id;

    @ApiModelProperty(
            value = "Serie y número del comprobante",
            example = "F001-1"
    )
    private String documentId;

    @ApiModelProperty(
            value = "Tipo de comprobante",
            allowableValues = "INVOICE, CREDIT_NOTE, DEBIT_NOTE, PERCEPTION, RETENTION, VOIDED_DOCUMENTS, SUMMARY_DOCUMENTS",
            example = "INVOICE"
    )
    private String documentType;

    @ApiModelProperty(
            value = "Fecha en el que el comprobante se envió a OPENFACT",
            example = "2018-11-06T13:12:12.924+0000"
    )
    private Date createdTimestamp;

    @ApiModelProperty(
            value = "Fecha en el que el comprobante se creó. Esta fecha será utilizada para declarar a la SUNAT",
            example = "2018-11-06T05:00:00.000+0000"
    )
    private Date issueDate;

    @ApiModelProperty(
            value = "Moneda del comprobante"
    )
    private String documentCurrencyCode;

    @ApiModelProperty(
            value = "Nombre del cliente"
    )
    private String customerRegistrationName;

    @ApiModelProperty(
            value = "Número de documento del cliente"
    )
    private String customerAssignedAccountId;

    @ApiModelProperty(
            value = "Correo electrónico del cliente"
    )
    private String customerElectronicMail;

    @ApiModelProperty(
            value = "Estado del comprobante en la SUNAT",
            allowableValues = "ACEPTADO, RECHAZADO, BAJA, EXCEPCION, EN_PROCESO",
            example = "ACEPTADO"
    )
    private String status;

    @ApiModelProperty(
            value = "Código del estado del comprobante en la SUNAT. Los valores son números entre 0 y 5000",
            example = "0"
    )
    private Integer statusCode;

    @ApiModelProperty(
            value = "Mensaje del estado del comprobante en la SUNAT.",
            example = "Comprobante fue aceptado"
    )
    private String statusMessage;

    @ApiModelProperty(
            value = "Válido solo para boletas. Determina si una boleta fue marcada para ser dada de baja o no"
    )
    private boolean summaryVoided;

    @ApiModelProperty(
            value = "Válido solo para boletas. Determina si una boleta fue marcada para ser dada de baja o no"
    )
    private boolean bajaEnProceso;

    @ApiModelProperty(
            value = "Determina si el comprobante se puede o no editar. Si FALSE entonces se puede editar y su firma electrónica todavia no es válida",
            example = "Comprobante fue aceptado"
    )
    private boolean closed;

    @ApiModelProperty(
            value = "Conjunto de informacion extra que el comprobante guarda. Esta información varía dependiendo del documento"
    )
    private Map<String, List<String>> attributes;

    @ApiModelProperty(
            value = "Conjunto de acciones pendientes en el comprobante.",
            allowableValues = "SEND_TO_THIRD_PARTY, SEND_TO_CUSTOMER, CONSULTAR_TICKET",
            example = "SEND_TO_THIRD_PARTY"
    )
    private Set<String> requiredActions;

    @ApiModelProperty(
            value = "Lista de comprobantes afectados por el presente comprobante"
    )
    private List<DocumentResponseRepresentation> attachedDocumentsAsOrigin;

    @ApiModelProperty(
            value = "Lista de comprobantes que afectan al presente comprobante"
    )
    private List<DocumentResponseRepresentation> attachedDocumentsAsDestiny;

    @ApiModelProperty(
            value = "Lista de productos o servicios contenidos dentro del comprobante de pago"
    )
    private List<Map<String, String>> documentLines;

    @ApiModelProperty(
            value = "HASH de la firma digital del comprobante electrónico"
    )
    private String xmlDigestValue;

    private String xmlBase64;
    private String pdfBase64;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public String getCustomerRegistrationName() {
        return customerRegistrationName;
    }

    public void setCustomerRegistrationName(String customerRegistrationName) {
        this.customerRegistrationName = customerRegistrationName;
    }

    public String getCustomerAssignedAccountId() {
        return customerAssignedAccountId;
    }

    public void setCustomerAssignedAccountId(String customerAssignedAccountId) {
        this.customerAssignedAccountId = customerAssignedAccountId;
    }

    public String getCustomerElectronicMail() {
        return customerElectronicMail;
    }

    public void setCustomerElectronicMail(String customerElectronicMail) {
        this.customerElectronicMail = customerElectronicMail;
    }

    public Map<String, List<String>> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, List<String>> attributes) {
        this.attributes = attributes;
    }

    public Set<String> getRequiredActions() {
        return requiredActions;
    }

    public void setRequiredActions(Set<String> requiredActions) {
        this.requiredActions = requiredActions;
    }

    public List<DocumentResponseRepresentation> getAttachedDocumentsAsOrigin() {
        return attachedDocumentsAsOrigin;
    }

    public void setAttachedDocumentsAsOrigin(List<DocumentResponseRepresentation> attachedDocumentsAsOrigin) {
        this.attachedDocumentsAsOrigin = attachedDocumentsAsOrigin;
    }

    public String getDocumentCurrencyCode() {
        return documentCurrencyCode;
    }

    public void setDocumentCurrencyCode(String documentCurrencyCode) {
        this.documentCurrencyCode = documentCurrencyCode;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public List<DocumentResponseRepresentation> getAttachedDocumentsAsDestiny() {
        return attachedDocumentsAsDestiny;
    }

    public void setAttachedDocumentsAsDestiny(List<DocumentResponseRepresentation> attachedDocumentsAsDestiny) {
        this.attachedDocumentsAsDestiny = attachedDocumentsAsDestiny;
    }

    public List<Map<String, String>> getDocumentLines() {
        return documentLines;
    }

    public void setDocumentLines(List<Map<String, String>> documentLines) {
        this.documentLines = documentLines;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public boolean isSummaryVoided() {
        return summaryVoided;
    }

    public void setSummaryVoided(boolean summaryVoided) {
        this.summaryVoided = summaryVoided;
    }

    public String getXmlBase64() {
        return xmlBase64;
    }

    public void setXmlBase64(String xmlBase64) {
        this.xmlBase64 = xmlBase64;
    }

    public String getPdfBase64() {
        return pdfBase64;
    }

    public void setPdfBase64(String pdfBase64) {
        this.pdfBase64 = pdfBase64;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public boolean isBajaEnProceso() {
        return bajaEnProceso;
    }

    public void setBajaEnProceso(boolean bajaEnProceso) {
        this.bajaEnProceso = bajaEnProceso;
    }

    public String getXmlDigestValue() {
        return xmlDigestValue;
    }

    public void setXmlDigestValue(String xmlDigestValue) {
        this.xmlDigestValue = xmlDigestValue;
    }
}