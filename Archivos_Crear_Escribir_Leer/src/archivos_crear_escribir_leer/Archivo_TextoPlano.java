/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_crear_escribir_leer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;

/**
 *
 * @author Shadow
 */
public class Archivo_TextoPlano {

    private File f;

    public void CrearArchivo() {
        try {
            f = new File("C:\\Users\\Shadow\\Documents\\NetBeansProjects\\Archivos_Crear_Escribir_Leer\\Archivo.txt");
        } catch (Exception e) {
            System.out.println("Error al crear el archivo" + e);
        }
    }

    public void EscribirArchivo() {
        try {
            FileWriter fr = new FileWriter(f);
            fr.write("Hola Chess \nEn fin este video tutorial \nresulto bueno\n");
            fr.close();
        } catch (Exception e) {
            System.out.println("Error al escribir el archivo" + e);
        }
    }

    public void LeerArchivo() {
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
               
            }
             br.close();
                fr.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo" + e);
        }
    }
}
