/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.coaching.dominio;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author User
 */
public class Associado extends EntidadeDominio{
    private String nome;
    private Calendar dtNascimento;
    private String EMail;
    private String caminhoFoto;
    private List<Artigo> artigos;
    private MiniCurriculum miniCurriculum;
    private Curriculum curriculum;
    private Usuario usuario;
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dtNascimento
     */
    public Calendar getDtNascimento() {
        return dtNascimento;
    }

    /**
     * @param dtNascimento the dtNascimento to set
     */
    public void setDtNascimento(Calendar dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    /**
     * @return the EMail
     */
    public String getEMail() {
        return EMail;
    }

    /**
     * @param EMail the EMail to set
     */
    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    /**
     * @return the caminhoFoto
     */
    public String getCaminhoFoto() {
        return caminhoFoto;
    }

    /**
     * @param caminhoFoto the caminhoFoto to set
     */
    public void setCaminhoFoto(String caminhoFoto) {
        this.caminhoFoto = caminhoFoto;
    }

    /**
     * @return the artigos
     */
    public List<Artigo> getArtigos() {
        return artigos;
    }

    /**
     * @param artigos the artigos to set
     */
    public void setArtigos(List<Artigo> artigos) {
        this.artigos = artigos;
    }

    /**
     * @return the miniCurriculum
     */
    public MiniCurriculum getMiniCurriculum() {
        return miniCurriculum;
    }

    /**
     * @param miniCurriculum the miniCurriculum to set
     */
    public void setMiniCurriculum(MiniCurriculum miniCurriculum) {
        this.miniCurriculum = miniCurriculum;
    }

    /**
     * @return the curriculum
     */
    public Curriculum getCurriculum() {
        return curriculum;
    }

    /**
     * @param curriculum the curriculum to set
     */
    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
