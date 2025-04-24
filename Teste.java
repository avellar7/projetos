
package associação;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Teste {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      Canhao c = new Canhao();
      Bala bl = new Bala();
      
      c.setBala(bl);
      c.setBala(0, 0);
      c.disparar(21, 45);
        System.out.println("Alcance Maximo"+ c.getAlcanceMaximo());
      
        
      
      
    }
    
}