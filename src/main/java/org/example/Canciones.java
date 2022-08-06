package org.example;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Canciones {
    public String titulo;
    public String identificador;
    public Date fecha;
    public Time duracion;
    public String genero;
    public String caratula;
    public String descripcion;

    public Canciones() {
        titulo = "";
        identificador = "";
        fecha = new Date();
        duracion = new Time(0,0,0);
        genero = "";
        caratula = "";
        descripcion = "";
    }

    public Canciones(String titulo, String identificador, Date fecha, Time duracion, String genero, String caratula, String descripcion) {
        this.titulo = titulo;
        this.identificador = identificador;
        this.fecha = fecha;
        this.duracion = duracion;
        this.genero = genero;
        this.caratula = caratula;
        this.descripcion = descripcion;

    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Time getDuracion() {
        return duracion;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCaratula() {
        return caratula;
    }

    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     *
     * @return la fecha especificada asignada
     */
    public String formatearFecha (){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
        String fechaCadena=sdf.format(this.fecha);
        return fechaCadena;
    }

    @Override
    public String toString() {
        return "Canciones{" +
                "titulo='" + titulo + '\'' +
                ", identificador='" + identificador + '\'' +
                ", fecha=" + formatearFecha() +
                ", duracion=" + duracion +
                ", genero='" + genero + '\'' +
                ", caratula='" + caratula + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
