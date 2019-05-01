
public class Time {
    
    private String Nome;
    private String Jogador;
    private  int jogadores;
    private  int vitorias ;
    private String Resultado;
    private int Derrotas;
    private int Empate;
    
    
    public void Time(String nome){
        this.Nome = nome;
        
    }
   
    public void setNome() {
         this.Nome = Nome;
    }
      public String getNome(){
         return this.Nome;
    }
      
     public void setResultado(String Resultado){
         this.Resultado = Resultado;
        
    } 
    
    public String getResultado(String Resultado){
        return this.Resultado;
        
    }  
    public void somaVitoria(int vitorias){
        this.vitorias = vitorias;
        
    }  
     
    public void somaDerrotas(int Derrotas){
        this.Derrotas = Derrotas;
        
    } 
    
    public void somaEmpate(int Empate){
        this.Empate = Empate;
        
    }
    
     public void insJogador(String Jogador){
        this.Jogador = Jogador;
        
    }
}
