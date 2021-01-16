/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

import Empresa.Empleado;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Secretario extends Empleado {

    private String despacho;
    private int numero_fax;

    public Secretario(String despacho, int numero_fax, String nombre, String apellido, String cc, String direccion,
            String anios_antiguedad, String telefono, float salario, String supervisor) 
    {
        super(nombre, apellido, cc, direccion, anios_antiguedad, telefono, salario, supervisor);
        this.despacho = despacho;
        this.numero_fax = numero_fax;
    }

    public Secretario(String nombre, String apellido, String cc, String direccion, String telefono, double salario) {
        super(nombre, apellido, cc, direccion, telefono, salario);
    }
    
  
    public String getDespacho() {
        return despacho;
    }
    
    public void imprimirInformacionCompleta(){
        JOptionPane ventana = new JOptionPane();
        String cadenaCompleta = getCadena() + "\n" +"Despacho: " + getDespacho() + "\n" +"Numero_Fax:" + getNumero_fax();
        ventana.showMessageDialog(ventana,cadenaCompleta);
    }
    
    public void imprimirDatosPersonales(){
        JOptionPane ventana = new JOptionPane();
        String cadenaCompleta = cadenaPersonal()+ "\n" +"Puesto: " + "Secretario";
        ventana.showMessageDialog(ventana,cadenaCompleta);
    }

    

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public int getNumero_fax() {
        return numero_fax;
    }

    public void setNumero_fax(int numero_fax) {
        this.numero_fax = numero_fax;
    }

}
