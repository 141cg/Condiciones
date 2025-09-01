package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("sistema de control de ascenso de personas");
        //recibir el peso sumado de 5 usuarios
        //recibir la altura sumada de 5 usuarios

        Scanner leerTeclado= new Scanner(System.in);

        Integer pesoUsuario;
        Integer alturaUsuario;

        System.out.println("digita el peso de los 5 usuarios");
        pesoUsuario=leerTeclado.nextInt();

        System.out.println("digita la altura de los 5 usuarios");
        alturaUsuario=leerTeclado.nextInt();

        if (pesoUsuario<150){
            System.out.println("sigue tu destino,gracias");
        }else{
            System.out.println("lo siento no pasa");
        }

    }
}