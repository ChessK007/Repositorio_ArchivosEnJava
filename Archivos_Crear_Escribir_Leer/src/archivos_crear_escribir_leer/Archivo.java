/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_crear_escribir_leer;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Shadow
 */
public class Archivo {

    private String cadena;

    public Archivo(String cadena) {
        this.cadena = cadena;
    }
    public void Escribir(){
        byte [] arr = new byte[this.cadena.length()];
        try{
    FileOutputStream archivo = new FileOutputStream("Cadena.txt");
    this.cadena.getBytes(0, cadena.length(), arr, 0);
    archivo.write(arr);
    archivo.close();
        }catch(IOException e){
            System.out.println("Error al crear archivo");
        }
        }
    
    
    
    
}
