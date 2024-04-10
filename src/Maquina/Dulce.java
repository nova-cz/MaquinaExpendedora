package Maquina;

public class Dulce extends Producto{
    private String textura;
    private String forma;
    private String sabor;
    private Boolean relleno;
    private String estado;

    public Dulce(String nombre, float precio, int id, int cantidadEnStock,
                 String tipo, String marca, String fechaVencimiento,
                 String presentacion, String textura, String forma, String sabor, Boolean relleno){
        super(nombre, precio, id, cantidadEnStock, tipo, marca, fechaVencimiento, presentacion);
        this.textura = textura;
        this.forma = forma;
        this.sabor = sabor;
        this.relleno = relleno;
    }

    public void desenvolver(){
        if (this.estado.equals("Cerrado")){
            this.estado = "Desenvuelto";
        }
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Boolean getRelleno() {
        return relleno;
    }

    public void setRelleno(Boolean relleno) {
        this.relleno = relleno;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
