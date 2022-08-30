package entidades;

import java.util.Objects;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Pais {

    private String nombrePais;
    private Integer Poblacion;

    public Pais() {
    }

    public Pais(String nombrePais, int Poblacion) {
        this.nombrePais = nombrePais;
        this.Poblacion = Poblacion;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public Integer getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(int Poblacion) {
        this.Poblacion = Poblacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nombrePais);
        hash = 47 * hash + this.Poblacion;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (this.Poblacion != other.Poblacion) {
            return false;
        }
        if (!Objects.equals(this.nombrePais, other.nombrePais)) {
            return false;
        }
        return true;
    }

   



    @Override
    public String toString() {
        return "Pais{" + "nombrePais=" + nombrePais + ", Poblacion=" + Poblacion + '}';
    }

}
