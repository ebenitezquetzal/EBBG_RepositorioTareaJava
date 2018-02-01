/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualitas.mbeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ManagedBeanListener {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public void handleKeyEvent() {
        text = text.toUpperCase();
    }
}
