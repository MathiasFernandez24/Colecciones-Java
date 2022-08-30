package utilidades;

import entidades.Pais;
import entidades.Pelicula;
import java.util.Comparator;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Comparadores {

    public static Comparator<Pelicula> descendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    public static Comparator<Pelicula> ascendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };

    public static Comparator<Pelicula> tituloAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };

    public static Comparator<Pelicula> directorAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };

    public static Comparator<Pais> paisAscendente = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getPoblacion().compareTo(t1.getPoblacion());
        }
    };
    public static Comparator<Pais> paisAscendenteString = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getNombrePais().compareTo(t1.getNombrePais());
        }
    };

}
