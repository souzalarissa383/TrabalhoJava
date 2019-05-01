
public class JogadorGoleiro extends Jogador{
    private int reflexos;
    private float altura;
    private int habilidade;
    
   
    public int gethabilidades(int habilidade) {
       return ((habilidade*5) + (((int)(altura*100))*2) + (reflexos*3))/10;
    }
    public void JogadorGoleiro(String nome, int idade, int habilidades, int reflexos,  float altura){
        
    }
}
