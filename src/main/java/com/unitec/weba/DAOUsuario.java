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

/**
 *
 * @author T-107
 */
public class DAOUsuario {
    
    static SessionFactory factory;
    static Session session;
    static Transaction tranza;
    //
    static
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
    public DAOUsuario()
    {
        
    }
    
    //Creamos el insert
    public void guardar(Usuario u)throws Exception
    {
    //Aqui poner el codigo de tu guardado
        
    //Despues invocas el metodo cerrar todo
         session.save(u);
        cerrarTodo();
    }
    
    //Creamos el update
    public void actualizar(Usuario u)throws Exception
    {
        
    }
    
    //Creamos el buscarTodos
    public List<Usuario> buscarTodos()throws Exception
    {
        return null;
    }
    //Creamos el buscarPorID
    public Usuario buscarPorId(Integer id)throws Exception
    {
        return null;
    }
    //Creamos el de autenticar
    public boolean auntenticar(Usuario u)throws Exception
    {
        return false;
    }
    
}
