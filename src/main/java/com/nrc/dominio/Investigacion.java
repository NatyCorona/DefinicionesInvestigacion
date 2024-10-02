/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nrc.dominio;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 *
 * @author natal
 */
@Named
@RequestScoped
public class Investigacion {
    private String titulo;
    private String descripcion; 
    private String referencia;
    private String foto;
    private String descripcion1;
    private String descripcion2;
    private String referencia2;
    private String foto2;

    public Investigacion() {
        this.titulo = "Bs As - Octubre";
        this.foto = "cielo.jpg";
        this.descripcion = "Buenos Aires es la capital y ciudad más poblada de la República Argentina. "
                + "Sus nombres oficiales son Ciudad de Buenos Aires o Ciudad Autónoma de Buenos Aires (CABA)."
                + "También es llamada Capital Federal, sede del Gobierno nacional. Es uno de los 24 distritos, o "
                + "«jurisdicciones de primer orden»,10​ que conforman el país. ";
        this.descripcion1 = "La investigación es el trabajo creativo y sistemático realizado para aumentar el" +
                " acervo de conocimientos. Implica la recopilación, organización y análisis de" +
                " información para aumentar la comprensión de un tema o problema. Un proyecto" +
                " de investigación puede ser una expansión del trabajo anterior en el campo." +
                " Para probar la validez de instrumentos, procedimientos o experimentos, la" +
                " investigación puede reproducir elementos de proyectos anteriores o del" +
                " proyecto en su conjunto.";
        this.descripcion2 = "La investigación científica es el nombre general que obtiene el complejo" +
                " proceso en el cual los avances científicos son el resultado de la aplicación del" +
                " método científico para resolver problemas o tratar de explicar determinadas" +
                " observaciones. De igual modo la investigación tecnológica emplea el conocimiento científico para el desarrollo de" +
                " tecnologías blandas o duras, así como la investigación cultural, cuyo objeto de estudio es la cultura. Además, existe" +
                " a su vez la investigación técnico-policial y la investigación detectivesca y policial e investigación educativa.";
        this.referencia = "Materiales utilizados en un proceso de investigación.";
        this.foto2 = "escritorio.JPG";
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDescripcion1() {
        return descripcion1;
    }

    public void setDescripcion1(String descripcion1) {
        this.descripcion1 = descripcion1;
    }

    public String getDescripcion2() {
        return descripcion2;
    }

    public void setDescripcion2(String descripcion2) {
        this.descripcion2 = descripcion2;
    }

    public String getReferencia2() {
        return referencia2;
    }

    public void setReferencia2(String referencia2) {
        this.referencia2 = referencia2;
    }

    public String getFoto2() {
        return foto2;
    }

    public void setFoto2(String foto2) {
        this.foto2 = foto2;
    }
    
    
}
