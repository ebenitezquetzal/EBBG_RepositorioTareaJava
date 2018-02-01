package com.qualitas;

import asjava.uniobjects.UniCommandException;
import com.qualitas.modelo.CnxSISE;
import com.qualitas.modelo.entities.DataUVS;
import com.qualitas.modelo.entities.TipoEndoso;
import java.util.List;

public class Lanzador {
    
    public static void main(String args[] ) throws UniCommandException{
        CnxSISE conectaUniverse = new CnxSISE();
        List<DataUVS> lista = conectaUniverse.leerlista();
        System.out.println("Encontre: " + lista.size() + " registros");
    }
    
}
