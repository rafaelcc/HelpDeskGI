/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.br.helpdeskgi.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author rafacc
 */
@Entity
@Table(name = "db_incidentes")
public class Incidente implements Serializable{
    
    @Id
    @GeneratedValue
    private String idChamado;
    
    @Column(name = "categoria", nullable = false, length = 10)
    private int categoria;
    
    @Column(name = "db_atendente_id", nullable = false, length = 10)
    @OneToMany
    List<Atendente> atendente;
    
    @Column(name = "db_solicitante_id", nullable = false, length = 10)
    @OneToMany
    List<Solicitante> solicitante;
    
    @Column(name = "db_atendente_id", nullable = false, length = 150)
    private String descricao;
    
    @Column(name = "abertura", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date abertura;
    
    @Column(name = "escalonamento", nullable = false, length = 10)
    private Long escalonamento;
    
    @Column(name = "prioridade", nullable = false, length = 10)
    private Long prioridade;
    
    @Column(name = "tempo_restante", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date tempoRestante;

    public Incidente() {
    }

    public Incidente(String idChamado, int categoria, List<Atendente> atendente, List<Solicitante> solicitante, String descricao, Date abertura, Long escalonamento, Long prioridade, Date tempoRestante) {
        this.idChamado = idChamado;
        this.categoria = categoria;
        this.atendente = atendente;
        this.solicitante = solicitante;
        this.descricao = descricao;
        this.abertura = abertura;
        this.escalonamento = escalonamento;
        this.prioridade = prioridade;
        this.tempoRestante = tempoRestante;
    }
    
    public String getIdChamado() {
        return idChamado;
    }

    public void setIdChamado(String idChamado) {
        this.idChamado = idChamado;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public List<Atendente> getAtendente() {
        return atendente;
    }

    public void setAtendente(List<Atendente> atendente) {
        this.atendente = atendente;
    }

    public List<Solicitante> getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(List<Solicitante> solicitante) {
        this.solicitante = solicitante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getAbertura() {
        return abertura;
    }

    public void setAbertura(Date abertura) {
        this.abertura = abertura;
    }

    public Long getEscalonamento() {
        return escalonamento;
    }

    public void setEscalonamento(Long escalonamento) {
        this.escalonamento = escalonamento;
    }

    public Long getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Long prioridade) {
        this.prioridade = prioridade;
    }

    public Date getTempoRestante() {
        return tempoRestante;
    }

    public void setTempoRestante(Date tempoRestante) {
        this.tempoRestante = tempoRestante;
    }
    
}
