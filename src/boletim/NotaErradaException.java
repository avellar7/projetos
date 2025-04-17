
package boletim;

public class NotaErradaException extends Exception {
    @Override
    public String getMessage(){
        return "nota fora do limite permitido";
    }
    
}
