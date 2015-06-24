/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.weba;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author T-107
 */
public class ServletAutenticar extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8"); 
        
           String login= request.getParameter("login");
            String passsword = request.getParameter("password");
            String ip= request.getRemoteAddr();
                   Date fecha =Calendar.getInstance().getTime();
                   
                   //buscar aqui el usario cuyo login y password se proporcionaron
                   //una vez buscado, verificar su id, supongamos que es 1
                   Usuario u1 =new Usuario();
                   u1.setIdUsuario(1);
                   //Despues de esto guardar la sesion con la clase administracion 
                   Administracion a= new Administracion();
                   a.setFecha(fecha);
                   a.setIp(ip);
                   a.setIdUsuario(u1);
                   DAOAdministracion daoadmon =new DAOAdministracion();
        try {
            daoadmon.guardar(a);
        } catch (Exception ex) {
           System.out.println(ex);
        }
            
            //Creamos un model
            Usuario u = new Usuario();
            //Ajusta,os su login y password
            u.setLogin(login);
            u.setPassword(passsword);
        
        //redireccionamis el servlet
         /*
            ModeloAutenticar modelo = new ModeloAutenticar();
            
            if(modelo.autenticar(u)){
        RequestDispatcher despachador = request.getRequestDispatcher("/bienvenido.jsp");
        despachador.forward(request, response);
            }else{
                 RequestDispatcher despachador = request.getRequestDispatcher("/error.jsp");
        despachador.forward(request, response);
        
            }
                 */
             
            DAOUsuario daou = new DAOUsuario();
        try {
            if(daou.auntenticar(u)){
                RequestDispatcher despachador = request.getRequestDispatcher("/bienvenido.jsp");
                despachador.forward(request, response);
            }else{
                RequestDispatcher despachador = request.getRequestDispatcher("/error.jsp");
                despachador.forward(request, response);
                
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}