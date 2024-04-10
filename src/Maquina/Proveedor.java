package Maquina;

import java.util.ArrayList;

public class Proveedor {
    private String nombre;
    private  String salario;
    private Integer id;
    private String vehiculoAsignado;
    private String campania;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVehiculoAsignado() {
        return vehiculoAsignado;
    }

    public void setVehiculoAsignado(String vehiculoAsignado) {
        this.vehiculoAsignado = vehiculoAsignado;
    }

    public String getCampania() {
        return campania;
    }

    public void setCampania(String campania) {
        this.campania = campania;
    }

    public void proveer(MaquinaExpendedora maquina, ArrayList<Producto> productos)  throws StockOverflowException {
        ArrayList<Producto> listaInicial = maquina.getProductos();
        listaInicial.addAll(productos);
        maquina.setProductos(listaInicial);
    }

    public void administrar(MaquinaExpendedora maquina) throws AdministrationException {
        // Revisar fecha de vencimiento de todos los productos
        for (Producto producto : maquina.getProductos()) {
            maquina.revisarFechaVencimiento(producto);
        }

        // Revisar el stock de todos los productos
        for (Producto producto : maquina.getProductos()) {
            maquina.revisarStock(producto);
        }
    }
}
