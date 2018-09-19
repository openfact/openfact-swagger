package org.openfact.rest.idm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Comprobante a dar de baja")
public class VoidedDocumentLine {

    @ApiModelProperty(
            value = "Código de tipo de documento (Catalogo 01)",
            example = "01",
            required = true
    )
    private String tipoDocumentoRelacionado;

    @ApiModelProperty(
            value = "Serie y número del comprobante a dar de baja",
            example = "F001-00000001",
            required = true
    )
    private String numeroDocumentoRelacionado;

    @ApiModelProperty(
            value = "Razón por la que se da de baja este comprobante",
            example = "Error en el monto",
            required = true
    )
    protected String descripcionDocumentoRelacionado;

    public String getTipoDocumentoRelacionado() {
        return tipoDocumentoRelacionado;
    }

    public void setTipoDocumentoRelacionado(String tipoDocumentoRelacionado) {
        this.tipoDocumentoRelacionado = tipoDocumentoRelacionado;
    }

    public String getNumeroDocumentoRelacionado() {
        return numeroDocumentoRelacionado;
    }

    public void setNumeroDocumentoRelacionado(String numeroDocumentoRelacionado) {
        this.numeroDocumentoRelacionado = numeroDocumentoRelacionado;
    }

    public String getDescripcionDocumentoRelacionado() {
        return descripcionDocumentoRelacionado;
    }

    public void setDescripcionDocumentoRelacionado(String descripcionDocumentoRelacionado) {
        this.descripcionDocumentoRelacionado = descripcionDocumentoRelacionado;
    }

}
