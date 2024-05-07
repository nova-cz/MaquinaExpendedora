package Maquina;

public interface IProducto {
    String getNombre();
    void setNombre(String nombre);

    float getPrecio();
    void setPrecio(float precio);

    int getId();
    void setId(int id);

    int getCantidadEnStock();
    void setCantidadEnStock(int cantidadEnStock);

    String getTipo();
    void setTipo(String tipo);

    String getMarca();
    void setMarca(String marca);

    String getFechaVencimiento();
    void setFechaVencimiento(String fechaVencimiento);

    String getPresentacion();
    void setPresentacion(String presentacion);
}
