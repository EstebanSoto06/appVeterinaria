package logica;

import java.util.List;

public class HistorialClinico {
    private String nombreMascota;
    private List<String> analisisMedicos;
    private List<String> medicamentos;

    public HistorialClinico(String nombreMascota, List<String> analisisMedicos, List<String> medicamentos) {
        this.nombreMascota = nombreMascota;
        this.analisisMedicos = analisisMedicos;
        this.medicamentos = medicamentos;
    }

    // Getters y setters
    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public List<String> getAnalisisMedicos() {
        return analisisMedicos;
    }

    public void setAnalisisMedicos(List<String> analisisMedicos) {
        this.analisisMedicos = analisisMedicos;
    }

    public List<String> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<String> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public void agregarAnalisisMedico(String analisisMedico) {
        analisisMedicos.add(analisisMedico);
    }

    public void agregarMedicamento(String medicamento) {
        medicamentos.add(medicamento);
    }
}
