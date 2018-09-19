package org.openfact.rest.idm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Modelo para crear notas de débito.")
public class DebitNoteRequestRepresentation extends DocumentRequestRepresentation {

    @ApiModelProperty(
            value = "Serie y número del comprobante al que se aplica la nota de débito.",
            example = "F001-00000001"
    )
    protected String documentoQueSeModifica;

    @ApiModelProperty(
            value = "Código del tipo de nota de débito. Catalogo 10",
            allowableValues = "01,02,03",
            example = "01"
    )
    protected String tipoDeNotaDeDebito;

    public String getDocumentoQueSeModifica() {
        return documentoQueSeModifica;
    }

    public void setDocumentoQueSeModifica(String documentoQueSeModifica) {
        this.documentoQueSeModifica = documentoQueSeModifica;
    }

    public String getTipoDeNotaDeDebito() {
        return tipoDeNotaDeDebito;
    }

    public void setTipoDeNotaDeDebito(String tipoDeNotaDeDebito) {
        this.tipoDeNotaDeDebito = tipoDeNotaDeDebito;
    }

}