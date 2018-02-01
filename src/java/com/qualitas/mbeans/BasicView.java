package com.qualitas.mbeans;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import com.qualitas.service.AutoService;
import com.qualitas.entities.Auto;

@ManagedBean(name="dtBasicView")
@ViewScoped
public class BasicView {
    private List<Auto> autos;
     
    @ManagedProperty("#{carService}")
    private AutoService service;
 
    @PostConstruct
    public void init() {
        autos = service.crearAutos(10);
    }
     
    public List<Auto> getAutos() {
        return autos;
    }
 
    public void setService(AutoService service) {
        this.service = service;
    }
}
