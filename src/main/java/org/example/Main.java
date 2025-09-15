package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Restaurante Tradicion Antigua");
        System.out.println("*****************************");

        String amarillo="\u001B[33m";
        System.out.println( amarillo+"Menu del dia:");
        System.out.println("1. Entradas:🥟");
        System.out.println("***** Emapanaditas de iglesia----> $18000");
        System.out.println("***** Picada Antioqueña (choricitos,morcillitas,patacon)----> $33000");
        System.out.println("***** Arepa de mote con quesito -----> $15000");
        System.out.println("***** Salchipapa PAISA (papa criolla. papa capira. chicharron,salchicha ranchera,queso ----> $35000");

String verde="\u001B[32m";
        System.out.println( verde+"2. Sobremesa: 🥤");
        System.out.println("***** Aguapanela con limón -----> $6000");
        System.out.println("***** Chocolate Migao -----> $12500" );
        System.out.println("***** Shot de Tapa Roja -----> $8000");
        System.out.println("***** Shot de Tapa Azul -----> $11000");
        System.out.println("***** Shot de Tapa Verde -----> $12000");
        System.out.println("***** Coctel Cucaracho -----> $38500");
        System.out.println("***** Coctel BlodyMary -----> $40000");
        System.out.println("***** Cabernet Sauvignon -----> $850000");

        String rojo="\u001B[31m";
        System.out.println( rojo+"3. Platos Fuertes:🥘");
        System.out.println("***** Sancocho Trifasico -----> $48000 ");
        System.out.println("***** Bandeja Paisa -----> $62000 ");
        System.out.println("***** Mondongo de la abuela -----> $52000 ");
        System.out.println("***** Sancocho Tifasico -----> $48000 ");
        System.out.println("***** Sopa del Obispo -----> $40000 ");
        System.out.println("***** Sopa de la JUANFE -----> $42000 ");

        String azul="\u001B[34m";
        System.out.println( azul+"4. Postres: 🍰");
        System.out.println("***** Arroz con Leche -----> 19500");
        System.out.println("*****  Brevas con Arequipa y Queso -----> $20000 ");
        System.out.println("***** Dulce Vitoria -----> $18000 ");


//Creando un ciclo para seleccionar el pedido

        Scanner leerTeclado= new Scanner(System.in);
Integer opcionMenu =0;
while(opcionMenu !=5){
    System.out.println("Digite una opcion");{}
    opcionMenu=leerTeclado.nextInt();
   }






    }
}