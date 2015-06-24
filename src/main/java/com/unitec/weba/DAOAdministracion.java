/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.weba;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author T-107
 */
public class DAOAdministracion {
    
    static SessionFactory factory;
    static Session session;
    static Transaction tranza;
    //
    public static void abrirSesion()
    {
        //Bloque iniciañiza sesion accediendo al mapeado y poder hacer modificaciones
        factory = HibernateUtilidades.getSessionFactory();
        session = factory.openSession();
        tranza = session.beginTransaction();
    }
    public static void cerrarTodo()
    {
        tranza.commit();
        session.close();
    }
    //Constructor por defecto
    public DAOAdministracion()
    {
        
    }
    
    //Creamos el insert
    public void guardar(Administracion u)throws Exception
    {
    //Aqui poner el codigo de tu guardado
        
    //Despues invocas el metodo cerrar todo
         session.save(u);
        cerrarTodo();
    }
    
    //Creamos el update
    public void actualizar(Administracion u)throws Exception
    {
        session.update(u);
        cerrarTodo();
    }
    
    //Creamos el buscarTodos
    public List<Administracion> buscarTodos()throws Exception
    {
        List<Administracion> usuarios = session.createCriteria(Administracion.class).list();
        cerrarTodo();
        return usuarios;
    }
    //Creamos el buscarPorID
    public Administracion buscarPorId(Integer id)throws Exception
    {
        Administracion u =(Administracion) session.createCriteria(Administracion.class).add(Restrictions.idEq(id)).uniqueResult();
         cerrarTodo();
        return u;
    }
    public void eliminar(Integer id)throws Exception{
        Administracion u =(Administracion) session.createCriteria(Administracion.class).add(Restrictions.idEq(1)).uniqueResult();
        session.delete(u);
         cerrarTodo();
    }
    
    
}

