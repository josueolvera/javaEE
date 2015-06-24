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
public class DAOUsuario {
    
    static SessionFactory factory;
    static Session session;
    static Transaction tranza;
    //
    public static void iniciarTodo()
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
        iniciarTodo();
    //Despues invocas el metodo cerrar todo
         session.save(u);
        cerrarTodo();
    }
    
    //Creamos el update
    public void actualizar(Usuario u)throws Exception
    {
        iniciarTodo();
        session.update(u);
        cerrarTodo();
    }
    
    //Creamos el buscarTodos
    public List<Usuario> buscarTodos()throws Exception
    {
        iniciarTodo();
        List<Usuario> usuarios = session.createCriteria(Usuario.class).list();
        cerrarTodo();
        return usuarios;
    }
    //Creamos el buscarPorID
    public Usuario buscarPorId(Integer id)throws Exception
    {
        iniciarTodo();
        Usuario u =(Usuario) session.createCriteria(Usuario.class).add(Restrictions.idEq(id)).uniqueResult();
         cerrarTodo();
        return u;
    }
    public void eliminar(Integer id)throws Exception{
        iniciarTodo();
        Usuario u =(Usuario) session.createCriteria(Usuario.class).add(Restrictions.idEq(1)).uniqueResult();
        session.delete(u);
         cerrarTodo();
    }
    //Creamos el de autenticar
    public boolean auntenticar(Usuario u)throws Exception
    {
        
        boolean autenticado= false;
          iniciarTodo();
               for(Usuario us:buscarTodos()){
        if (u.getLogin().equals(us.getLogin())&&u.getPassword().equals(us.getPassword())){
            autenticado=true;
        }
        
    }
        return autenticado;
    }
    
}
