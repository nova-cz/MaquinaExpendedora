package Maquina;

import java.util.Objects;

public class Bebida extends Producto {
    private String sabor;
    private String estado;
    private Boolean cafeina;
    private Boolean Gas;

    public Bebida(String nombre, float precio, int id, int cantidadEnStock, String tipo, String marca, String fechaVencimiento,
                  String presentacion, String sabor, String estado, Boolean cafeina, Boolean Gas){
        super(nombre, precio, id, cantidadEnStock, tipo, marca, fechaVencimiento, presentacion);
        this.sabor = sabor;
        this.estado = estado;
        this.cafeina = cafeina;
        this.Gas = Gas;
    }

    public void destapar(){
        if (Objects.equals(this.estado, "Cerrada")){
            this.estado = "Abierto";
        }
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getCafeina() {
        return cafeina;
    }

    public void setCafeina(Boolean cafeina) {
        this.cafeina = cafeina;
    }

    public Boolean getGas() {
        return Gas;
    }

    public void setGas(Boolean gas) {
        Gas = gas;
    }
}

