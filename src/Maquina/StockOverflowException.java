package Maquina;

public class StockOverflowException extends Throwable {     //Cuando dice que extiende de Throwable dice que todos los errores y excepciones son subclases
    public StockOverflowException()  {
        super("Se ha excedido la capacidad maxima");
    }

}
