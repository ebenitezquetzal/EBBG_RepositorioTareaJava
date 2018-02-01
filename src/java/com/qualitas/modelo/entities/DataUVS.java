/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualitas.modelo.entities;

import asjava.uniclientlibs.UniDynArray;

/**
 *
 * @author ebenitez
 */
public class DataUVS {
  private String id;
  private UniDynArray registro;

  public DataUVS(String id, UniDynArray registro) {
    this.id = id;
    this.registro = registro;
  }

  public String getId() {
    return id;
  }

  public UniDynArray getRegistro() {
    return registro;
  }
}
