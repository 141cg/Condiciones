package org.example;

import java.util.Scanner;

public class Dos {
    public static void main(String[] args) {
        Integer edad;
        Scanner leerTeclado=new Scanner(System.in);
        System.out.println("digita tu edad");
        edad=leerTeclado.nextInt();

        if(edad>=18){
            System.out.println("Eres mayor, puedes ingresar");
        }else{
            System.out.println("no puedes ingresar");
        }

    }
}
