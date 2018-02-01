/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualitas.mbeans;

import asjava.uniclientlibs.UniConnectionException;
import asjava.uniobjects.UniCommandException;
import asjava.uniobjects.UniFileException;
import asjava.uniobjects.UniSelectListException;
import asjava.uniobjects.UniSessionException;
import com.qualitas.modelo.entities.TipoEndoso;
import com.qualitas.service.InfoUVService;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ManagedBeanInfoUVS {        
    private List<TipoEndoso> lstTipoEndoso;
    private String errorEx;
      
    public ManagedBeanInfoUVS() {
        InfoUVService traeTiposEndoso = new InfoUVService();

         try {
           lstTipoEndoso = traeTiposEndoso.traeInfoTipoEndoso();
         } catch (UniSessionException | UniConnectionException | UniCommandException  | UniSelectListException | UniFileException e) {
           errorEx = e.getMessage();
         } catch (Exception e) {
           errorEx = e.getMessage();
         }
    }
    
    public List<TipoEndoso> getLstTipoEndoso() {
        return lstTipoEndoso;
    }
    
    public String getErrorEx() {
        return errorEx;
    }
}
