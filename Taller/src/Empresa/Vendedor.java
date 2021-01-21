/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Vendedor extends Empleado{
    
    private static String PUESTO= "Vendedor";
    private Carro carro;
    private String celular;
    private String area_ventas;
    private int porcentaje;
    

    public Vendedor(String celular, String area_ventas, int porcentaje, 
                        Carro carro, String nombre, String apellido, String cc, 
                        String direccion, String anios_antiguedad, String telefono, int salario, String supervisor) {
        super(nombre, apellido, cc, direccion, anios_antiguedad, telefono, salario, supervisor);
        this.celular = celular;
        this.area_ventas = area_ventas;
        this.porcentaje = porcentaje;
        this.carro = carro;
    }

    public Vendedor(String nombre, String apellido, String cc, String direccion, String telefono, double salario,String area_ventas) {
        super(nombre, apellido, cc, direccion, telefono, salario);
        this.area_ventas = area_ventas;
    }
    
    
    
    public void imprimirDatosPersonales(){
        JOptionPane ventana = new JOptionPane();
        String cadenaCompleta = imprimir()+ "\n" +"Puesto: " + PUESTO
                                            + "\n" +"Area de Ventas: " + getArea_ventas();
        ventana.showMessageDialog(ventana,cadenaCompleta);
    }
    
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getArea_ventas() {
        return area_ventas;
    }

    public void setArea_ventas(String area_ventas) {
        this.area_ventas = area_ventas;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Carro getCarro() {
        return carro;
    }

    public void CambiarCarro(Carro carro) {
        this.carro = carro;
    }
    
    
    
    
    
    
    
}
