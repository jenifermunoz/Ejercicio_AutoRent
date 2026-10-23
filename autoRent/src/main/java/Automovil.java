import java.time.LocalDate;

public class Automovil extends Vehiculo{
    private int puertas;
    private double recargo;

    public Automovil(String placa, String modelo, LocalDate anioFabricacion, double tarifa, Estado estado1, int puertas, double recargo) {
        super(placa, modelo, anioFabricacion, tarifa, estado1);
        this.puertas = puertas;
        this.recargo = recargo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }
}
