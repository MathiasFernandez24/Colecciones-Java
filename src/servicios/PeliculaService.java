package servicios;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import utilidades.Comparadores;

public class PeliculaService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Pelicula> crearPeliculas() {
        ArrayList<Pelicula> listita = new ArrayList();

        while (true) {
            listita.add(crearPeli());
            System.out.println("Crear otra Peli?: y/n");
            if (sc.next().equals("n")) {
                break;
            }
        }

        return listita;
    }

    public Pelicula crearPeli() {
        Pelicula p = new Pelicula();
        System.out.print("Titulo de la Pelicula: ");
        p.setTitulo(sc.next());
        System.out.print("Director de la Pelicula: ");
        p.setDirector(sc.next());
        System.out.print("Duracion de la Pelicula (minutos): ");
        p.setDuracion(sc.nextInt());

        return p;
    }

    public void mostrarPelis(ArrayList<Pelicula> listonta) {
        System.out.println("Todas las peliculas son: ");
        for (Pelicula pelicula : listonta) {
            System.out.println("*" + pelicula.getTitulo());
        }
    }

    public void mostrarPelisLargas(ArrayList<Pelicula> listonta) {
        System.out.println("\nLas peliculas largas son: ");
        for (Pelicula pelicula : listonta) {
            if (pelicula.getDuracion() >= 60) {
                System.out.println("*" + pelicula.getTitulo());
            }

        }
    }

    public void mayorAMenor(ArrayList<Pelicula> lista) {
        Collections.sort(lista, Comparadores.descendente);
        System.out.println("\nPeliculas de mayor a menor duracion:");
        for (Pelicula pelicula : lista) {
            System.out.println("*" + pelicula.getTitulo() + " de " + pelicula.getDuracion() + " minutos");
        }
    }

    public void menorAMayor(ArrayList<Pelicula> lista) {
        Collections.sort(lista, Comparadores.ascendente);
        System.out.println("\nPeliculas de menor a mayor duracion:");
        for (Pelicula pelicula : lista) {
            System.out.println("*" + pelicula.getTitulo() + " de " + pelicula.getDuracion() + " minutos");
        }
    }

    public void tituloOrdenar(ArrayList<Pelicula> listisima) {
        Collections.sort(listisima, Comparadores.tituloAscendente);
        System.out.println("\nPeliculas ordenadas por titulo:");
        for (Pelicula pelicula : listisima) {
            System.out.println("*" + pelicula.getTitulo() + " de " + pelicula.getDirector());
        }
    }

    public void directorOrdenar(ArrayList<Pelicula> listisima) {
        Collections.sort(listisima, Comparadores.directorAscendente);
        System.out.println("\nPeliculas ordenadas por director:");
        for (Pelicula pelicula : listisima) {
            System.out.println("*" + pelicula.getTitulo() + " de " + pelicula.getDirector());
        }
    }
}
