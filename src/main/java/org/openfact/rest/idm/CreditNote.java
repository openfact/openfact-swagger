package org.openfact.rest.idm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Modelo para crear notas de crédito.")
public class CreditNote extends DocumentRequestRepresentation {

    @ApiModelProperty(
            value = "Serie y número del comprobante al que se aplica la nota de crédito.",
            example = "F001-00000001"
    )
    protected String documentoQueSeModifica;

    @ApiModelProperty(
            value = "Código del tipo de nota de crédito. Catalogo 09",
            allowableValues = "01,02,03,04,05,06,07",
            example = "01"
    )
    protected String tipoDeNotaDeCredito;

    public String getDocumentoQueSeModifica() {
        return documentoQueSeModifica;
    }

    public void setDocumentoQueSeModifica(String documentoQueSeModifica) {
        this.documentoQueSeModifica = documentoQueSeModifica;
    }

    public String getTipoDeNotaDeCredito() {
        return tipoDeNotaDeCredito;
    }

    public void setTipoDeNotaDeCredito(String tipoDeNotaDeCredito) {
        this.tipoDeNotaDeCredito = tipoDeNotaDeCredito;
    }
}