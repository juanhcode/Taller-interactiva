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
public class Cafetera 
{
    //atributos
    private int capacidadMax;
    private int cantidad;

    //Constructor por defecto
    public Cafetera(){
        this.capacidadMax = 1000;
        cantidad = 0;
    }

    //Segundo Constructor
    public Cafetera(int capacidadMaxima)
    {
        //this.capacidadMax = capacidadMaxima;
        cantidad = capacidadMaxima;
    }

    //tercer costructor
    public Cafetera(int capacidadMax,int cantidad) {
        this.capacidadMax = capacidadMax;
        if(cantidad > this.capacidadMax){
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
    
    public void llenarCafetera()
    {
        this.cantidad = this.capacidadMax;
    }
    public void servirTaza(int cantidad)
    {
<<<<<<< HEAD
    
            if (cantidad > capacidadMax){
            
                vaciarCafetera();
            }else
                capacidadMax -= cantidad;
         //
    }
    public void vaciarCafetera()
    {
        cantidad = 0;
    }
    
    public void agregarCafetera(int cantidad)
    {
        this.cantidad = cantidad;
    }
    
    
    
    
    
=======
        if(cantidad < cafe)
        {
            resultado = cafe - cantidad;
            System.out.println("cantidad de cafe en la taza: "+ cantidad);
            System.out.println("cantidad de la cafetera: "+ resultado);
          
        }
        else
        {
            resultado2 = cantidad -= cafe;
            int vacio = 0; 
            System.out.println("debido a la falta de cafe su taza tiene: "+ cafe);
            System.out.println("cantidad de cafe en la cafetera: "+ vacio);
            
        }
    }    
>>>>>>> 071e6a65d947b302489791a9de7d07a55cf55322
        
        
        
        
        
       
        
    }
   

 
}

