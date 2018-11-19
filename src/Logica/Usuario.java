package Logica;

import java.sql.Date;


public class Usuario {

  
    public String usuario;
    public String password;
    public String nombre;
    public String apellidos;
    public String email;
    public String fecha;
    public String direccion;
    public int telefonoTrabajo;
    public int celular;
    
    
    public Usuario(String usuario, String password, String nombre, String apellidos,
            String email, String fecha, String direccion, int telefonoTrabajo, int celular) {
        this.usuario  = usuario;
        this.password = password;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.fecha  = fecha;
        this.direccion = direccion;
        this.telefonoTrabajo = telefonoTrabajo;
        this.celular = celular;
    }
    
    
    public String getUsuario() {
        return usuario;
    }

   
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

 
    public String getPassword() {
        return password;
    }

 
    public void setPassword(String password) {
        this.password = password;
    }


    public String getNombre() {
        return nombre;
    }

  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellidos() {
        return apellidos;
    }

 
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

 
    public String getEmail() {
        return email;
    }

 
    public void setEmail(String email) {
        this.email = email;
    }

   
    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

  
    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public int getTelefonoTrabajo() {
        return telefonoTrabajo;
    }


    public void setTelefonoTrabajo(int telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
    }


    public int getCelular() {
        return celular;
    }


    public void setCelular(int celular) {
        this.celular = celular;
    }

    

   
}
