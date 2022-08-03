/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tarea4;

import java.util.Scanner;

/**
 *
 * @author izabe
 */
public class Tarea4 {

    public static void main(String[] args) {
        int matriz[][] = new int[5][4];
        Scanner cr = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int[] is = matriz[j];
                System.out.println("Ingresa un numero");
                int num = cr.nextInt();
                matriz[i][j] = num;
            }

        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("|"+matriz[i][j]+"|");
            }
            System.out.println();
        }
    }
}
