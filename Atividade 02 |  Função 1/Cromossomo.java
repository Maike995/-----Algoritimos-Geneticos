import java.util.Random;

public class Cromossomo  {
    
    // Atributos
    protected int a = 0;
    protected int b = 0;
    protected int fitnes;

    // Criando o cromossomo com a e b que serão numeros aleatorios entre 1 e 10
    public Cromossomo(int a,int b){
        this.a=a;
        this.b=b;

        this.fitnes=aptidao(a,b);
    }
    
    public double getFitnes() {
        return fitnes;
    }
  
    public int aptidao(int a,int b){
    
            fitnes = 2*(int)(Math.pow(a,2))+b-57;

        return fitnes;
    }


    
}