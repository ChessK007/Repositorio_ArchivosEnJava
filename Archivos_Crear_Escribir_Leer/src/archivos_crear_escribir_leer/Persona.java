/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_crear_escribir_leer;

import java.io.Serializable;

/**
 *
 * @author Shadow
 */
public class Persona implements Serializable{
        
private String nombre;
private String apellido;
private int dni;

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
}
