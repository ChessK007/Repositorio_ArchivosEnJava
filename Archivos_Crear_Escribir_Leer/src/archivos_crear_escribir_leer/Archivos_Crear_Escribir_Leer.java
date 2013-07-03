/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_crear_escribir_leer;

/**
 *
 * @author Shadow
 */
public class Archivos_Crear_Escribir_Leer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String cadena = "Julio";
//        try {
//            int x = Integer.parseInt(cadena);
//
//        } catch (NumberFormatException e) {
//            System.out.println("Error no es un numero" + e);
//        }
//        Archivo obj = new Archivo("Shadow_JJCamacho@live.com.mx");
//        obj.Escribir();
//        
//        Archivo_TextoPlano atp = new Archivo_TextoPlano();
//        atp.CrearArchivo();
//        atp.EscribirArchivo();
//        atp.LeerArchivo();
//        
                Archivos_Binarios ab = new Archivos_Binarios();
        ab.CrearArchivo();
        ab.EscribirArchivo();
        ab.LeerArchivo();
        
    }
}
