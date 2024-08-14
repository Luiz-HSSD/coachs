/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.coaching.dominio;

/**
 *
 * @author Luiz
 */
public class MiniCurriculum extends EntidadeDominio{
   private String Conteudo;

    /**
     * @return the Conteudo
     */
    public String getConteudo() {
        return Conteudo;
    }

    /**
     * @param Conteudo the Conteudo to set
     */
    public void setConteudo(String Conteudo) {
        this.Conteudo = Conteudo;
    }
           
}
