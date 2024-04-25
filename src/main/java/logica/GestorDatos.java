package logica;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestorDatos {
    private List<Cliente> listaClientes;
    private List<Mascota> listaMascotas;
    private List<Cita> listaCitas;
    private List<HistorialClinico> listaHistorialesClinicos;

    public GestorDatos() {
        this.listaClientes = new ArrayList<>();
        this.listaMascotas = new ArrayList<>();
        this.listaCitas = new ArrayList<>();
        this.listaHistorialesClinicos = new ArrayList<>();
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(List<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    public List<Cita> getListaCitas() {
        return listaCitas;
    }

    public void setListaCitas(List<Cita> listaCitas) {
        this.listaCitas = listaCitas;
    }

    public List<HistorialClinico> getListaHistorialesClinicos() {
        return listaHistorialesClinicos;
    }

    public void setListaHistorialesClinicos(List<HistorialClinico> listaHistorialesClinicos) {
        this.listaHistorialesClinicos = listaHistorialesClinicos;
    }
    
    // GESTIONAR DATOS CLIENTES
    // LEER
    public static List<Cliente> leerClientes() {
        List<Cliente> clientes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Clientes.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 3) {
                    String nombre = datos[0];
                    String direccion = datos[1];
                    String contacto = datos[2];
                    Cliente cliente = new Cliente(nombre, direccion, contacto);
                    clientes.add(cliente);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clientes;
    }
    
    // ESCRIBIR
    public void escribirClientes(List<Cliente> clientes) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Clientes.txt"))) {
            for (Cliente cliente : clientes) {
                bw.write(cliente.getNombre() + "," + cliente.getDireccion() + "," + cliente.getContacto() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // GESTIONAR DATOS MASCOTAS
    // LEER
    public static List<Mascota> leerMascotas() {
        List<Mascota> mascotas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Mascotas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 6) {
                    String duenno = datos[0];
                    String nombre = datos[1];
                    String raza = datos[2];
                    int edad = Integer.parseInt(datos[3]);
                    int peso = Integer.parseInt(datos[4]);
                    String condiciones = datos[5];
                    Mascota mascota = new Mascota(duenno, nombre, raza, edad, peso, condiciones);
                    mascotas.add(mascota);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mascotas;
    }

    // ESCRIBIR
    public void escribirMascotas(List<Mascota> mascotas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Mascotas.txt"))) {
            for (Mascota mascota : mascotas) {
                bw.write(mascota.getDuenno() + "," + mascota.getNombre() + "," +
                        mascota.getRaza() + "," + mascota.getEdad() + "," +
                        mascota.getPeso() + "," + mascota.getCondiciones() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // GESTIONAR DATOS CITAS
    // LEER
    public static List<Cita> leerCitas() {
        List<Cita> citas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Citas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 7) {
                    String numeroCita = datos[0];
                    String nombreCliente = datos[1];
                    String nombreMascota = datos[2];
                    String motivo = datos[3];
                    String detalles = datos[4];
                    String hora = datos[5];
                    String fecha = datos[6];
                    Cita cita = new Cita(numeroCita, nombreCliente, nombreMascota, motivo, detalles, hora, fecha);
                    citas.add(cita);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return citas;
    }

    // ESRCRIBIR
    public void escribirCitas(List<Cita> citas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Citas.txt"))) {
            for (Cita cita : citas) {
                bw.write(cita.getNumeroCita() + "," + cita.getNombreCliente() + "," +
                        cita.getNombreMascota() + "," + cita.getMotivo() + "," +
                        cita.getDetalles() + "," + cita.getHora() + "," +
                        cita.getFecha() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // GESTIONAR DATOS HISTORIAL CLINICO
    // LEER
    public static List<HistorialClinico> leerHistorialesMedicos() {
        List<HistorialClinico> historiales = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("HistorialesMedicos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(", AnalisisMedicos\\{|\\}. Medicamentos\\{");
                if (partes.length == 3) {
                    String nombreMascota = partes[0];
                    String[] analisisMedicos = partes[1].split(", ");
                    String[] medicamentos = partes[2].split(", ");
                    
                    List<String> listaAnalisisMedicos = new ArrayList<>(Arrays.asList(analisisMedicos));
                    List<String> listaMedicamentos = new ArrayList<>(Arrays.asList(medicamentos));
                    historiales.add(new HistorialClinico(nombreMascota, listaAnalisisMedicos, listaMedicamentos));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return historiales;
    }
    
    // ESCRIBIR
    public void escribirHistorialesMedicos(List<HistorialClinico> historiales) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("HistorialesMedicos.txt"))) {
            for (HistorialClinico historial : historiales) {
                bw.write(historial.getNombreMascota() + ", AnalisisMedicos{" + String.join(", ", historial.getAnalisisMedicos()) + "}. Medicamentos{" + String.join(", ", historial.getMedicamentos()) + "}\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
