package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leerTeclado = new Scanner(System.in);
        String azul="\u001B[34m";
        System.out.println(azul+"Tomando decisiones");
        System.out.println("usted tiene casa propio");
        Boolean respuesta=leerTeclado.nextBoolean();

        System.out.println("El resultado fue: "+respuesta);
        if(respuesta==true){
            System.out.println("Felicidades usted tiene casa propia");
        }else{
            System.out.println("lo sentimos, prontamente tendras casa");
        }

    }
}