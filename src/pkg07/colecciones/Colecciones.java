package pkg07.colecciones;

import entidades.Alumno;
import entidades.Pais;
import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import servicios.AlumnoService;
import servicios.PaisService;
import servicios.PeliculaService;
import servicios.ProductosService;
import utilidades.Comparadores;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ejercicio1y2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        ejercicio6();

    }

    public static void ejercicio1y2() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        List<String> razas = new ArrayList();
        String aux = "";
        String respuesta = "";
        //EJERCICIO 1
        while (true) {
            System.out.print("Ingrese raza: ");
            aux = sc.next();
            razas.add(aux);

            System.out.println("Salir? y/n");
            respuesta = sc.next();
            if (respuesta.toLowerCase().equals("y")) {
                break;
            }
        }
        System.out.println("Mostrar con ForEach");
        for (String raza : razas) {
            System.out.println(raza);
        }
        Collections.sort(razas);

        System.out.println("\nOrdenado:");
        for (String raza : razas) {
            System.out.println(raza);
        }

        //EJERCICIO 2
        Iterator<String> it = razas.iterator();
        System.out.print("Buscar raza: ");
        String perroBuscado = sc.next();
        Boolean bandera = true;
        while (it.hasNext()) {
            aux = it.next();
            if (aux.equals(perroBuscado)) {
                System.out.println("Elemento eliminado :'" + aux + "'");
                it.remove();
                bandera = false;
            }
        }
        if (bandera) {
            System.out.println("No se encontró el elemento en la lista");
        }

        System.out.println("\n\nMostrar con arrow function");
        razas.forEach((k) -> System.out.println(k));

//        HashMap<String, String> alumnos = new HashMap();
//
//        alumnos.put("arbo#.", "6");
//        alumnos.put("bobo", "3");
//        alumnos.put("casa", "7");
//        alumnos.put("e", "5");
//        alumnos.put("dedo", "4");
//        alumnos.put("facu", "2");
//        alumnos.put("gato", "1");
//
//        System.out.println(alumnos);
//
//        TreeMap<String, Integer> alumnosTree = new TreeMap(alumnos);
//        System.out.println(alumnosTree);
    }

    public static void ejercicio3() {
        AlumnoService sv = new AlumnoService();
        List<Alumno> listaAlumnos = sv.crearAlumnos();

        for (Alumno x : listaAlumnos) {
            System.out.println(x);
        }
        sv.notaFinal(listaAlumnos);
    }

    public static void ejercicio4() {
        PeliculaService sv = new PeliculaService();
        ArrayList<Pelicula> listilla = sv.crearPeliculas();
        sv.mostrarPelis(listilla);
        sv.mostrarPelisLargas(listilla);
        sv.mayorAMenor(listilla);
        sv.menorAMayor(listilla);
        sv.tituloOrdenar(listilla);
        sv.directorOrdenar(listilla);
    }

    public static void ejercicio5() {
        PaisService sv = new PaisService();
        HashSet<Pais> paises = sv.crearHashSetlistPaises();
        sv.mostrar(paises);
    }

    public static void ejercicio6() {
        ProductosService sv = new ProductosService();
        HashMap<String, Integer> mapa = sv.crearLista();
        System.out.println(mapa);

        sv.agregarElemento(mapa);
        System.out.println(mapa);

        sv.modificarPrecio(mapa);
        System.out.println(mapa);

        sv.eliminarProducto(mapa);
        System.out.println(mapa);
        sv.mostrar(mapa);

    }

}
