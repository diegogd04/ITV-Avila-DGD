package com.dgd.ITV.domain.models;

public class Inspeccion {
    private Integer condigoInspeccion;
    private String fechaInspeccion;
    private Boolean resultadoInspeccion;
    private Vehiculo vehiculo;
    private Propietario propietario;

    public Integer getCondigoInspeccion() {
        return condigoInspeccion;
    }

    public void setCondigoInspeccion(Integer condigoInspeccion) {
        this.condigoInspeccion = condigoInspeccion;
    }

    public String getFechaInspeccion() {
        return fechaInspeccion;
    }

    public void setFechaInspeccion(String fechaInspeccion) {
        this.fechaInspeccion = fechaInspeccion;
    }

    public Boolean getResultadoInspeccion() {
        return resultadoInspeccion;
    }

    public void setResultadoInspeccion(Boolean resultadoInspeccion) {
        this.resultadoInspeccion = resultadoInspeccion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}
