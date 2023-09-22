
package Clientes;


public class DataClientes {
    String usuario,nombre, apellido,fechaDeNacimiento,genero,cuil,domicilio,localidad,provincia,estadoCivil,hijos;
    
    public DataClientes(
            String usuario,
            String nombre, 
            String apellido,            
            String fechaDeNacimiento,            
            String genero,            
            String cuil,            
            String domicilio,            
            String localidad,            
            String provincia,            
            String estadoCivil,            
            String hijos            
        ){
        this.usuario=usuario;
        this.nombre=nombre;
        this.apellido=apellido;
        this.fechaDeNacimiento=fechaDeNacimiento;
        this.genero=genero;
        this.cuil=cuil;
        this.domicilio=domicilio;
        this.localidad=localidad;
        this.provincia=provincia;
        this.estadoCivil=estadoCivil;
        this.hijos=hijos;
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
        System.out.println(this.usuario + " " + 
                this.nombre + " " + 
                this.apellido + " " +
                this.fechaDeNacimiento + " " +
                this.genero + " " +
                this.cuil + " " +
                this.domicilio + " " +
                this.localidad + " " +
                this.provincia + " " +
                this.estadoCivil + " " +
                this.hijos                 
                );
    }
}
