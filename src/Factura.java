public class Factura {
    private double total;
    private Reparacion reparacion; // Asociación

    public Factura(double total, Reparacion reparacion) {
        this.total = total;
        this.reparacion = reparacion;
    }
}