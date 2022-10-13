import java.util.*;

public class Main {

    public static void main(String[] args) {
      System.out.println();

      // Algumas variaveis que serão usadas
      Random gerador = new Random();
      int geracao = 0;
      Cromossomo[] funcao = new Cromossomo[1];

      // Eu define 10000 gerações mas geralmente antes de 100 ele ja acha o valor otimizado
        for(int geracoes = 0;geracoes<10000;geracoes++){
          
          int numeroA = gerador.nextInt(10)+1;
          int numeroB = gerador.nextInt(10)+1;
        
          Cromossomo test = new Cromossomo(numeroA,numeroB);
          

          // Caso seja o fitness que estou procurando ele entra nesse if
          // ele salva o objeto e sai do loop
          if(test.getFitnes()==0){
            funcao[0]=test;
            geracao = geracoes;
            break;
          }
        }
        
        System.out.println("Na geração "+geracao
                           +"\nO valor Otimizado de a é "+(funcao[0]).getA()
                           +"\nO valor Otimizado de b é "+(funcao[0]).getB());

        }
        
        }
        
        
      
    
        
    
        
