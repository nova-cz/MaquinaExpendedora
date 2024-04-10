package Maquina;

public class InsufficientFundsException extends Throwable {     //Cuando dice que extiende de Throwable dice que todos los errores y excepciones son subclases

    public InsufficientFundsException() {
        super("Cambio insuficiente.");
    }

}
