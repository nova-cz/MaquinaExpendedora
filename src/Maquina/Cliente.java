package Maquina;

public class Cliente {
    private float dinero;

    public Cliente(float dinero){
        this.dinero = dinero;
    }

    // Throw:  * Se utiliza para lanzar explicitamente una excepcion en un metodo
    //         * Se especifica una instancia de la excepcion que se quiere lanzar.


    //Throws
    //Se utiliza para declarar que un método
    // puede lanzar una excepción específica. Cuando se utiliza throws,
    // se especifica el tipo de excepción que el método puede lanzar. Por ejemplo:
    public Boolean comprar(Producto producto) throws InsufficientFundsException {  //
        if(dinero >= producto.getPrecio()){
            dinero -= producto.getPrecio();
            return true;
        }

        return false;
    }

    public float getDinero(){
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }
}
