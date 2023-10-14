package revVehicular;

public class Duenio {
    private String nombre;
    private String id;
    private Vehiculo vehiculo;

    public Duenio(String nombre, String id, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.id = id;
        this.vehiculo = vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return String.format("Duenio: %s con id %s",this.nombre,this.id);
    }
}
