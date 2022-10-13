import java.util.*;

public class Main {

    public static void main(String[] args) {
      System.out.println();

      // Algumas variaveis que serão usadas
      Random gerador = new Random();
      int geracao = 0;
      int otmizacaoA = 0;
      int otmizacaoB = 0;
      ArrayList<Cromossomo> algoritimo = new ArrayList();

      // Eu define 10000 gerações mas geralmente antes de 100 ele ja acha o valor otimizado
        for(int geracoes = 0;geracoes<10000;geracoes++){
          
          int numeroA = gerador.nextInt(10)+1;
          int numeroB = gerador.nextInt(10)+1;
        
          Cromossomo test = new Cromossomo(numeroA,numeroB);
          algoritimo.add(test);

          // Caso seja o fitness que estou procurando ele entre nesse if e sai do loop
          if(test.getFitnes()==0){
            geracao = geracoes;
            otmizacaoA = numeroA;
            otmizacaoB = numeroB;
            break;
          }
        }
        
        System.out.println("Na geração "+geracao
                           +"\nO valor Otimizado de a é "+otmizacaoA
                           +"\nO valor Otimizado de b é "+otmizacaoB);

        }
        
        }
        
        
      
    
        
    
        