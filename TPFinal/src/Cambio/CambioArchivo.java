
package Cambio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CambioArchivo {


    
    public void guardarInfo(CambioClientes cambioClientes){    
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("ArchivoCambio.txt",true));
            bw.write(
                    cambioClientes.getUsuario() + "," +
                    cambioClientes.getId() + "," +
                    cambioClientes.getNombre() + "," +
                    cambioClientes.getApellido()
            );
            bw.newLine();
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(CambioArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
