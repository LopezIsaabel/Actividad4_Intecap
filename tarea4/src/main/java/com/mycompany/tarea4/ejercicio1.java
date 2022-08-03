/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea4;

import java.util.ArrayList;

/**
 *
 * @author izabe
 */
public class ejercicio1 {
    
    public static void main(String[] args) {
        ArrayList<empleados> lista= new ArrayList<>();
        lista.add(new empleados(1245698, "Carolina Lima", 25, 2589674, "carolina@gmail.com", "zona 5"));
        lista.add(new empleados(2545698, "Cristina Perez", 24, 85962457, "cristina@gmail.com", "zona 5"));
        lista.add(new empleados(8956988, "Harold Orellana", 35, 55559874, "harold@gmail.com", "zona 7"));
        lista.add(new empleados(2545698, "Natalia Vasquez", 45, 45896317, "natalia@gmail.com", "zona 2"));
        lista.add(new empleados(3698785, "Lesvia Flores", 19, 44225599, "lesvia@gmail.com", "zona 3"));
        lista.add(new empleados(2588974, "Armando Paredes", 20, 99663355, "armado@gmail.com", "zona 1"));
        lista.add(new empleados(3698574, "Andres Hernandez", 23, 58967524, "andres@gmail.com", "zona 6"));
        lista.add(new empleados(4458875, "Katherine Martinez", 55, 55639857, "katherine@gmail.com", "zona 18"));
        
        
       for(empleados sp: lista){
           System.out.println(sp.dpi+"   "+sp.nombre+"   "+sp.edad+"   "+sp.telefono+"   "+sp.correo+"   "+sp.direccion);
       }
    }
    
 
}
