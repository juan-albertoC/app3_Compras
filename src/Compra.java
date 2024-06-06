/*
Juan Alberto Cuevas Juarez
02/06/2024
Objetivo: Comprar articulos con Tarjeta de credito
Clase: Compra
 */

public class Compra implements Comparable<Compra> {  //una Compra va compararse con otra <Compra> generics<>
    private double valor;  //atributo privado valor de tipo double primitivo
    private String descripcion;

    //constructor
    public Compra(double valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }
    //getters
    public double getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }
    //visualizar la compra con to string
    @Override
    public String toString() {
        return "Compra: valor=" + valor +
                ", descripcion='" + descripcion;
    }

    //Implementar metodo compareTo para ordenar lista por valor del producto
    @Override
    public int compareTo(Compra otraCompra) {   //otraCompra es con la que se va a comparar el objeto
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.getValor()));
        //casting de la clase Double que engloba un tipo primitivo y agregar metodos
    }
}
