package com.qualitas.modelo;

import asjava.uniclientlibs.UniDynArray;
import asjava.uniclientlibs.UniDynArrayException;
import asjava.uniclientlibs.UniString;
import asjava.uniobjects.UniCommand;
import asjava.uniobjects.UniCommandException;
import asjava.uniobjects.UniFile;
import asjava.uniobjects.UniSelectList;
import asjava.uniobjects.UniSession;
import asjava.uniobjects.UniSessionException;
import com.qualitas.modelo.entities.DataUVS;
import com.qualitas.modelo.entities.TipoEndoso;
import java.util.ArrayList;
import java.util.List;

public class CnxSISE {
    private String server="110.10.0.11";
    private String userName="egasca";
    private String userPwd="ebbg74-s6";
    private String accPath="sise";
    public String DBtype="UNIVERSE";
    public UniSession sessionUVS;
        
    public CnxSISE() {
        sessionUVS = new UniSession();
        realizarCnx();
    }
			    
    public void realizarCnx(){
        System.out.println("Entro a conectarme");	

        try {
            sessionUVS.setHostName(server);
            sessionUVS.setUserName(userName);
            sessionUVS.setPassword(userPwd);
            sessionUVS.setAccountPath(accPath);
            sessionUVS.setDataSourceType(DBtype);			
            System.out.println("Termino asignar valores");

            sessionUVS.connect();
            System.out.println("Conexion establecida");	            
        } catch (UniSessionException e) {
                System.out.println("Error en la conexion ");
                System.out.println(e.getMessage());
        } catch (Exception e){
                System.out.println("SE encontro el error  "+e.getMessage());
        }
    }
	
    public void leer() throws UniCommandException{
        String cmdString;
        String Cadena;
        UniCommand command = null;
        
        System.out.println("\nEjecuta Comando inicio >>>\n");
        try {
                cmdString = "LIST.ITEM TENDOSO";
                command = sessionUVS.command();
                command.setCommand(cmdString);  
                //Cadena = command.response();
                command.exec();
                
                System.out.println(command.response());
        } catch (UniSessionException e) {
                System.out.println("   ERROR:UniSessonException:" + e.getMessage() + "\n");
        } catch (UniCommandException e) {
                System.out.println("   ERROR:UniCommandException:" + e.getMessage() + "\n");
        }
        System.out.println("Ejecuta Comando fin <<<\n");	        
    }
    
    public List<DataUVS> leerlista() throws UniCommandException{
        List<TipoEndoso> lista = new ArrayList<>();
        String cmdString, idBD;
        String resultado;
        UniCommand command = null;
        UniString unistring;
        UniDynArray dynResult;
        UniSelectList selectlist;
        UniFile file;        
        DataUVS dataUV;
        List<DataUVS> listaRegistros = new ArrayList();
        
        try {                
                realizarCnx();                
            
                cmdString = "SELECT TENDOSO";
                command = sessionUVS.command();
                command.setCommand(cmdString);                  
                command.exec();
                
                selectlist = sessionUVS.selectList(0);
                file = sessionUVS.openFile("TENDOSO");
                
                 while (!selectlist.isLastRecordRead()) {
                    idBD = selectlist.next().toString();

                    if (!idBD.equals("")) {
                      System.out.println("Encontro registro " + idBD);
                      file.setRecordID(idBD);
                      dynResult = new UniDynArray(file.read().toString());
                      dataUV = new DataUVS(idBD, dynResult);
                      listaRegistros.add(dataUV);
                   }
                }
        } 
        catch (Exception e) {
             System.out.println("SE encontro el error 2  "+e.getMessage());   
        }
        System.out.println("Ejecuta Comando fin <<<\n");	
        return listaRegistros;
    }
}
