package tarea;
/**
 * Entrega los valores de serie y un string del producto que se consume a las superclases
 */
public class Snickers extends Dulce {
    public Snickers(int serie){
        super(serie);
    }
    public String consumir(){
        return "snickers";
    }
}