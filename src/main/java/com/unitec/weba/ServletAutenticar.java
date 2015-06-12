/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.weba;

import java.io.IOException;
import java.io.PrintWriter;
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