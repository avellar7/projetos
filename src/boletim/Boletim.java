
package boletim;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Boletim {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //criar um vetor para armezenar os dados de cada estudante
        Estudante vetEstudante[] = new Estudante [5];
        boolean controle = true;
        //mudar o estado da variavel em cada catch para funcionar e voltar no aluno que foi errado
         
        //criar uma varivael para contagem de estudantes de (1 a 5). Começa em 0. "contagem++" ++ significa que soma 1.
        for(int contagem = 0;contagem < 4; contagem++){ 
            do {
            try{
            //deixar entre parenteses a variavel + quanto eu quero que ela some.
            System.out.println("Digite o nome do "+ (contagem+1) +"o.aluno: ");
            String nome = scanner.nextLine();
            
            System.out.println("Digite a nota1: ");
            double nota1 = scanner.nextDouble();
            TestaNota.testarNota(nota1);
            System.out.println("Digite a nota2: ");
            double nota2 = scanner.nextDouble();
            TestaNota.testarNota(nota2);
            //usar a variavel que criamos na contagem para seguir o mesmo método dentro de for
            //"New Estudante" criou um novo estudante substituindo os dados anteriores
            vetEstudante[contagem] = new Estudante(nome,nota1,nota2);
            scanner.nextLine();
            controle = false;
            }catch(InputMismatchException erro){
                System.out.println("Entrada inválida. Digite um número");
                vetEstudante[contagem] = null;
                scanner.nextLine();
                
            }catch(NotaErradaException erro){
                System.out.println(erro.getMessage());
                scanner.nextLine();
            }
                     
        
                    
                    }while (controle);
        
        System.out.println("");
        //sempre deixar o try fora do for pra continuar executando o resto do codigo
         //toString imprime na tela o conteudo do objeto
        for(int contagem = 0;contagem < 4; contagem++){
            try{
            System.out.println(vetEstudante[contagem].toString());
    
       
            
        }catch(NullPointerException e){
                System.out.println("Objeto não criado");
                }
            
            
        }
        
     
    }
    
}
