package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Alumno {

    private String nombre;
    private List<Integer> notas = new ArrayList();

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(Integer x) {
        notas.add(x);
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota=" + notas + '}';
    }

}
