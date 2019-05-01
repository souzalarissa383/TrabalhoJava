
public class Partida {
    
        private double data ;
        private String timeCasa ;
        private String timeVisitante ;
        private int placarCasa ;
        private int placarVisitante ;
    
        
    public void Partida(double data, String timeCasa,int placarVisitante ){
        
    }
    
    public void golcasa(String timecasa){
        this.timeCasa = timecasa;
    
    }
    public void golvisitante(String timeVisitante){
        this.timeVisitante = timeVisitante;
    
    }
    public void setPlacar(int placarCasa, int placarVisitante){
         this.placarCasa = placarCasa;
        
    } 
    public int getPlacar(int placarCasa, int placarVisitante) {
        return this.placarCasa;
       
    }
    
    public void setPlacar(int placarVisitante){
         this.placarVisitante = placarVisitante;
        
    } 
    
    public int getPlacar(int placarVisitante){
        return this.placarVisitante;
        
    }

   

    
    
}
