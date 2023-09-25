
package Clientes;


public class Clientes {
    String id,nombre,apellido,mail,fechaNacimiento,domicilio,localidad,provincia,estadoCivil,hijos;
    
    public Clientes(
            String id,
            String nombre, 
            String apellido, 
            String mail, 
            String fechaNacimiento, 
            String domicilio, 
            String localidad, 
            String provincia, 
            String estadoCivil, 
            String hijos){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.mail=mail;
        this.fechaNacimiento=fechaNacimiento;
        this.domicilio=domicilio;
        this.localidad=localidad;
        this.provincia=provincia;
        this.estadoCivil=estadoCivil;
        this.hijos=hijos;
    }
}
