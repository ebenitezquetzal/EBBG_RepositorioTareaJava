package com.qualitas.entities;

public class DataAccordion {
    private String titulo;
    private String nomimage;
    private String descrip;
    private String detdesc; 
    private int anio;
    private boolean enDesarrollo;
    
    public DataAccordion(String titulo, String nomimage, String descrip,
            String detdesc, int anio, boolean enDesarrollo){
        this.titulo = titulo;
        this.nomimage = nomimage;
        this.descrip = descrip;
        this.detdesc = detdesc;
        this.anio = anio;
        this.enDesarrollo = enDesarrollo;        
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getDetdesc() {
        return detdesc;
    }

    public void setDetdesc(String detdesc) {
        this.detdesc = detdesc;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isEnDesarrollo() {
        return enDesarrollo;
    }

    public void setEnDesarrollo(boolean enDesarrollo) {
        this.enDesarrollo = enDesarrollo;
    }

    /**
     * @return the nomimage
     */
    public String getNomimage() {
        return nomimage;
    }

    /**
     * @param nomimage the nomimage to set
     */
    public void setNomimage(String nomimage) {
        this.nomimage = nomimage;
    }
    
    
}
