
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
public class ModeloAutenticar {
    
    public boolean autenticar(Usuario u){
        boolean autenticado= false;
      
        SessionFactory factory = HibernateUtilidades.getSessionFactory();
               Session sesion = factory.openSession();
               Transaction tranza = sesion.beginTransaction();
               
         List<Usuario> usuarios = sesion.createCriteria(Usuario.class).list();
          for(Usuario us:usuarios){
        if (u.getLogin().equals(us.getLogin())&&u.getPassword().equals(us.getPassword())){
            autenticado=true;
        }
        
    }
          tranza.commit();
               sesion.close();
           return autenticado;
    }
 
}
