package org.openfact.rest.idm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(description = "Modelo para crear boletas/facturas.")
public class Invoice extends DocumentRequestRepresentation {

    @ApiModelProperty(
            value = "Fecha de vencimiento del comprobante.",
            example = "2018-09-18T21:38:53.377Z"
    )
    protected Date fechaDeVencimiento;

    @ApiModelProperty(
            value = "Guia de remision asociada al comprobante."
    )
    protected DespatchAdvice despatchAdvice;

    public Date getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(Date fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public DespatchAdvice getDespatchAdvice() {
        return despatchAdvice;
    }

    public void setDespatchAdvice(DespatchAdvice despatchAdvice) {
        this.despatchAdvice = despatchAdvice;
    }
}