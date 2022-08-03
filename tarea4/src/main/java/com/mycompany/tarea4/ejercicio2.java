/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author izabe
 */
public class ejercicio2 {

    public static void main(String[] args) {

        ArrayList<productos> lista = new ArrayList<>();

        while (true) {

            Scanner sp = new Scanner(System.in);
            System.out.println("************************");
            System.out.println("1. Ingresar Datos");
            System.out.println("2. Mostrar datos");
            System.out.println("3. Cerrar");
            System.out.println("************************");
            int resp = sp.nextInt();

            switch (resp) {
                case 1:
                    
                    Scanner cr = new Scanner(System.in);
                    System.out.println("Ingrese codigo del producto");
                    int codigo = cr.nextInt();
                    System.out.println("Ingrese nombre del producto");
                    String nombre = cr.nextLine();
                    System.out.println("Ingrese descripcion del producto");
                    String descripcion = cr.nextLine();
                    System.out.println("Ingrese precio del producto");
                    float precio = cr.nextFloat();
                    System.out.println("Ingrese stock del producto");
                    int stock = cr.nextInt();
                    lista.add(new productos(codigo, nombre, descripcion, precio, stock));
                    break;
                case 2:
                    for (productos p : lista) {
                        System.out.println(p.codigo + "   " + p.nombre + "   " + p.descripcion + "   " + p.precio + "   " + p.stock);
                    }
                    break;

                case 3:
                    System.exit(0);
                    break;

            }
        }
    }
}
