package Maquina;
import java.util.*;

public class MaquinaExpendedora {
    private ArrayList<Producto> productos;
    private float ingresoTotal;

    public MaquinaExpendedora() {
        productos = new ArrayList<Producto>();
        ingresoTotal = 0;
    }

   /**
    * Elimina el producto  de la lista de productos y aumenta el ingreso Total
    * @param producto Recibe producto a  vender
    * */
    public void vender(Producto producto){
        if(productos.contains(producto)){
            productos.remove(producto);
            ingresoTotal += producto.getPrecio();
        }

    }

    public void recibirDinero(float dinero){
        ingresoTotal += dinero;
    }

    public float calcularCambio(float dinero, Producto producto){
        if (dinero > producto.getPrecio()){
            return dinero - producto.getPrecio();
        }

        return 0;
    }

    public void sacarProducto(Producto producto){
        if(productos.contains(producto)){
            productos.remove(producto);
        }
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public void revisarFechaVencimiento(Producto producto){
        if(producto.getFechaVencimiento().equals("Vencido")){
            productos.remove(producto);
        }
    }

    public void revisarStock(Producto producto){

      if(producto.getCantidadEnStock() == 0){
        productos.remove(producto);
    }
}
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public float getIngresoTotal() {
        return ingresoTotal;
    }

    public void setIngresoTotal(float ingresoTotal) {
        this.ingresoTotal = ingresoTotal;
    }
}
