
package algoritimogenerico_cromossomo;



import java.util.*;

public class Main {

    public static void main(String[] args) {
  
     
      //2ª Etapa = População
      ArrayList<Cromossomo> vetores = new ArrayList();
      comecar(vetores);
      int nrGeracoes = 0;
     while(nrGeracoes<300){ 
      //3ª Etapa = Teste de aptidao
      //4ª Etapa = Torneio
      ArrayList<Cromossomo> novoMundo = new ArrayList<Cromossomo>();
      for(int i = 0; i<100 ;i++){
          torneio(novoMundo,vetores);
      }
         Collections.sort(novoMundo);
      
         System.out.println("Melhor da geração "+nrGeracoes+" "+novoMundo.get(99).getFitnes());
      //5ª Etapa = Reconbinação
      ArrayList<Cromossomo> novaGeracao = new ArrayList<Cromossomo>();
      filhos(novoMundo,novaGeracao);      
      //6ª Etapa = Mutação
      mutantes(novaGeracao,novoMundo);
      //7ª Etapa = Junta Tudo
      novaGeracao.addAll(novoMundo);
      vetores.clear();
      vetores.addAll(novaGeracao);
      nrGeracoes++;
     }
        
   
        }     
        
    
    
     //2ª Etapa = População
    public static void comecar(ArrayList<Cromossomo> vetores){
        
        int tamanho = 1001;
               
        for(int t =0; t<tamanho; t++){
        Cromossomo bestfit = new Cromossomo();
        vetores.add(bestfit);
        }
        
    }
    
    //3ª Etapa = Teste de aptidao
    //4ª Etapa = Torneio
    public static void torneio(ArrayList<Cromossomo> novoMundo,ArrayList<Cromossomo> vetores){
            Random gerador = new Random();
        
            for(int z=0;z<10;z++){
                
                Cromossomo forte = new Cromossomo();
                Cromossomo cromossomoA = vetores.get(gerador.nextInt(1001));
                Cromossomo cromossomoB = vetores.get(gerador.nextInt(1001));

                if (cromossomoA.getFitnes() > cromossomoB.getFitnes()) {
                forte = cromossomoA;
            } else{
                 forte = cromossomoB;
                }
                
        
        novoMundo.add(forte);
        }
    }
    
    //5ª Etapa = Reconbinação
    public static void filhos(ArrayList<Cromossomo> novaGeracao,ArrayList<Cromossomo> novoMundo){
        
            Random gerador = new Random();    
        for(int i=0;i<novoMundo.size()*(0.95);i++){
            
            int[] filho1 = new int[22];
            int[] filho2 = new int[22];
            for(int q=0;q<12;q++){
            filho1[q] = novoMundo.get(gerador.nextInt(1001)).getCromossomo()[q];
            filho2[21-q] = novoMundo.get(gerador.nextInt(1001)).getCromossomo()[21-q];
            }
            for(int w=11;w<22;w++){
            filho1[w] = novoMundo.get(gerador.nextInt(1001)).getCromossomo()[w];
            filho2[21-w] = novoMundo.get(gerador.nextInt(1001)).getCromossomo()[21-w];
            
            
           
            novaGeracao.add(new Cromossomo(filho1));
            novaGeracao.add(new Cromossomo(filho2));
        }
    }
    }
    
    //6ª Etapa = Mutação
    public static void mutantes(ArrayList<Cromossomo> novaGeracao,ArrayList<Cromossomo> novoMundo){
            
            Random gerador = new Random();    
        for(int i=0;i<novoMundo.size()*(0.05);i++){
            
            
            Cromossomo mutante = novoMundo.get(gerador.nextInt(999));

            int[] seraMutado = mutante.getCromossomo();
            
            int posicao = gerador.nextInt(22);
            
            if(seraMutado[posicao]== 1){
               seraMutado[posicao] = 0;
            } else{
               seraMutado[posicao] = 1; 
            }

            novaGeracao.add(new Cromossomo(seraMutado));
            }
            
        }
        
        }
        
        
      
    
        
    
        
    