
package com.qualitas.mbeans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
 
import org.primefaces.event.TabChangeEvent;
import org.primefaces.event.TabCloseEvent;
import com.qualitas.entities.DataAccordion;
import com.qualitas.service.AccordionService;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
 
@ManagedBean(name="mbAccordion")
@ViewScoped
public class ManagedBeanAccordion {
    private List<DataAccordion> datos;
    
    @ManagedProperty("#{accordionService}")
    private AccordionService service;
    
    @PostConstruct
    public void init() {
        datos =  service.crearDatos(5);
        
        //datos.add(new DataAccordion("Dragon Ball", "dragonball.jpg", "Las aventuras de Goku niño", "Esferas del dragón, Picoro Daimahou", 1984, false));
        //datos.add(new DataAccordion("Dragon Ball Z", "dragonballz.jpg", "Aventuras de los Guerreros Z", "Freezer, Cell, Majin Buu", 1988, false));
        //datos.add(new DataAccordion("Dragon Ball GT", "dragonballgt.jpg", "Aventuras en el espacio.", "Baby, Dragones Obscuros", 1998, false));
        //datos.add(new DataAccordion("Dragon Ball Z Kai", "dragonballzkai.jpg", "Nueva versión de las aventuras de los Guerreros Z", "Freezer, Cell, Majin Buu", 2014, false));
        //datos.add(new DataAccordion("Dragon Ball Super", "dragonballsuper.jpg", "Batalla contra los dioses", "Resurrección de Freezer, Black Goku, Torneo de los Universos", 2016, true));        
    }
     
    public List<DataAccordion> getDatos() {
        return datos;
    }
     
    public void onTabChange(TabChangeEvent event) {
        FacesMessage msg = new FacesMessage("Tab Changed", "Active Tab: " + event.getTab().getTitle());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
         
    public void onTabClose(TabCloseEvent event) {
        FacesMessage msg = new FacesMessage("Tab Closed", "Closed tab: " + event.getTab().getTitle());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    /**
     * @param service the service to set
     */
    public void setService(AccordionService service) {
        this.service = service;
    }
}
