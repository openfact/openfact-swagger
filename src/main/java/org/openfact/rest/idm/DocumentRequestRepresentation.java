package org.openfact.rest.idm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@ApiModel(subTypes = {InvoiceRequestRepresentation.class, CreditNoteRequestRepresentation.class, DebitNoteRequestRepresentation.class})
public class DocumentRequestRepresentation {

    @ApiModelProperty(
            value = "Código de tipo de documento (Catalogo 01) - Campo: InvoiceTypeCode.",
            allowableValues = "01, 03, 07, 08, 09, 20, 40",
            required = true
    )
    protected String tipo;

    @ApiModelProperty(
            value = "Serie del comprobante. Debe de tener exactamente 4 dígitos.",
            example = "F001"
    )
    protected String serie;

    @ApiModelProperty(
            value = "Número del comprobante. Debe de tener mínimo:1 y máximo: 8 dígitos.",
            example = "1"
    )
    protected String numero;

    @ApiModelProperty(
            value = "Número de documento del cliente. Puede ser número de: DNI, RUC, etc.",
            example = "46779354",
            required = true
    )
    protected String entidadNumeroDeDocumento;

    @ApiModelProperty(
            value = "Tipo de documento del cliente (Catálogo 06) - Campo: AdditionalAccountID.",
            example = "1",
            required = true
    )
    protected String entidadTipoDeDocumento;

    @ApiModelProperty(
            value = "Nombre o Razón Social del cliente.",
            example = "Carlos Feria Vila",
            required = true
    )
    protected String entidadDenominacion;

    @ApiModelProperty(
            value = "Dirección domiciliaria del cliente.",
            example = "Av. Universitaria 1582"
    )
    protected String entidadDireccion;

    @ApiModelProperty(
            value = "Correo electrónico del cliente.",
            example = "carlosthe19916@gmail.com"
    )
    protected String entidadEmail;

    @ApiModelProperty(
            value = "Fecha de emisión del comprobante. Debe de estar en formato yyyy-MM-ddTHH:MM:SSZ",
            example = "2018-09-18T21:38:53.377Z"
    )
    protected Date fechaDeEmision;

    @ApiModelProperty(
            value = "Moneda en la que emite el comprobante (ISO 4217) - https://en.wikipedia.org/wiki/ISO_4217",
            example = "PEN",
            allowableValues = "PEN, USD, EUR",
            required = true
    )
    protected String moneda;

    @ApiModelProperty(
            value = "Tipo de cambio de la moneda extranjera. Solo es usado en caso el comprobante es emitido en moneda extrajera.",
            example = "3.21"
    )
    protected BigDecimal tipoDeCambio;

    @ApiModelProperty(
            value = "Si la operación es gratuita o no. Usado en caso de donaciones por ejemplo."
    )
    protected boolean operacionGratuita;

    @ApiModelProperty(
            value = "Total de operaciones gravadas.",
            required = true
    )
    protected BigDecimal totalGravada;

    @ApiModelProperty(
            value = "Total de operaciones inafectas.",
            required = true
    )
    protected BigDecimal totalInafecta;

    @ApiModelProperty(
            value = "Total de operaciones exoneradas.",
            required = true
    )
    protected BigDecimal totalExonerada;

    @ApiModelProperty(
            value = "Total de operaciones gratuitas.",
            required = true
    )
    protected BigDecimal totalGratuita;

    @ApiModelProperty(
            value = "Monto total de IGV.",
            required = true
    )
    protected BigDecimal totalIgv;

    @ApiModelProperty(
            value = "Descuento Global."
    )
    protected BigDecimal descuentoGlobal;

    @ApiModelProperty(
            value = "Otros Cargos."
    )
    protected BigDecimal totalOtrosCargos;


    @ApiModelProperty(
            value = "Monto total del comprobante.",
            required = true
    )
    protected BigDecimal total;

    @ApiModelProperty(
            value = "Observaciones del comprobante."
    )
    protected String observaciones;

    @ApiModelProperty(
            value = "true: el comprobante se envia a la SUNAT. false: el comprobante no es enviado a la SUNAT y puede ser editado."
    )
    protected boolean enviarAutomaticamenteASunat;

    @ApiModelProperty(
            value = "Si true: el comprobante se envia al correo especificado en el campo 'entidadEmail'."
    )
    protected boolean enviarAutomaticamenteAlCliente;

    @ApiModelProperty(
            value = "Lista de productos o servicios."
    )
    protected List<DocumentLineRequestRepresentation> detalle;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEntidadNumeroDeDocumento() {
        return entidadNumeroDeDocumento;
    }

    public void setEntidadNumeroDeDocumento(String entidadNumeroDeDocumento) {
        this.entidadNumeroDeDocumento = entidadNumeroDeDocumento;
    }

    public String getEntidadTipoDeDocumento() {
        return entidadTipoDeDocumento;
    }

    public void setEntidadTipoDeDocumento(String entidadTipoDeDocumento) {
        this.entidadTipoDeDocumento = entidadTipoDeDocumento;
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

    public Date getFechaDeEmision() {
        return fechaDeEmision;
    }

    public void setFechaDeEmision(Date fechaDeEmision) {
        this.fechaDeEmision = fechaDeEmision;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public BigDecimal getTipoDeCambio() {
        return tipoDeCambio;
    }

    public void setTipoDeCambio(BigDecimal tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
    }

    public boolean isOperacionGratuita() {
        return operacionGratuita;
    }

    public void setOperacionGratuita(boolean operacionGratuita) {
        this.operacionGratuita = operacionGratuita;
    }

    public BigDecimal getTotalGravada() {
        return totalGravada;
    }

    public void setTotalGravada(BigDecimal totalGravada) {
        this.totalGravada = totalGravada;
    }

    public BigDecimal getTotalInafecta() {
        return totalInafecta;
    }

    public void setTotalInafecta(BigDecimal totalInafecta) {
        this.totalInafecta = totalInafecta;
    }

    public BigDecimal getTotalExonerada() {
        return totalExonerada;
    }

    public void setTotalExonerada(BigDecimal totalExonerada) {
        this.totalExonerada = totalExonerada;
    }

    public BigDecimal getTotalGratuita() {
        return totalGratuita;
    }

    public void setTotalGratuita(BigDecimal totalGratuita) {
        this.totalGratuita = totalGratuita;
    }

    public BigDecimal getTotalIgv() {
        return totalIgv;
    }

    public void setTotalIgv(BigDecimal totalIgv) {
        this.totalIgv = totalIgv;
    }

    public BigDecimal getDescuentoGlobal() {
        return descuentoGlobal;
    }

    public void setDescuentoGlobal(BigDecimal descuentoGlobal) {
        this.descuentoGlobal = descuentoGlobal;
    }

    public BigDecimal getTotalOtrosCargos() {
        return totalOtrosCargos;
    }

    public void setTotalOtrosCargos(BigDecimal totalOtrosCargos) {
        this.totalOtrosCargos = totalOtrosCargos;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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

    public List<DocumentLineRequestRepresentation> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DocumentLineRequestRepresentation> detalle) {
        this.detalle = detalle;
    }
}