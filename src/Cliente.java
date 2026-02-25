import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private List<Vehiculo> vehiculos; // Agregación

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }
}