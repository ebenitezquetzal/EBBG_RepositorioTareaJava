package com.qualitas.entities;

public class Auto {
    private String id;
    private int anio;
    private String marca;
    private String color; 
    private int precio;
    private boolean aLaVenta;
    private float preciof;
    
    public Auto(String id,String marca,
            int anio,String color,
            int precio,boolean aLaVenta){
        this.id = id;
        this.anio = anio;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.aLaVenta = aLaVenta;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isaLaVenta() {
        return aLaVenta;
    }

    public void setaLaVenta(boolean aLaVenta) {
        this.aLaVenta = aLaVenta;
    }

    /**
     * @return the preciof
     */
    public float getPreciof() {
        return preciof;
    }

    /**
     * @param preciof the preciof to set
     */
    public void setPreciof(float preciof) {
        this.preciof = preciof;
    }
        
}
