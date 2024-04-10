package Maquina;

public class AdministrationException extends Throwable {    //Cuando dice que extiende de Throwable dice que todos los errores y excepciones son subclases
    public AdministrationException(){
        super("Error en la administración de la máquina expendedora.");
    }
}
