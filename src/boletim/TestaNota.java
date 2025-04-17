
package boletim;

public class TestaNota {
    public static void testarNota(double nota) throws NotaErradaException{
        //|| significa "ou"
        if(nota > 10 || nota < 0){
        throw new NotaErradaException();
    }
        
    }
    
}
