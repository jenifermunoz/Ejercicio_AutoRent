import java.time.LocalDate;

public class Moto extends Vehiculo{
    private int cilindraje;
    private double descuento;

    public Moto(String placa, String modelo, LocalDate anioFabricacion, double tarifa, Estado estado1, int cilindraje, double descuento) {
        super(placa, modelo, anioFabricacion, tarifa, estado1);
        this.cilindraje = cilindraje;
        this.descuento = descuento;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
