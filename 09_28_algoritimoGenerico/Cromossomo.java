/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimogenerico_cromossomo;



import java.util.*;

public class Main {

    public static void main(String[] args) {
  
      int tamanho = 1001;
      ArrayList <Cromossomo> vetores = new ArrayList();
      ArrayList<Cromossomo> novoMundo = new ArrayList<Cromossomo>();
      ArrayList<Cromossomo> melhorAptidao = new ArrayList<Cromossomo>();
      Random gerador = new Random();
 
      
                //2ª Etapa = População
        for(int t =0; t<tamanho; t++){
        
        Cromossomo bestfit = new Cromossomo();
        vetores.add(bestfit);
      
        }
      
                //3ª Etapa = Teste de aptidao
        for(int x=0;x<vetores.size();x++){
            
        Cromossomo forte = new Cromossomo();
        forte.aptidao();
        
                //4ª Etapa = Torneio
            for(int z=0;z<10;z++){
                
                Cromossomo aux = vetores.get(gerador.nextInt(1001));;

                if (forte.fitnes < aux.fitnes) {
                forte=aux;
            }
        melhorAptidao.add(forte);
        forte.aptidao();
        Collections.sort(melhorAptidao);
        novoMundo.add(forte);
        }
            
            
                //5ª Etapa = Reconbinação
        for(int i=0;i<vetores.size()*(0.95);i++){
            
            Cromossomo filho = new Cromossomo();
            for(int q=0;q<12;q++){
            filho.cromossomo[q] = vetores.get(gerador.nextInt(1001)).cromossomo[q];
            
            }
            for(int w=11;w<22;w++){
            filho.cromossomo[w] = vetores.get(gerador.nextInt(1001)).cromossomo[w];
            }
            
            melhorAptidao.add(filho);
            filho.aptidao();
            Collections.sort(melhorAptidao);
            novoMundo.add(filho);
            
        }
        
                //6ª Etapa = Mutação
        for(int i=0;i<vetores.size()*(0.05);i++){
            
            
            Cromossomo mutante = new Cromossomo();
            
            mutante = vetores.get(gerador.nextInt(1001));
        
            int posicao = gerador.nextInt(22);
            
            if(mutante.cromossomo[posicao]== 1){
               mutante.cromossomo[posicao] = 0;
            } else{
               mutante.cromossomo[posicao] = 1; 
                        }
               
            mutante.aptidao();
         melhorAptidao.add(mutante);
          Collections.sort(melhorAptidao);
          
            novoMundo.add(mutante);
            }
            
            
            
            Collections.sort(melhorAptidao);
		
		Iterator<Cromossomo> it = melhorAptidao.iterator();
		
		while(it.hasNext()) {			
			System.out.println(it.next().fitnes);
		}
            
        }     
        
        
        }
        
        
      
    
        }
    
        
    