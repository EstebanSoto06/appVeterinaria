
package logica;


public class Mascota {
    private String duenno;
    private String nombre;
    private String raza;
    private int edad;
    private int peso;
    private String condiciones;

    public Mascota(String duenno, String nombre, String raza, int edad, int peso, String condiciones) {
        this.duenno = duenno;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.condiciones = condiciones;
    }

    public String getDuenno() {
        return duenno;
    }

    public void setDuenno(String duenno) {
        this.duenno = duenno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }

    @Override
    public String toString() {
        return "mascota{" + "dueño=" + duenno + ", nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", peso=" + peso + ", condiciones=" + condiciones + '}';
    }
}
