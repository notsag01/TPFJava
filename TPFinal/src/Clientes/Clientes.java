
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

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMail() {
        return mail;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getHijos() {
        return hijos;
    }
    
}
