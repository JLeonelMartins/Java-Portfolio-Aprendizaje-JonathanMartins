package ProgramacionOrientadaAObjetos.reservaAsientos;

public class Ticket {

    private int numeroTicket;
    private String fechaCompra;
    private String fechaValidez;
    private double precio;
    private int fila = 0;
    private int asiento = 0;
    private Cliente cliente;

    public Ticket(int numeroTicket, String fechaCompra, String fechaValidez, double precio, int fila, int asiento, Cliente cliente) {
        this.numeroTicket = numeroTicket;
        this.fechaCompra = fechaCompra;
        this.fechaValidez = fechaValidez;
        this.precio = precio;
        this.fila = fila;
        this.asiento = asiento;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "numeroTicket=" + numeroTicket +
                ", fechaCompra='" + fechaCompra + '\'' +
                ", fechaValidez='" + fechaValidez + '\'' +
                ", precio=" + precio +
                ", fila=" + fila +
                ", asiento=" + asiento +
                ", cliente=" + cliente +
                '}';
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setFechaValidez(String fechaValidez) {
        this.fechaValidez = fechaValidez;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public int getNumeroTicket() {
        return numeroTicket;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public String getFechaValidez() {
        return fechaValidez;
    }

    public double getPrecio() {
        return precio;
    }

    public int getFila() {
        return fila;
    }

    public int getAsiento() {
        return asiento;
    }
}
