/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_crear_escribir_leer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shadow
 */
public class Archivos_Binarios {

    private File f;

    public void CrearArchivo() {
        try {
            f = new File("C:\\Users\\Shadow\\Documents\\NetBeansProjects\\Archivos_Crear_Escribir_Leer\\Personas.obj");
        } catch (Exception e) {
            System.out.println("Error al crear el archivo");
        }
    }

    public void EscribirArchivo() {
        List<Persona> personas = new ArrayList<Persona>();
        
        personas.add(new Persona("Jesus", "Camacho", 123));
        personas.add(new Persona("Astrid", "Duran", 321));
        personas.add(new Persona("Juan", "Rocha", 542));
try{
    FileOutputStream fos = new FileOutputStream(f);
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(personas);
    oos.close();
    fos.close();
}catch(Exception e){
    System.out.println("Error al escribir el archivo" + e);
}
    }
    public void LeerArchivo(){
    List<Persona> personas = null;
    try{
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        personas = (ArrayList<Persona>)ois.readObject();
        if (personas != null) {
            for (Persona p:personas) {
                System.out.println(p.getNombre() + "" + p.getApellido() + "" + p.getDni());   
            }
            
        }
        ois.close();
        fis.close();
    }catch(Exception e){
        System.out.println("Error al leer el archivo" + e);
    }
    }
}
