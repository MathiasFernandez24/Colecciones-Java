package servicios;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
import entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Alumno> crearAlumnos() {

        ArrayList<Alumno> listita = new ArrayList();
        while (true) {
            listita.add(crearAlumno());
            System.out.print("Desea salir? y/n: ");

            if (sc.next().equals("y")) {
                break;
            }
            System.out.println(listita);
        }
        return listita;
    }

    public Alumno crearAlumno() {
        Alumno a2 = new Alumno();
        System.out.print("Nombre: ");
        a2.setNombre(sc.next());
        System.out.print("Nota1: ");
        a2.setNotas(sc.nextInt());
        System.out.print("Nota2: ");
        a2.setNotas(sc.nextInt());
        System.out.print("Nota3: ");
        a2.setNotas(sc.nextInt());

        return a2;
    }

    public void notaFinal(List<Alumno> lista) {
        System.out.print("Nombre a buscar: ");
        String nombre = sc.next();

        for (Alumno alumno : lista) {
            if (nombre.equals(alumno.getNombre())) {
                float promedio = 0;
                for (int nota : alumno.getNotas()) {
                    promedio += nota;
                }
                System.out.println("El promedio de " + alumno.getNombre() + " es: " + (promedio / alumno.getNotas().size()));
                break;
            }
        }
        System.out.println("FIN PROGRAMA");
    }
}
