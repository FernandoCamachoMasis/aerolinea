package Logica;


public class Avion {

    
    
    public String identificador;
    public String ruta;
    public String horario;
    public String tipo;
    

    public Avion(String identificador, String ruta, String horario, String tipo) {
        this.identificador = identificador;
        this.ruta = ruta;
        this.horario = horario;
        this.tipo = tipo;
    }
    
    public String getIdentificador() {
        return identificador;
    }

    
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    
    public String getRuta() {
        return ruta;
    }

    
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

   
    public String getHorario() {
        return horario;
    }

   
    public void setHorario(String horario) {
        this.horario = horario;
    }

   
    public String getTipo() {
        return tipo;
    }

  
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


   
}
