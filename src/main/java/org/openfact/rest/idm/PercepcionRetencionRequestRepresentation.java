package org.openfact.rest.idm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@ApiModel(description = "Modelo para crear percepciones y retenciones.")
public class PercepcionRetencionRequestRepresentation {

    @ApiModelProperty(
            value = "Tipo de documento del cliente (Catálogo 06) - Campo: AdditionalAccountID.",
            example = "1",
            required = true
    )
    private String entidadTipoDeDocumento;

    @ApiModelProperty(
            value = "Número de documento del cliente. Puede ser número de: DNI, RUC, etc.",
            example = "46779354",
            required = true
    )
    private String entidadNumeroDeDocumento;

    @ApiModelProperty(
            value = "Nombre o Razón Social del cliente.",
            example = "Carlos Feria Vila",
            required = true
    )
    private String entidadDenominacion;

    @ApiModelProperty(
            value = "Dirección domiciliaria del cliente.",
            example = "Av. Universitaria 1582"
    )
    private String entidadDireccion;

    @ApiModelProperty(
            value = "Correo electrónico del cliente.",
            example = "carlosthe19916@gmail.com"
    )
    private String entidadEmail;

    @ApiModelProperty(
            value = "Serie del comprobante. Debe de tener exactamente 4 dígitos.",
            example = "R001"
    )
    private String serieDocumento;


    @ApiModelProperty(
            value = "Número del comprobante. Debe de tener mínimo:1 y máximo: 8 dígitos.",
            example = "1"
    )
    private String numeroDocumento;

    @ApiModelProperty(
            value = "Moneda en la que emite el comprobante (ISO 4217) - https://en.wikipedia.org/wiki/ISO_4217",
            example = "PEN",
            allowableValues = "PEN, USD, EUR",
            required = true
    )
    private String monedaDocumento;

    @ApiModelProperty(
            value = "Fecha de emisión del comprobante. Debe de estar en formato yyyy-MM-ddTHH:MM:SSZ",
            example = "2018-09-18T21:38:53.377Z"
    )
    private Date fechaDeEmision;

    @ApiModelProperty(
            value = "Regimen de percepcion/retencion Catalogo 22/23",
            example = "01",
            required = true
    )
    private String codigoDocumento;

    @ApiModelProperty(
            value = "Valor porcentual del régimen de percepcion/retención.",
            example = "3",
            required = true
    )
    private BigDecimal tasaDocumento;

    @ApiModelProperty(
            value = "Monto total pagado/cobrado.",
            example = "3",
            required = true
    )
    private BigDecimal totalPago;

    @ApiModelProperty(
            value = "Monto total retenido/percibido.",
            example = "3",
            required = true
    )
    private BigDecimal totalDocumentoSunat;

    @ApiModelProperty(
            value = "true: el comprobante se envia a la SUNAT. false: el comprobante no es enviado a la SUNAT y puede ser editado."
    )
    private boolean enviarAutomaticamenteASunat;

    @ApiModelProperty(
            value = "Si true: el comprobante se envia al correo especificado en el campo 'entidadEmail'."
    )
    private boolean enviarAutomaticamenteAlCliente;

    @ApiModelProperty(
            value = "Observaciones del comprobante."
    )
    private String observaciones;

    private List<PerceptionRetentionLineRequestRepresentation> detalle;

    public String getEntidadTipoDeDocumento() {
        return entidadTipoDeDocumento;
    }

    public void setEntidadTipoDeDocumento(String entidadTipoDeDocumento) {
        this.entidadTipoDeDocumento = entidadTipoDeDocumento;
    }

    public String getEntidadNumeroDeDocumento() {
        return entidadNumeroDeDocumento;
    }

    public void setEntidadNumeroDeDocumento(String entidadNumeroDeDocumento) {
        this.entidadNumeroDeDocumento = entidadNumeroDeDocumento;
    }

    public String getEntidadDenominacion() {
        return entidadDenominacion;
    }

    public void setEntidadDenominacion(String entidadDenominacion) {
        this.entidadDenominacion = entidadDenominacion;
    }

    public String getEntidadDireccion() {
        return entidadDireccion;
    }

    public void setEntidadDireccion(String entidadDireccion) {
        this.entidadDireccion = entidadDireccion;
    }

    public String getEntidadEmail() {
        return entidadEmail;
    }

    public void setEntidadEmail(String entidadEmail) {
        this.entidadEmail = entidadEmail;
    }

    public String getSerieDocumento() {
        return serieDocumento;
    }

    public void setSerieDocumento(String serieDocumento) {
        this.serieDocumento = serieDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getMonedaDocumento() {
        return monedaDocumento;
    }

    public void setMonedaDocumento(String monedaDocumento) {
        this.monedaDocumento = monedaDocumento;
    }

    public String getCodigoDocumento() {
        return codigoDocumento;
    }

    public void setCodigoDocumento(String codigoDocumento) {
        this.codigoDocumento = codigoDocumento;
    }

    public BigDecimal getTasaDocumento() {
        return tasaDocumento;
    }

    public void setTasaDocumento(BigDecimal tasaDocumento) {
        this.tasaDocumento = tasaDocumento;
    }

    public boolean isEnviarAutomaticamenteASunat() {
        return enviarAutomaticamenteASunat;
    }

    public void setEnviarAutomaticamenteASunat(boolean enviarAutomaticamenteASunat) {
        this.enviarAutomaticamenteASunat = enviarAutomaticamenteASunat;
    }

    public boolean isEnviarAutomaticamenteAlCliente() {
        return enviarAutomaticamenteAlCliente;
    }

    public void setEnviarAutomaticamenteAlCliente(boolean enviarAutomaticamenteAlCliente) {
        this.enviarAutomaticamenteAlCliente = enviarAutomaticamenteAlCliente;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public BigDecimal getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(BigDecimal totalPago) {
        this.totalPago = totalPago;
    }

    public BigDecimal getTotalDocumentoSunat() {
        return totalDocumentoSunat;
    }

    public void setTotalDocumentoSunat(BigDecimal totalDocumentoSunat) {
        this.totalDocumentoSunat = totalDocumentoSunat;
    }

    public Date getFechaDeEmision() {
        return fechaDeEmision;
    }

    public void setFechaDeEmision(Date fechaDeEmision) {
        this.fechaDeEmision = fechaDeEmision;
    }

    public List<PerceptionRetentionLineRequestRepresentation> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<PerceptionRetentionLineRequestRepresentation> detalle) {
        this.detalle = detalle;
    }

}
