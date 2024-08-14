/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.coaching.dominio;

import java.util.Calendar;

/**
 *
 * @author Luiz
 */
public class HistórioProfissional extends EntidadeDominio{
    private String descriçao;
    private Calendar dtInicio;
    private Calendar dtFim;

    /**
     * @return the descriçao
     */
    public String getDescriçao() {
        return descriçao;
    }

    /**
     * @param descriçao the descriçao to set
     */
    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    /**
     * @return the dtInicio
     */
    public Calendar getDtInicio() {
        return dtInicio;
    }

    /**
     * @param dtInicio the dtInicio to set
     */
    public void setDtInicio(Calendar dtInicio) {
        this.dtInicio = dtInicio;
    }

    /**
     * @return the dtFim
     */
    public Calendar getDtFim() {
        return dtFim;
    }

    /**
     * @param dtFim the dtFim to set
     */
    public void setDtFim(Calendar dtFim) {
        this.dtFim = dtFim;
    }
}
