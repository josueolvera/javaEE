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


public class TestPojos {

    public static void main(String[] args) throws Exception{
        
        System.out.println("Probaremos todas las operaciones SQL");
        //Primer paso crear El SessionFactory
        
       SessionFactory factory = HibernateUtilidades.getSessionFactory();
        
       //Obtenemos la apertura de seccion actual
               Session sesion = factory.openSession();
       //Creamos la transaccion
               Transaction tranza = sesion.beginTransaction();
             // nos apuramos a hacer una transaccion 
               
               Usuario u = new Usuario();
               u.setEmail("uriel@gmail.com");
               u.setNombre("Uriel Nuñez");
               u.setLogin("chavo");
               u.setPassword("123");
          
               
               DAOUsuario daou = new DAOUsuario();
               daou.guardar(u);
               
               /* 
               sesion.save(u);
               //Liberar la transaccion y cerrar la sesion 
               tranza.commit();
               sesion.close();
               */    
               
             /*  
               Usuario u = new Usuario();
               u.setIdUsuario(1);
               u.setNombre("Josue Olvera");
               u.setEmail("josue@gmail.com");
               u.setLogin("raton");
               u.setPassword("vaquero");
               sesion.update(u);
               tranza.commit();
               sesion.close();
               */
               
               //Select por Id
             /*  
               Usuario u =(Usuario) sesion.createCriteria(Usuario.class).add(Restrictions.idEq(1)).uniqueResult();
               
               tranza.commit();
               sesion.close();
               */
               /*
              List<Usuario> usuarios = sesion.createCriteria(Usuario.class).list();
              for(Usuario usu: usuarios){ 
              System.out.println("Usuarios encontrados:"+usu.getNombre());
              
             
              }
              tranza.commit();
               sesion.close();
              
              
               */
              /* Usuario u =(Usuario) sesion.createCriteria(Usuario.class).add(Restrictions.idEq(1)).uniqueResult();
               sesion.delete(u);
               tranza.commit();
               sesion.close();   */
    }
    
}
