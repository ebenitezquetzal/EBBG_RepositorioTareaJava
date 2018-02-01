package com.qualitas.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import com.qualitas.entities.Auto;

@ManagedBean(name = "carService")
@ApplicationScoped
public class AutoService {
    private final static String[] colores;
     
    private final static String[] marcas;
     
    static {
        colores = new String[10];
        colores[0] = "Negro";
        colores[1] = "Blanco";
        colores[2] = "Verde";
        colores[3] = "Rojo";
        colores[4] = "Azul Chiclamino";
        colores[5] = "Naranja";
        colores[6] = "Plateado";
        colores[7] = "Amarillo";
        colores[8] = "Café";
        colores[9] = "Dorado";
         
        marcas = new String[10];
        marcas[0] = "BMW";
        marcas[1] = "Mercedes";
        marcas[2] = "Volvo";
        marcas[3] = "Audi";
        marcas[4] = "Renault";
        marcas[5] = "Fiat";
        marcas[6] = "Volkswagen";
        marcas[7] = "Honda";
        marcas[8] = "KIA";
        marcas[9] = "Ford";
    }
     
    public List<Auto> crearAutos(int size) {
        List<Auto> list = new ArrayList<Auto>();
        for(int i = 0 ; i < size ; i++) {
            list.add(new Auto(getRandomId(), getRandomMarca(), getRandomAnio(), getRandomColor(), getRandomPrecio(), getRandomALaVenta()));
        }
         
        return list;
    }
     
    private String getRandomId() {
        return UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }
     
    private int getRandomAnio() {
        return (int) (Math.random() * 50 + 1960);
    }
     
    private String getRandomColor() {
        return colores[(int) (Math.random() * 10)];
    }
     
    private String getRandomMarca() {
        return marcas[(int) (Math.random() * 10)];
    }
     
    public int getRandomPrecio() {
        return (int) (Math.random() * 100000);
    }
     
    public boolean getRandomALaVenta() {
        return (Math.random() > 0.5) ? true: false;
    }
 
    public List<String> getColores() {
        return Arrays.asList(colores);
    }
     
    public List<String> getMarcas() {
        return Arrays.asList(marcas);
    }
}
