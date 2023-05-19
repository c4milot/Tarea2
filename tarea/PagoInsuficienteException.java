package tarea;
public class PagoInsuficienteException extends Exception{
    public PagoInsuficienteException(String errorMessage){
        super(errorMessage);
    }
}
