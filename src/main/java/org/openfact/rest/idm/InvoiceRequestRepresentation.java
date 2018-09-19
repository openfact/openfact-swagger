package org.openfact.rest.idm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(description = "Modelo para crear boletas/facturas.")
public class InvoiceRequestRepresentation extends DocumentRequestRepresentation {

    @ApiModelProperty(
            value = "Fecha de vencimiento del comprobante.",
            example = "2018-09-18T21:38:53.377Z"
    )
    protected Date fechaDeVencimiento;

    @ApiModelProperty(
            value = "Guia de remision asociada al comprobante."
    )
    protected SunatDespatchAdviceRepresentation despatchAdvice;

    public Date getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(Date fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public SunatDespatchAdviceRepresentation getDespatchAdvice() {
        return despatchAdvice;
    }

    public void setDespatchAdvice(SunatDespatchAdviceRepresentation despatchAdvice) {
        this.despatchAdvice = despatchAdvice;
    }
}