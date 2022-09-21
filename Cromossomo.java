
package pkg21_09_algoritimo;

import java.util.Random;

public class Cromossomo {
    
    
    int []cromossomo = new int[22];
    double fitnes;
    
    public Cromossomo(){
        
        Random gerador = new Random();
        for(int i=0; i<cromossomo.length; i++){
            
            cromossomo[i]=gerador.nextInt(2); 
        }
    }
    
    public double aptidao(){
        
        int decimal = 0;
        for(int e=0; e<cromossomo.length; e++){
            decimal = decimal + cromossomo[e]*(int)Math.pow(2,e);
        }
      
        double conversao = -1+decimal*3/Math.pow(2, 22)-1 ;
 
         fitnes = conversao*Math.sin(10*Math.PI*conversao)+1;
        
        return fitnes;
 
    }
    
    
    
    
    
}
