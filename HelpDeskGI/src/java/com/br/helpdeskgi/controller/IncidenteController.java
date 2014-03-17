/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.br.helpdeskgi.controller;

import com.br.helpdeskgi.dao.IncidenteDao;
import com.br.helpdeskgi.entity.Incidente;
import com.br.helpdeskgi.entity.Solicitante;
import com.br.helpdeskgi.entity.Usuario;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author rafacc
 */
@ManagedBean
@SessionScoped
public class IncidenteController {
    
    private Incidente incidente;
    private IncidenteDao dao;

    public Incidente getIncidente() {
        if(this.incidente == null)
            this.incidente = new Incidente();
        return incidente;
    }
    
    public void setIncidente(Incidente incidente){
        this.incidente = incidente;
    }
    
    public List listarIncidentes(){
        dao = new IncidenteDao();
        return dao.listarTodos();
    }
    
    public void inserirIncidente(){
        dao = new IncidenteDao();
        dao.salvar(incidente);
    }
    
    public List listarSolicitantesBI(){
        return incidente.getSolicitante();
    }
}
