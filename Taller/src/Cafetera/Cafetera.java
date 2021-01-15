/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafetera;

/**
 *
 * @author Usuario
 */
public class Cafetera {

    //atributos
    private int capacidadMax;
    private int cantidad;

    //Constructor por defecto
    public Cafetera() {
        this.capacidadMax = 1000;
        cantidad = 0;
    }

    //Segundo Constructor
    public Cafetera(int capacidadMax) {
        this.capacidadMax = capacidadMax;
        cantidad = this.capacidadMax;
    }

    //tercer costructor
    public Cafetera(int capacidadMax, int cantidad) {
        this.capacidadMax = capacidadMax;
        if (cantidad > this.capacidadMax) {
            cantidad = capacidadMax;
        }
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void llenarCafetera() {
        this.cantidad = this.capacidadMax;
    }

    public void servirTaza(int taza) {

        if (cantidad != 0 && cantidad >= taza && taza > 0)
        {   
           cantidad -= taza;
        System.out.println("la taza de cafe contiene: " + taza);
        
        }
        else if(cantidad < taza && taza > 0)
        {
           
            System.out.println("la taza de cafe contiene: " + cantidad);
            vaciarCafetera(); 
        }
        else{
            System.out.println("no puede aniadirse la cantidad deseada");
        }
       
    }

    public void vaciarCafetera() {
        cantidad = 0;
    }

    public void agregarCafetera(int cantidad) {

        //Cuando la cantidad esta en 100 y quiero agregarle , no se puede sumar
        //cuando vacio la cafetera y agrego mas de 1000 no puede permitirlo directo o por partes
        //this.cantidad += cantidad;
        if (cantidad >= 0) {
            if ((getCantidad() + cantidad) <= getCapacidadMax()) {
                this.cantidad += cantidad;
            } else {
                System.out.println("No se puede");
            }
        } else {
            System.out.println("No se puede introducir numeros negativos");
        }

    }

}
