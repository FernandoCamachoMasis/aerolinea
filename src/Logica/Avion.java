package Logica;


public class Avion {

    /**
     * @return the año
     */
    public String getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(String año) {
        this.año = año;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the cantidadAsientos
     */
    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    /**
     * @param cantidadAsientos the cantidadAsientos to set
     */
    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public Avion(String identificador, String ruta, String horario, String tipo, String año, String modelo, String marca, int cantidadAsientos) {
        this.identificador = identificador;
        this.ruta = ruta;
        this.horario = horario;
        this.tipo = tipo;
        this.año = año;
        this.modelo = modelo;
        this.marca = marca;
        this.cantidadAsientos = cantidadAsientos;
    }

    
    
    private String identificador;
    private String ruta;
    private String horario;
    private String tipo;
    private String año;
    private String modelo;        
    private String marca; 
    private int cantidadAsientos;
 

   
    
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
