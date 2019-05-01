
public class Jogador {
    
    private String nome;
    protected int idade;
    protected int habilidades;
    private int gols;
  
    public void Jogador (String nome, int idade, int habilidades){
       
    }
    
    
     
    public String getnome() {
       return this.nome;
    }
    
    
    public void setHabilidades(int habilidades) {
        this.habilidades = habilidades;
    }
     
    public int gethabilidades() {
        return 0;
    }
    
    public void setGols(int gols) {
        this.gols = gols;
    }
     
    public int getgols() {
       return this.gols;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void somaGol(int gols){
        this.gols = gols;
    }
}
