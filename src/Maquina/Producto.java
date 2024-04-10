package Maquina;

public class Producto {
    private String nombre;
    private float precio;
    private int id;
    private int cantidadEnStock;
    private String tipo;
    private String marca;
    private String fechaVencimiento;
    private String presentacion;

    public Producto(String nombre, float precio, int id,
                    int cantidadEnStock, String tipo, String marca,
                    String fechaVencimiento, String presentacion){
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
        this.cantidadEnStock = cantidadEnStock;
        this.tipo = tipo;
        this.marca = marca;
        this.fechaVencimiento = fechaVencimiento;
        this.presentacion = presentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }
}
