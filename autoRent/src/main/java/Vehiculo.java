import java.time.LocalDate;

public class Vehiculo {
    private String placa;
    private String modelo;
    private LocalDate anioFabricacion;
    private double tarifa;

    private Estado estado;

    public Vehiculo(String placa, String modelo, LocalDate anioFabricacion, double tarifa, Estado estado1) {
        this.placa = placa;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.tarifa = tarifa;
        this.estado = estado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
