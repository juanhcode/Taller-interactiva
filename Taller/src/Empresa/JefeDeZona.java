/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class JefeDeZona extends Empleado {
    private String codigo_oficina;
    private String cc_secretario ;
    private Vector<String> lista;
    private Carro carro;

    
    public JefeDeZona(String codigo_oficina, String cc_secretario,Vector<String> lista,Carro carro, String nombre, 
            String apellido, String cc, String direccion, String anios_antiguedad, String telefono, int salario, String supervisor) {
        
        super(nombre, apellido, cc, direccion, anios_antiguedad, telefono, salario, supervisor);
        this.codigo_oficina = codigo_oficina;
        this.cc_secretario = cc_secretario;
        this.lista = lista;
        this.carro = carro;
    }

    public JefeDeZona(String nombre, String apellido, String cc, String direccion, String telefono, double salario,String codigo_oficina) {
        super(nombre, apellido, cc, direccion, telefono, salario);
        this.codigo_oficina = codigo_oficina;
    }
    
    
    public void imprimirDatosPersonales(){
        JOptionPane ventana = new JOptionPane();
        String cadenaCompleta = imprimir()+ "\n" +"Salario: " + getSalario()
                                            + "\n" +"Codigo De Oficina: " + getCodigo_oficina();
        ventana.showMessageDialog(ventana,cadenaCompleta);
    }
 
    public String getCodigo_oficina() {
        return codigo_oficina;
    }

    public void setCodigo_oficina(String codigo_oficina) {
        this.codigo_oficina = codigo_oficina;
    }

    public String getCc_secretario() {
        return cc_secretario;
    }

    public void setCc_secretario(String cc_secretario) {
        this.cc_secretario = cc_secretario;
    }

    public Vector getLista() {
        return lista;
    }

    public void setLista(Vector<String> nuevaLista) {
        this.lista = nuevaLista;
    }
    
            
    
    
}
