
package Clientes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EncontrarClientes {
    String id;
    
    public EncontrarClientes(String id){
        this.id=id;
    }
    
    public void buscarCliente(){
        String rutaArchivo="archivoClientes.txt";
        String id=this.id;
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            int numeroLinea=0;
            
            try {
                while((linea = br.readLine()) != null){
                    numeroLinea++;
                    if(linea.contains(id)){
                        System.out.println(id);
                    }else{
                        System.out.println("No se encontró el registro");
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(EncontrarClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EncontrarClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
