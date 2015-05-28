/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.weba;

import java.util.ArrayList;

/**
 *
 * @author JOSUE
 */
public class PersistenciaBebida {
    private ArrayList<Bebida> bebidas;
    public PersistenciaBebida(){
       bebidas= new ArrayList<Bebida>();
        //Cervezas
        Bebida c1 = new Bebida("cerveza","corona");
        Bebida c2 = new Bebida("cerveza","victoria");
        Bebida c3 = new Bebida("cerveza","barrilito");
        //Brandys
        Bebida b1 = new Bebida("brandy","torres 10");
        Bebida b2 = new Bebida("brandy","azteca de oro");
        Bebida b3 = new Bebida("brandy","don pedro");
        //tequilas
        Bebida t1 = new Bebida("tequila","el jimador");
        Bebida t2 = new Bebida("tequila","cazadores");
        Bebida t3 = new Bebida("tequila","el corralejo");
        //whisky
        Bebida w1 = new Bebida("whisky","buchanans");
        Bebida w2 = new Bebida("whisky","jack daniels");
        Bebida w3 = new Bebida("whisky","chivas regal");
        
        bebidas.add(c1);
        bebidas.add(c2);
        bebidas.add(c3);
        bebidas.add(b1);
        bebidas.add(b2);
        bebidas.add(b3);
        bebidas.add(t1);
        bebidas.add(t2);
        bebidas.add(t3);
        bebidas.add(w1);
        bebidas.add(w2);
        bebidas.add(w3);
       
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }
    
    public ArrayList<Bebida> GenerarBebida(String tipo){
         ArrayList<Bebida> subBeb = new ArrayList<Bebida>();
       for(Bebida b:bebidas){
         if(b.getTipo().equals(tipo)){
           subBeb.add(b);
        
        }
       }
        return subBeb;
    }
}
