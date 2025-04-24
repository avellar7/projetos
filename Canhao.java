
package associação;

import java.util.HashSet;

public class Canhao {
   private Bala bala;
   double posicaoXfinalBala;
    
   public void setBala (Bala bala){
       System.out.println("Uma nova bala foi adicionada");
       this.bala = bala;
   }
   public void setBala(double pX, double pY){
       bala.setPosicaoX(pX);
       bala.setPosicaoY(pY);
   }

    public void disparar (double velocidadeInicial, double anguloInclinacao){
        double anguloRad = Math.toRadians(anguloInclinacao);
        double seno = Math.sin(2*anguloRad);
        double vel2 = Math.pow(velocidadeInicial,2);
        posicaoXfinalBala = vel2*seno/9.81;
    }
    public double getAlcanceMaximo(){
        return posicaoXfinalBala;
         
    }
    
}

