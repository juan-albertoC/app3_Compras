/*
Juan Alberto Cuevas Juarez
02/06/2024
Objetivo: Comprar articulos con Tarjeta de credito
Clase: Compra
 */

public class Compra {
   private double valor;
   private String descripcion;

   //Constructor
    public Compra(double valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }

    //Getters

    public double getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //visualizar la compra con un toString
    @Override
    public String toString() {
        return "Compra: valor= " + valor +
                ", descripcion= " + descripcion;
    }
}
