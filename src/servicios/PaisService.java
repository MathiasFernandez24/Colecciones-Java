package servicios;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
import entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import utilidades.Comparadores;

public class PaisService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public HashSet<Pais> crearHashSetlistPaises() {
        HashSet<Pais> lista = new HashSet();
        while (true) {
            lista.add(crearPais());
            System.out.println("\npresione 'n' para dejar de agregar paises");
            if ("n".equals(sc.next())) {
                break;
            }
        }
        return lista;
    }

    public Pais crearPais() {
        Pais pais = new Pais();
        System.out.println("\nCrear Pais:");
        System.out.print("Nombre: ");
        pais.setNombrePais(sc.next());
        System.out.print("Poblacion: ");
        pais.setPoblacion(sc.nextInt());
        return pais;
    }
//MOSTRAR NO FUNCIONA

    public void mostrar(HashSet<Pais> lista) {
        /* :: las 2 lineas de abajo hacen lo mismo, el doble puntodoble se utiliza para iterar dicha funcion dentro del for
        se pone :: antes de la funcion a llamar*/

        lista.stream().sorted(Comparadores.paisAscendente).forEach(System.out::println);
        lista.stream().sorted(Comparadores.paisAscendente).forEach((a) -> System.out.println(a));

        /*Comparar por población y si hay empate compara por Nombre*/
        lista.stream().sorted(Comparadores.paisAscendente.thenComparing(Comparadores.paisAscendenteString)).forEach(System.out::println);

        /**/
        TreeSet<Pais> listaOrdenada = new TreeSet();
        listaOrdenada.addAll(lista);

        System.out.println("\nContenido lista de Paises: ");

        for (Pais pais : listaOrdenada) {
            System.out.println(pais);
        }
    }

}
