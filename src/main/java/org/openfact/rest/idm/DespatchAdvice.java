package org.openfact.rest.idm;

import java.math.BigDecimal;

public class DespatchAdvice {
    private PostalAddress deliveryAddress;
    private PostalAddress originAddress;
    private String tipoDocumentoTransportista;
    private String nroDocumentoTransportista;
    private String denominacionTransportista;
    private String nroLicenciaConducir;
    private String placaVehiculo;
    private String codigoAutorizacion;
    private String marcaVehiculo;
    private String tipoModoTransporte;
    private String unidadMedida;
    private BigDecimal pesoBrutoTotal;

    public PostalAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(PostalAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public PostalAddress getOriginAddress() {
        return originAddress;
    }

    public void setOriginAddress(PostalAddress originAddress) {
        this.originAddress = originAddress;
    }

    public String getTipoDocumentoTransportista() {
        return tipoDocumentoTransportista;
    }

    public void setTipoDocumentoTransportista(String tipoDocumentoTransportista) {
        this.tipoDocumentoTransportista = tipoDocumentoTransportista;
    }

    public String getNroDocumentoTransportista() {
        return nroDocumentoTransportista;
    }

    public void setNroDocumentoTransportista(String nroDocumentoTransportista) {
        this.nroDocumentoTransportista = nroDocumentoTransportista;
    }

    public String getDenominacionTransportista() {
        return denominacionTransportista;
    }

    public void setDenominacionTransportista(String denominacionTransportista) {
        this.denominacionTransportista = denominacionTransportista;
    }

    public String getNroLicenciaConducir() {
        return nroLicenciaConducir;
    }

    public void setNroLicenciaConducir(String nroLicenciaConducir) {
        this.nroLicenciaConducir = nroLicenciaConducir;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getCodigoAutorizacion() {
        return codigoAutorizacion;
    }

    public void setCodigoAutorizacion(String codigoAutorizacion) {
        this.codigoAutorizacion = codigoAutorizacion;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getTipoModoTransporte() {
        return tipoModoTransporte;
    }

    public void setTipoModoTransporte(String tipoModoTransporte) {
        this.tipoModoTransporte = tipoModoTransporte;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public BigDecimal getPesoBrutoTotal() {
        return pesoBrutoTotal;
    }

    public void setPesoBrutoTotal(BigDecimal pesoBrutoTotal) {
        this.pesoBrutoTotal = pesoBrutoTotal;
    }
}
