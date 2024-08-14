/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.coaching.dominio;

import java.util.Calendar;

/**
 *
 * @author User
 */
public class EntidadeDominio {
    private int id;
    private Calendar dtCadastro;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the dtCadastro
     */
    public Calendar getDtCadastro() {
        return dtCadastro;
    }

    /**
     * @param dtCadastro the dtCadastro to set
     */
    public void setDtCadastro(Calendar dtCadastro) {
        this.dtCadastro = dtCadastro;
    }
    
    
}
