/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.br.helpdeskgi.dao;

import com.br.helpdeskgi.persistence.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author rafacc
 */
public class IncidenteDao implements IDao{
    
    private Session session;
    private Transaction transaction;

@Override
    public void salvar(Object obj) {
        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = session.beginTransaction();
            this.session.save(obj);
            this.transaction.commit();
        } catch (HibernateException he) {
            transaction.rollback();
        } finally {
            this.session.close();
        }
    }

    @Override
    public void alterar(Object obj) {
        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = session.beginTransaction();
            this.session.update(obj);
            this.transaction.commit();
        } catch (HibernateException he) {
            transaction.rollback();
        } finally {
            this.session.close();
        }
    }

    @Override
    public void excluir(Object obj) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(obj);
            transaction.commit();
        } catch (HibernateException he) {
            transaction.rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public List<Object> listarTodos() {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            Query query = session.createQuery("FROM db_incidentes");
            return query.list();
        } catch (HibernateException he) {
            return null;
        } finally {
            session.close();
        }
    }
    
}
