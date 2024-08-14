/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.coaching.dominio;

/**
 *
 * @author User
 */
public class Artigo extends EntidadeDominio{
    private String titulo;
    private Boolean aprovado;

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the aprovado
     */
    public Boolean getAprovado() {
        return aprovado;
    }

    /**
     * @param aprovado the aprovado to set
     */
    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    
}
