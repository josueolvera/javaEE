/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.weba;

import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author JOSUE
 */
public class ModeloBebida {
    public Map<Integer,Bebida>obtenerBebida(){
        String tipo="cerveza";
        
    Map<Integer,Bebida> mp = new HashMap<Integer,Bebida>();
        Bebida c1 = new Bebida("cerveza","corona");
        Bebida c2 = new Bebida("cerveza","victoria");
        Bebida c3 = new Bebida("cerveza","barrilito");
        mp.put(1,c1);
        mp.put(2,c2);
        mp.put(3,c3);
        //Brandys
        Bebida b1 = new Bebida("brandy","torres 10");
        Bebida b2 = new Bebida("brandy","azteca de oro");
        Bebida b3 = new Bebida("brandy","don pedro");
        mp.put(4,b1);
        mp.put(5,b2);
        mp.put(6,b3);
        //tequilas
        Bebida t1 = new Bebida("tequila","el jimador");
        Bebida t2 = new Bebida("tequila","cazadores");
        Bebida t3 = new Bebida("tequila","el corralejo");
        mp.put(7,t1);
        mp.put(8,t2);
        mp.put(9,t3);
        //whisky
        Bebida w1 = new Bebida("whisky","buchanans");
        Bebida w2 = new Bebida("whisky","jack daniels");
        Bebida w3 = new Bebida("whisky","chivas regal");
        mp.put(1,w1);
        mp.put(1,w2);
        mp.put(1,w3);
    
    
    if( tipo.equals(c1.getTipo())){
    
    
    } 
        return mp;
    }
    }
