package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String verde = "\u001B[32m";
        System.out.println("sistema integrado de transporte del valle de aburra");
        System.out.println("*********************");

        Scanner leerTeclado = new Scanner(System.in);

        String nombreUsuario;
        String ciudad;
        Integer estrato;
        String estacionMetro;

        // se crearon variables para cada uno

        System.out.println("ingresa tu usuario");
        nombreUsuario=leerTeclado.nextLine();

        System.out.println("ingresa tu ciudad");
        ciudad=leerTeclado.nextLine();

        System.out.println("estacion mas cercana");
        estacionMetro=leerTeclado.nextLine();

        System.out.println("estrato socioeconomico");
        estrato=leerTeclado.nextInt();

        //se creo una condicion lógica con su negación

       if (estrato==1){
           System.out.println("obtienes el subsidio");


       }else{
           System.out.println("no lo obtuviste, lo siento");
       }

       Integer pasajeDiario;
       Integer pasajeSemanal;

        System.out.println("cuanto cuesta el pasaje diario?");
        pasajeDiario= leerTeclado.nextInt();

        System.out.println("cuánto te sale semanal?");
        pasajeSemanal= leerTeclado.nextInt();

        if (pasajeSemanal>25000) {
            System.out.println("felicidades obtuviste 20000");
        }else{
            System.out.println("felicidades obtuviste 12500");
        }

        }


    }

