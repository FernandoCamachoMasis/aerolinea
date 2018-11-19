package Logica;


public class Ruta {

    private int id;
    private int horas;
    private int minutos;
    private String salida;
    private String llegada;

    public Ruta(int id, int horas, int minutos, String salida, String llegada) {
        this.id = id;
        this.horas = horas;
        this.minutos = minutos;
        this.salida = salida;
        this.llegada = llegada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }

}
