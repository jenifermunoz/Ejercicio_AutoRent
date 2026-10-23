import java.time.LocalDate;

public class Camioneta extends Vehiculo{
    private double cantidadCarga;
    private double descuento;

    public Camioneta(String placa, String modelo, LocalDate anioFabricacion, double tarifa, Estado estado1, double cantidadCarga, double descuento) {
        super(placa, modelo, anioFabricacion, tarifa, estado1);
        this.cantidadCarga = cantidadCarga;
        this.descuento = descuento;
    }

    public double getCantidadCarga() {
        return cantidadCarga;
    }

    public void setCantidadCarga(double cantidadCarga) {
        this.cantidadCarga = cantidadCarga;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
