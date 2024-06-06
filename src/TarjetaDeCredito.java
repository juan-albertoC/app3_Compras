/*
Juan Alberto Cuevas Juarez
02/06/2024
Objetivo: Comprar articulos con Tarjeta de credito
Clase: TarjetaDeCredito
 */

import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {
    //atributos privados
    private double limite;
    private double saldo;
    private List<Compra> listaDeCompras;

    //Constructor de la tarjeta de credito
    public TarjetaDeCredito(double limite) {       //recibe solo limite
        this.limite = limite;
        this.saldo = saldo;
        this.listaDeCompras = new ArrayList<>();
    }

    //Logica
    public boolean lanzarCompra (Compra compra) {   //recibe una compra
        if(this.saldo >= compra.getValor()) {      //condicion que saldo es mayor o igual que getvalor de la compra
               this.saldo -= compra.getValor();    //hacer operacion de restar saldo menos valor de la compra
               this.listaDeCompras.add(compra);    //agregar la compra a la listaDeCompras
               return true;                        //devolver true
        }
        return false;   //condicion falsa saldo es menor que valor de compra
    }


    //solo generar getters ya que setters no para alterar el limite ni saldo, tampoco la listaDeCompras
    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }
}
