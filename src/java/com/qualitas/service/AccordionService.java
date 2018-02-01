package com.qualitas.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import com.qualitas.entities.DataAccordion;

@ManagedBean(name = "accordionService")
@ApplicationScoped
public class AccordionService {
    private final static String[] titulos;
    private final static String[] nombsimage;
    private final static String[] descrips;
    private final static String[] sagas;
    private final static int[] anios;
    private final static boolean[] estatus;
     
    static {
        titulos = new String[5];
        titulos[0] = "Dragon Ball";
        titulos[1] = "Dragon Ball Z";
        titulos[2] = "Dragon Ball GT";
        titulos[3] = "Dragon Ball Z KAI";
        titulos[4] = "Dragon Ball Super";
        
        nombsimage = new String[5];
        nombsimage[0] = "dragonball.jpg";
        nombsimage[1] = "dragonballz.jpg";
        nombsimage[2] = "dragonballgt.jpg";
        nombsimage[3] = "dragonballzkai.jpg";
        nombsimage[4] = "dragonballsuper.jpg";
        
        descrips = new String[5];
        descrips[0] = "Fuji Television transmitió originalmente el anime de 153 episodios en total, basados en la primera parte del manga que narra las aventuras de Gokū en su infancia";
        descrips[1] = "La continuación de Dragon Ball que relata las aventuras de Gokū en su etapa adulta.";
        descrips[2] = "El autor de la serie diseñó al inicio del proyecto a los personajes principales y eligió las siglas «GT» para el título, que aluden al término «Grand Touring» —«El gran viaje»";
        descrips[3] = "Con motivo del vigésimo aniversario del manga, Toei Animation editó una nueva versión de Dragon Ball Z, titulada Dragon Ball Kai (ドラゴンボール改(カイ) Doragon Bōru Kai.";
        descrips[4] = "A través de su sitio web oficial, Toei Animation anunció el 28 de abril de 2015 la producción de una nueva serie titulada Dragon Ball Super (ドラゴンボール超 Doragon Bōru Sūpā?), que se estrenó en Japón el 5 de julio del mismo año.121​ Su trama continua los sucesos relatados en Dragon Ball Z después de la Saga de Majin Boo.";
        
        sagas = new String[5];
        sagas[0] = "Pilaf, El 21° Tenkaichi Budōkai,  Ejército de la Red Ribbon, Piccolo Daimao.";
        sagas[1] = "Saiyajins, Freezer, Cell, Majin Boo.";
        sagas[2] = "El Gran Viaje, Baby, Super No. 17, Dragones Oscuros.";
        sagas[3] = "Saiyajins, Freezer, Cell, Majin Boo.";
        sagas[4] = "La Batalla de los Dioses, Resurrección de Freezer, Batalla Universo 6, Black Goku, Supervivencia Universal.";
        
        anios = new int[5];
        anios[0] = 1986;
        anios[1] = 1989;
        anios[2] = 1996;
        anios[3] = 2014;
        anios[4] = 2016;
        
        estatus = new boolean[5];
        estatus[0] = false;
        estatus[1] = false;
        estatus[2] = false;
        estatus[3] = false;
        estatus[4] = true;        
    }
    
    public List<DataAccordion> crearDatos(int size) {
        List<DataAccordion> list = new ArrayList<DataAccordion>();
        for(int i = 0 ; i < size ; i++) {
            list.add(new DataAccordion(titulos[i], nombsimage[i], descrips[i], sagas[i], anios[i], estatus[i]));            
        }
         
        return list;
    }
}
