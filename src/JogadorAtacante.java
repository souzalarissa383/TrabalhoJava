public class JogadorAtacante extends Jogador {
	private int velocidade;
	private int tecnica;

	public JogadorAtacante(String pNom, int pIda, int pHa, int pVel, int pTec){
		super(pNom, pIda, pHa);
		this.velocidade = pVel;
		this.tecnica = pTec;
	}	
	public void getTecnica (int tecnica){
		this.tecnica = tecnica;
	}		
	
	@Override
	public int getHabilidades(){
		int habilidade = ((this.habilidades * 5) + (this.velocidade  * 2 ) + (this.tecnica * 3))/10;
		return habilidade;
	}



}
