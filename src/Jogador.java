
public class Jogador {
    
    private String nome;
    protected int idade;
    protected int habilidades;
    private int gols;
  
	public Jogador(String pNom, int pIda, int pHa ) {
		this.nome = pNom;
		this.idade = pIda;
		this.habilidades = pHa;
	}
	
    public String getNome() {
       return this.nome;
    }
    
    
    public void setHabilidades(int habilidades) {
        this.habilidades = habilidades;
    }
     
    public int getHabilidades() {
        return 0;
    }
    
    public void setGols(int gols) {
        this.gols = gols;
    }
     
    public int getGols() {
       return this.gols;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void somaGol(int gols){
        this.gols = gols;
    }
}
