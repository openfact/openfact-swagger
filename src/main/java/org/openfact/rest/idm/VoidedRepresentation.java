package org.openfact.rest.idm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(description = "Modelo para enviar bajas de comprobantes.")
public class VoidedRepresentation {

    @ApiModelProperty(
            value = "Poner true en caso desee enviar a la SUNAT",
            example = "true",
            required = true
    )
    private boolean enviarAutomaticamenteASunat;

    @ApiModelProperty(
            value = "Observaciones"
    )
    private String observaciones;

    @ApiModelProperty(
            value = "Lista de comprobantes a dar de baja",
            required = true
    )
    private List<VoidedLineRepresentation> detalle;

    public boolean isEnviarAutomaticamenteASunat() {
        return enviarAutomaticamenteASunat;
    }

    public void setEnviarAutomaticamenteASunat(boolean enviarAutomaticamenteASunat) {
        this.enviarAutomaticamenteASunat = enviarAutomaticamenteASunat;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public List<VoidedLineRepresentation> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<VoidedLineRepresentation> detalle) {
        this.detalle = detalle;
    }
}
