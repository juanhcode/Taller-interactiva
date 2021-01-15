/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

/**
 *
 * @author Asus
 */
public class vendedor extends Empleado{
    
    
    
    private String celular;
    private int area_ventas;
    private int porcentaje;
    
    
    private Carro carro;

    public vendedor(String celular, int area_ventas, int porcentaje, Carro carro, String nombre, String apellido, String cc, String direccion, String anios_antiguedad, String telefono, int salario, String supervisor) {
        super(nombre, apellido, cc, direccion, anios_antiguedad, telefono, salario, supervisor);
        this.celular = celular;
        this.area_ventas = area_ventas;
        this.porcentaje = porcentaje;
        this.carro = carro;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getArea_ventas() {
        return area_ventas;
    }

    public void setArea_ventas(int area_ventas) {
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

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
    
    
    
    
    
    
}
