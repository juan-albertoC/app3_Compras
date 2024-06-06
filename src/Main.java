/*
Juan Alberto Cuevas Juarez
02/06/2024
Objetivo: Comprar articulos con Tarjeta de credito
Clase: Main
 */

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //-------------------- Tarjeta de credito tiene un limite de saldo--------------------------------------------//
        Scanner lectura = new Scanner(System.in);                 //variable lectura
        System.out.println("Escriba el límite de la tarjeta: ");
        double limite = lectura.nextDouble();                     //inicializa un double con variable lectura metodo nextDouble()
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(limite);  //crea un objeto tarjeta de tipo TarjetaDeCredito que depende de su constructor

        int salir = 1;                                            //variable de parada del while
        while(salir != 0) {
            System.out.println("Escriba la descripción de la compra:");
            String descripcion = lectura.next();                  //inicializa un String descripcion con la variable lectura metodo next()

            System.out.println("Escriba el valor de la compra:");
            double valor = Double.valueOf(lectura.next());        //inicializa un double valor con  metodo valueOf()

            //------------Crear una nueva compra que tiene un valor y una descripcion-------
            Compra compra = new Compra(valor, descripcion);       //dependiendo de su constructor de la clase Compra
            boolean compraRealizada = tarjeta.lanzarCompra(compra); //true o false ¿Se realizo una nueva compra?

            if (compraRealizada) {
                System.out.println("Compra realizada!");          //condicion es verdad entonces mensaje
                System.out.println("Escriba 0 para salir o 1 para continuar");//salir o seguir comprando
                salir = lectura.nextInt();                        //salir
            } else {
                System.out.println("Saldo insuficiente!");        //falso entonces mensaje
                salir = 0;
            }
        }
        //---------------------Resumen de las compras realizadas  e informacion de saldo disponible en la tarjeta
        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(tarjeta.getListaDeCompras());            //ordenar por valor del producto de listaDeCompras con sort
        for (Compra compra : tarjeta.getListaDeCompras()) {       //ciclo for desde compra hasta: obtener la listaDeCompras del objeto tarjeta
            System.out.println(compra.getDescripcion() + " - " +compra.getValor()); //imprime obtener descripcion y valor del objeto compra
        }
        System.out.println("\n***********************");
        System.out.println("\nSaldo de la tarjeta: " +tarjeta.getSaldo()); //obtner saldo disponible del objeto tarjeta
    }
}