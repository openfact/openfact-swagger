package org.openfact.rest.idm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

@ApiModel(description = "Modelo del detalle para Boletas, Facturas, Notas de cŕedito, Notas de débito.")
public class Line {

    @ApiModelProperty(
            value = "Unidad de medida del producto o servicio (UN/ECE rec 20- Unit Of Measure). Si es nulo el valor por defecto será NIU",
            example = "NIU"
    )
    protected String unitCode;

    @ApiModelProperty(
            value = "Cantidad de unidades vendidas del producto o servicio",
            example = "2",
            required = true
    )
    protected BigDecimal cantidad;

    @ApiModelProperty(
            value = "Código de tipo de IGV utilizado para este producto o servicio (Catalogo 07). Ejemplo: GravadoOperaciónOnerosa=10",
            example = "10",
            allowableValues = "10, 11, 12, 13, 14, 15, 16, 17, 20, 21, 30, 31, 32, 33, 34, 35, 36, 40",
            required = true
    )
    protected String tipoDeIgv;

    @ApiModelProperty(
            value = "Precio del producto o servicio sin IGV",
            example = "8.47",
            required = true
    )
    protected BigDecimal valorUnitario;

    @ApiModelProperty(
            value = "Precio del producto o servicio con IGV",
            example = "10",
            required = true
    )
    protected BigDecimal precioUnitario;

    @ApiModelProperty(
            value = "Resultado de multiplicar cantidad*valorUnitario",
            example = "16.95",
            required = true
    )
    protected BigDecimal subtotal;

    @ApiModelProperty(
            value = "Impuestos a pagar por el presente producto o servicio",
            example = "3.05",
            required = true
    )
    protected BigDecimal igv;

    @ApiModelProperty(
            value = "Resultado de multiplicar cantidad*precioUnitario",
            example = "20",
            required = true
    )
    protected BigDecimal total;

    @ApiModelProperty(
            value = "Descripcion del producto o servicio",
            example = "10",
            required = true
    )
    protected String descripcion;

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipoDeIgv() {
        return tipoDeIgv;
    }

    public void setTipoDeIgv(String tipoDeIgv) {
        this.tipoDeIgv = tipoDeIgv;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getIgv() {
        return igv;
    }

    public void setIgv(BigDecimal igv) {
        this.igv = igv;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}