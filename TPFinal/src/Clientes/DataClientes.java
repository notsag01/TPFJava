
package Clientes;


public class DataClientes {
    String usuario,nombre,apellido;
    
    public DataClientes(
            String usuario,
            String nombre, 
            String apellido
        ){
        this.usuario=usuario;
        this.nombre=nombre;
        this.apellido=apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public void imprimir(){
        System.out.println(this.usuario + " " + this.nombre + " " + this.apellido );
    }
}
