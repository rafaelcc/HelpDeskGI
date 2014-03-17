/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.br.helpdeskgi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author rafacc
 */
@Entity
@Table (name = "db_solicitante")
public class Solicitante implements Serializable{
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(name = "atendente", nullable = false, length = 45)
    private String atendente;
    
    @Column(name = "grupo", nullable = false, length = 45)
    private String grupo;

    public Long getId() {
        return id;
    }

    public String getAtendente() {
        return atendente;
    }

    public String getGrupo() {
        return grupo;
    }  
}