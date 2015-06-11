package mortalkombate;
public class Reptile extends Personagem{
  public String combo1 (){
        return "frente, cima, tras "+chuteforte + socoforte;
    }
    public String combo2 (){
        return "baixo, cima, frente" +chutefraco + socofraco;
    }
    public String fatality1 (){
        return "baixo, frente, tras" + chuteforte +socoforte;
    }
    public String fatality2 (){
        return "cima,tras, baixo" + chuteforte + socofraco;
    }
    String especial (){
        return "tras, tras, baixo, baixo, " +socofraco;
    }
    public String invisivel() {
        return socofraco +chuteforte+socoforte+ "cima, cima, baixo ";
    }
    public String acido() {
        return "frente, frente, cima, "+ socoforte;
    }
    public String bolaforte (){
        return "tras, tras, tras, cima, "+socoforte+ " baixo, "+socofraco;
    }
    public String slide (){
        return socofraco+chuteforte+socoforte+ "tras, baixo, "+chutefraco +"cima, " +chuteforte;
    }

    }

/*Invisibility: Hold Blk, U, U, D, Hh
Acido: F, F, HP
Force Ball: B, B, B, HP+LP
Slide: Hold Block, B+LK+Hk
Fatalities: B, B, D, LP 

*/  

