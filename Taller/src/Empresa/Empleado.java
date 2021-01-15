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
public class Empleado {
    private String nombre;
    private String apellido;
    private String cc;
    private String direccion;
    private String cadena;
    
    private String anios_antiguedad;
    private String telefono;
    private float salario;
    private String supervisor;

    public Empleado(String nombre, String apellido, String cc, String direccion, String anios_antiguedad, String telefono, float salario, String supervisor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cc = cc;
        this.direccion = direccion;
        this.anios_antiguedad = anios_antiguedad;
        this.telefono = telefono;
        this.salario = salario;
        this.supervisor = supervisor;
    }

    public Empleado(String nombre, String apellido, String cc, String direccion, String telefono, float salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cc = cc;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
        this.anios_antiguedad = "0";
        this.supervisor = "";
    }
    
    public void imprimir()
    {
        JOptionPane ventana = new JOptionPane();
        ventana.showMessageDialog(ventana,cadena);
    }
    
    public String getCadena(){
        cadena = "Nombre: " + getNombre() + "\n" 
                                          + "Apellido: " + getApellido() + "\n"
                                          + "C.C: " + getCc() + "\n"
                                          + "Direccion: " + getDireccion() + "\n"
                                          + "Telefono: " + getTelefono() + "\n"
                                          + "Salario: " + getSalario()
                                          + "Años Antiguedad" + getAnios_antiguedad();
        return cadena;
    }
    
    
    public void incrementarSalario(float nuevosalario){
        this.salario += nuevosalario;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAnios_antiguedad() {
        return anios_antiguedad;
    }

    public void setAnios_antiguedad(String anios_antiguedad) {
        this.anios_antiguedad = anios_antiguedad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void cambiarSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
    
    
    
    

   
    
    
    
    
    
}
