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

    //Constructor de la TarjetaDeCredito  que recibe como parametro solo limite
    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;     //es el limite tope de saldo
        this.listaDeCompras = new ArrayList<>();
    }

    //logica
    public boolean lanzarCompra(Compra compra){ //recibe como parametro una compra
        if(this.saldo >= compra.getValor()){    //condicion que saldo es mayor o igual que getvalor de la compra
            this.saldo -= compra.getValor();    //hacer operacion de restar saldo menos valor de la compra
            this.listaDeCompras.add(compra);    //agregar la compra a la listaDeCompras
            return true;                        //devolver true ya que es un metodo boolean
        }
        return false;                           //devolver false cuando saldo es menor que valor de compra
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
