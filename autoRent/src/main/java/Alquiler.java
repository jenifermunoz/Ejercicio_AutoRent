import java.time.LocalDate;

public class Alquiler {
    private String codigo;
    private int diasContratados;
    private LocalDate fecha;

    public Alquiler(String codigo, int diasContratados, LocalDate fecha) {
        this.codigo = codigo;
        this.diasContratados = diasContratados;
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getDiasContratados() {
        return diasContratados;
    }

    public void setDiasContratados(int diasContratados) {
        this.diasContratados = diasContratados;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
