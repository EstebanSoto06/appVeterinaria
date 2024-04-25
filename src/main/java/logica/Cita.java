package logica;

import java.util.Random;


public class Cita {
    private String numeroCita;
    private String nombreCliente;
    private String nombreMascota;
    private String motivo;
    private String detalles;
    private String hora;
    private String fecha;

    public Cita(String numeroCita, String nombreCliente, String nombreMascota, String motivo, String detalles, String hora, String fecha) {
        this.numeroCita = numeroCita;
        this.nombreCliente = nombreCliente;
        this.nombreMascota = nombreMascota;
        this.motivo = motivo;
        this.detalles = detalles;
        this.hora = hora;
        this.fecha = fecha;
    }

    public String getNumeroCita() {
        return numeroCita;
    }

    public void setNumeroCita(String numeroCita) {
        this.numeroCita = numeroCita;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Cita{" + "numeroCita=" + numeroCita + ", nombreCliente=" + nombreCliente + ", nombreMascota=" + nombreMascota + ", motivo=" + motivo + ", detalles=" + detalles + ", hora=" + hora + ", fecha=" + fecha + '}';
    }
}
