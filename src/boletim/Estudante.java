
package boletim;

public class Estudante {
    //atributos
    private String name;
    private double nota1;
    private double nota2;
    
    
   //construtores, começar com public + o nome da classe

    public Estudante(String name, double nota1, double nota2) {
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    //métodos acessores e modificadores

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    //comportamento
    
    public double calcularMediaFinal(){
        return this.nota1 * 0.4 + this.nota2*0.6;
    }

    @Override
    public String toString() {
        return "Estudante{" + "name= " + name + ", nota1= " + nota1 
                + ", nota2= " + nota2 + ", média: " + calcularMediaFinal() + '}';
    }
    
    
    
    
    
}
