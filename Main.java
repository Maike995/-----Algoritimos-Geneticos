

package pkg21_09_algoritimo;

import java.util.*;

public class Main {

    public static void main(String[] args) {
  
      int tamanho = 1000;
      ArrayList <Cromossomo> vetores = new ArrayList();
      ArrayList <Cromossomo> novoMundo = new ArrayList();
      Random gerador = new Random();
 
        for(int t =0; t<tamanho; t++){
        
        Cromossomo bestfit = new Cromossomo();
        vetores.add(bestfit);
      
        System.out.println(bestfit.aptidao());
        vetores.add(bestfit);
        }
      
        for(int x=0;x<vetores.size();x++){
            
        Cromossomo forte = new Cromossomo();
        forte.fitnes=0;
        
            for(int z=0;z<10;z++){
                
                Cromossomo aux = vetores.get(gerador.nextInt(1001));;

                if (forte.fitnes < aux.fitnes) {
                forte=aux;
            }
                
        novoMundo.add(forte);
        }
            
            
            
        for(int i=0;i<vetores.size();i++){
            
            Cromossomo filho = new Cromossomo();
            for(int q=0;q<12;q++){
            filho.cromossomo[q] = vetores.get(gerador.nextInt(1001)).cromossomo[q];
            
            }
            for(int w=11;w<22;w++){
            filho.cromossomo[w] = vetores.get(gerador.nextInt(1001)).cromossomo[w];
            }
            novoMundo.add(filho);
            
        }
            
            
        
            
        }
        
        
      
    
        }
    }
  
       
  
