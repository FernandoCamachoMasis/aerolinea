package Logica;


public class Tiquete {

    private int id;
    private String client;
    private String gestA;
    private String asiento;

    public Tiquete(int id, String client, String gestA, String asiento) {
        this.id = id;
        this.client = client;
        this.gestA = gestA;
        this.asiento = asiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getGestA() {
        return gestA;
    }

    public void setGestA(String gestA) {
        this.gestA = gestA;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

}
