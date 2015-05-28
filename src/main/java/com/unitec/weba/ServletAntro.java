/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.weba;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JOSUE
 */
public class ServletAntro extends HttpServlet {

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
       
       String bebida= request.getParameter("bebida");
       PersistenciaBebida beb = new PersistenciaBebida();
       ArrayList<Bebida> recomendar = beb.GenerarBebida(bebida);
        request.setAttribute("bebidas",recomendar );
        RequestDispatcher despachador = request.getRequestDispatcher("/misBebidas.jsp");
        despachador.forward(request, response);
       
       
       
    }
}
