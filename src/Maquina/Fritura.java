package Maquina;

public class Fritura extends Producto{
    private int contenidoNeto;
    private Boolean premio;
    private Boolean picante;
    private String estado;

    public Fritura(String nombre, float precio, int id, int cantidadEnStock,
                   String tipo, String marca, String fechaVencimiento,
                   String presentacion, int contenidoNeto, Boolean premio, Boolean picante){
        super(nombre, precio, id, cantidadEnStock, tipo, marca, fechaVencimiento, presentacion);
        this.contenidoNeto = contenidoNeto;
        this.premio = premio;
        this.picante = picante;
    }

    public void abrir(){
        if (this.estado.equals("Cerrado")){
            this.estado = "Abierto";
        }
    }

    public int getContenidoNeto() {
        return contenidoNeto;
    }

    public void setContenidoNeto(int contenidoNeto) {
        this.contenidoNeto = contenidoNeto;
    }

    public Boolean getPremio() {
        return premio;
    }

    public void setPremio(Boolean premio) {
        this.premio = premio;
    }

    public Boolean getPicante() {
        return picante;
    }

    public void setPicante(Boolean picante) {
        this.picante = picante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
