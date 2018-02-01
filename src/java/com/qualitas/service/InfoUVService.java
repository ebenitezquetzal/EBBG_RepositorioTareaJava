/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualitas.service;

import asjava.uniclientlibs.UniConnectionException;
import asjava.uniobjects.UniCommandException;
import asjava.uniobjects.UniFileException;
import asjava.uniobjects.UniSelectListException;
import asjava.uniobjects.UniSessionException;
import com.qualitas.modelo.CnxSISE;
import com.qualitas.modelo.entities.DataUVS;
import com.qualitas.modelo.entities.TipoEndoso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ebenitez
 */
public class InfoUVService {
    public List<TipoEndoso> traeInfoTipoEndoso() throws UniSessionException, UniConnectionException, 
          UniCommandException, UniSelectListException, UniFileException {
    CnxSISE cnxSISE;
    
    List<DataUVS> lstRegs;
    List<TipoEndoso> lstTipoEndoso;
    
    TipoEndoso tipoEndoso;
    
    lstTipoEndoso = new ArrayList();
    cnxSISE = new CnxSISE();
    lstRegs = cnxSISE.leerlista();
    
    for (DataUVS reg : lstRegs) {
      tipoEndoso = new TipoEndoso(reg.getId(),reg.getRegistro().extract(1).toString(),reg.getRegistro().extract(2).toString());
      
      lstTipoEndoso.add(tipoEndoso);
    }
    
    return lstTipoEndoso;
  }
}
