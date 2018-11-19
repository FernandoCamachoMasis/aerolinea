package Logica;


public class Horario {
    
    private int id;
    private int ruta;
    private int dia;
    private int hora_salida;
    private int min_salida;
    private int hora_llegada;
    private int min_llegada;
    private float precio;

    public Horario(int id, int ruta, int dia, int hora_salida, int min_salida, int hora_llegada, int min_llegada, float precio) {
        this.id = id;
        this.ruta = ruta;
        this.dia = dia;
        this.hora_salida = hora_salida;
        this.min_salida = min_salida;
        this.hora_llegada = hora_llegada;
        this.min_llegada = min_llegada;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRuta() {
        return ruta;
    }

    public void setRuta(int ruta) {
        this.ruta = ruta;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(int hora_salida) {
        this.hora_salida = hora_salida;
    }

    public int getMin_salida() {
        return min_salida;
    }

    public void setMin_salida(int min_salida) {
        this.min_salida = min_salida;
    }

    public int getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(int hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public int getMin_llegada() {
        return min_llegada;
    }

    public void setMin_llegada(int min_llegada) {
        this.min_llegada = min_llegada;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    
}
