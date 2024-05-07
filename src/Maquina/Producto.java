package Maquina;

abstract class Producto implements  IProducto {
    String nombre = "";
    float precio = 0;
    int id = 0;
    int cantidadEnStock = 0;
    String tipo = "";
    String marca = "";
    String fechaVencimiento = "";
    String presentacion = "";

    public Producto(String nombre, float precio, int id, int cantidadEnStock, String tipo, String marca, String fechaVencimiento, String presentacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
        this.cantidadEnStock = cantidadEnStock;
        this.tipo = tipo;
        this.marca = marca;
        this.fechaVencimiento = fechaVencimiento;
        this.presentacion = presentacion;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public float getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    @Override
    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    @Override
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String getPresentacion() {
        return presentacion;
    }

    @Override
    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }
}
