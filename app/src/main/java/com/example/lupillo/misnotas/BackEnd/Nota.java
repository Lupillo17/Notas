package com.example.lupillo.misnotas.BackEnd;

public class Nota {
    public String Titulo;
    public String Descripcion;
    public String ArchivoMultimedia;
    public String Clasificacion;
    public String FechaTerminacion;
    public String Recordatorio;
    public String Cumplida;
    public String FechaRegistro;


    public Nota(String titulo, String descripcion, String archivoMultimedia,
                String clasificacion, String fechaTerminacion, String recordatorio,
                String cumplida, String fechaRegistro) {
        Titulo = titulo;
        Descripcion = descripcion;
        ArchivoMultimedia = archivoMultimedia;
        Clasificacion = clasificacion;
        FechaTerminacion = fechaTerminacion;
        Recordatorio = recordatorio;
        Cumplida = cumplida;
        FechaRegistro = fechaRegistro;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getArchivoMultimedia() {
        return ArchivoMultimedia;
    }

    public void setArchivoMultimedia(String archivoMultimedia) {
        ArchivoMultimedia = archivoMultimedia;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        Clasificacion = clasificacion;
    }

    public String getFechaTerminacion() {
        return FechaTerminacion;
    }

    public void setFechaTerminacion(String fechaTerminacion) {
        FechaTerminacion = fechaTerminacion;
    }

    public String getRecordatorio() {
        return Recordatorio;
    }

    public void setRecordatorio(String recordatorio) {
        Recordatorio = recordatorio;
    }

    public String getCumplida() {
        return Cumplida;
    }

    public void setCumplida(String cumplida) {
        Cumplida = cumplida;
    }

    public String getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        FechaRegistro = fechaRegistro;
    }
}
