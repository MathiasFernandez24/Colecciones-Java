package servicios;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductosService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public HashMap<String, Integer> crearLista() {
        HashMap<String, Integer> mapa = new HashMap();
        String producto;
        Integer precio;

        while (true) {
            System.out.print("Producto: ");
            producto = sc.next();
            System.out.print("Precio: ");
            precio = sc.nextInt();
            mapa.put(producto, precio);

            System.out.println("Agregar otro elemento? Y/N");
            if (sc.next().equals("n")) {
                break;
            }
        }

        return mapa;
    }

    public HashMap<String, Integer> agregarElemento(HashMap<String, Integer> mapita) {
        System.out.print("Producto: ");
        String producto = sc.next();
        System.out.print("Precio: ");
        Integer precio = sc.nextInt();
        mapita.put(producto, precio);

        return mapita;
    }

    public void modificarPrecio(HashMap<String, Integer> mapita) {
        System.out.print("Producto a buscar: ");
        String aux = sc.next();
        if (mapita.containsKey(aux)) {
            System.out.println("Nuevo precio de " + aux);
            mapita.replace(aux, sc.nextInt());
        } else {
            System.out.println("no Existe");
        }
    }

    public void eliminarProducto(HashMap<String, Integer> mapita) {
        System.out.print("Producto a eliminar: ");
        String aux = sc.next();
        mapita.remove(aux);
    }
    
    public void mostrar(HashMap<String, Integer> mapita) {
        System.out.println("Productos totales: ");
        for (String key : mapita.keySet()) {
            System.out.println(key +" -> $"+mapita.get(key));
        }
    }
}
