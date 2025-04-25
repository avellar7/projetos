
package aularaul;
import java.util.Scanner;

public class AulaRaul {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double entnum, soma, media, maiornum, menornum, mediapares,
        porcentimpares, numpar, contador, contadorpares, contadorimpares;
        
        contador = 0;
        contadorpares = 0;
        contadorimpares = 0;
        
        System.out.println("Digite um numero qualquer (com excecao do 0 que "
                + "encerra o processo");
        
        
        entnum = entrada.nextDouble();
       
        maiornum = entrada.nextDouble();
        maiornum = entrada.nextDouble();
        menornum = entrada.nextDouble();
        numpar = 0;
        soma = 0;
        
         
        
        while (entnum != 0) {
            if (entnum < menornum){
                menornum= entnum;
            }
            if (entnum > maiornum){
                maiornum = entnum;
            }
            contador ++;
            soma = soma + entnum;
            if(entnum% 2 == 0) {
                numpar = numpar + entnum;
                contadorpares++;
            }
            if(entnum % 2==1){
                contadorimpares++;
            }
        }
        
       System.out.println("A soma dos numeros digitados é: " + soma);
         System.out.println("A quantidade dos numeros sao: "+ contador);
         System.out.println("A media dos numeros sao: " + soma/contador);
         System.out.println("O maior numero é: "+maiornum);
         System.out.println("O menor numero é: "+ menornum);
         System.out.println("A media dos numeros pares: "+ numpar/contadorpares);
         porcentimpares = (contadorimpares/contador)*100;
         System.out.println("A porcentagem dos numeros impares entre odos "
                 + "os numeros digitados é: "+ porcentimpares+ "%");
    }
    
}
