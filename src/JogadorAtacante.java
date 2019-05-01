
public class JogadorAtacante extends Jogador {
    private int velocidade;
    private int tecnica;
    

    public void tecnica (int tecnica){
        this.tecnica = tecnica;
        }

     public int gettecnica(int habilidade){
           return  ((habilidade*5) + (velocidade*2) + (tecnica*3) )/10;
        }
     
   public void JogadorAtacante(String nome, int idade, int habilidades, int velocidade, int tecnica){
        
        
        
        }
   
}
