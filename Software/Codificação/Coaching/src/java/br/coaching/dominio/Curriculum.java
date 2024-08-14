/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.coaching.dominio;

import java.util.List;
/**
 *
 * @author Luiz
 */
public class Curriculum extends EntidadeDominio{
    private List<HistorioAcademico> historioAcademico;
    private List<HistórioProfissional> histórioProfissional;

    /**
     * @return the historioAcademico
     */
    public List<HistorioAcademico> getHistorioAcademico() {
        return historioAcademico;
    }

    /**
     * @param historioAcademico the historioAcademico to set
     */
    public void setHistorioAcademico(List<HistorioAcademico> historioAcademico) {
        this.historioAcademico = historioAcademico;
    }

    /**
     * @return the histórioProfissional
     */
    public List<HistórioProfissional> getHistórioProfissional() {
        return histórioProfissional;
    }

    /**
     * @param histórioProfissional the histórioProfissional to set
     */
    public void setHistórioProfissional(List<HistórioProfissional> histórioProfissional) {
        this.histórioProfissional = histórioProfissional;
    }
}
