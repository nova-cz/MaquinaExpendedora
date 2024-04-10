
package Maquina;

import java.util.ArrayList;
import java.util.Arrays;


public class Test {
    public static void main(String[] args) {

        // Crear productos
        Bebida bebida1 = new Bebida("Coca Cola", 20f,
                1, 10, "Refresco", "Coca Cola Company",
                "2024-04-01", "500ml", "Cola", "Cerrada", true, true);
        Dulce dulce1 = new Dulce("Carlos Quinto", 12f,
                2, 15, "Chocolate", "Nestle",
                "2024-05-01", "100g", "Suave", "Barra", "Chocolate", false);
        Fritura fritura1 = new Fritura("Takis", 17f,
                3, 20, "Snack", "Barcel",
                "2024-06-01", "50g", 50, false, true);

        // Crear máquina expendedora
        MaquinaExpendedora maquina = new MaquinaExpendedora();

        // Agregar productos a la máquina
        maquina.agregarProducto(bebida1);
        maquina.agregarProducto(dulce1);
        maquina.agregarProducto(fritura1);

        // Cliente compra un producto
        Cliente cliente = new Cliente(150f);
        Producto productoComprado = maquina.getProductos().get(0); // Suponiendo que el cliente compra la primera bebida en la lista

        try {
            if (cliente.comprar(productoComprado)) {
                System.out.println("Aquí está su producto.");
            } else {
                System.out.println("Dinero insuficiente.");
            }
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error: Objeto no inicializado - " + e.getMessage());
        }

        // Verificar estado del producto comprado
        try {
            if (productoComprado instanceof Bebida) {
                Bebida bebidaComprada = (Bebida) productoComprado;  // Castear el producto a bebida, para poder acceder a los métodos y propiedades específicas de la clase
                bebidaComprada.destapar();
                System.out.println("El estado de la bebida después de destapar: " + bebidaComprada.getEstado());
            }
        } catch (ClassCastException e) {
            // Esta excepion se lanza cuando la clase que se quiere castear no extiende del tipo esperado
            System.out.println("Error al castear el producto comprado a bebida: " + e.getMessage());
        } catch (NullPointerException e) {
            // Esta excepcion se lanza cuando el objeto a castear no esta inicializado, esta en null
            System.out.println("Error: Objeto no inicializado - " + e.getMessage());
        }

        // Proveedor provee más productos a la máquina
        Proveedor proveedor = new Proveedor();
        try {
            proveedor.proveer(maquina, new ArrayList<Producto>(Arrays.asList(new Bebida("Pepsi",
                    21f, 4, 15, "Refresco", "PepsiCo",
                    "2024-04-15", "500ml", "Cola", "Cerrada", true, true))));
        } catch (StockOverflowException e) {
            System.out.println("Error al proveer productos: " + e.getMessage());
        } catch (NullPointerException e) {
            // Esta excepcion se lanza cuando el objeto a castear no esta inicializado, esta en null
            System.out.println("Error: Objeto no inicializado - " + e.getMessage());
        }

        // Administrar la máquina
        try {
            proveedor.administrar(maquina);
        } catch (AdministrationException e) {
            System.out.println("Error al administrar la máquina: " + e.getMessage());
        } catch (NullPointerException e) {
            // Esta excepcion se lanza cuando el objeto a castear no esta inicializado, esta en null
            System.out.println("Error: Objeto no inicializado - " + e.getMessage());
        }

        // Imprimir productos en la máquina después de la administración
        System.out.println("Productos en la máquina después de la administración:");
        for (Producto producto : maquina.getProductos()) {
            System.out.println(producto.getNombre() + " - Cantidad: " + producto.getCantidadEnStock());
        }
    }
}
