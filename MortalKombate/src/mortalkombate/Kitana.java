package mortalkombate;
public class Kitana extends Personagem{
   String combo1 (){
        return chuteforte+"frente"+chutefraco;
    }
    String combo2 (){
        return socoforte+ ","+socoforte+","+socoforte;
    }
    String fatality1 (){
        return "cima,baixo"+chuteforte;
    }
    String fatality2 (){
        return chuteforte+"cima,cima"+chutefraco;
    }
    String especial (){
        return socofraco +chuteforte +socoforte +" baixo, baixo, baixo, cima, baixo" +chutefraco;
    }
    String lift() {
        return "tras, tras, tras, cima " + socoforte;
    }

    String toss() {
        return "frente, frente, cima,  " + socoforte+ "baixo, "+ socofraco;
    }
    String sswipewavelide (){
        return "tras, cima, " +socoforte+ "tras, cima, " +socoforte ;
    }

        }

/*Golpes Kitana
Fan Lift: B, B, B, HP
Fan Toss: F, F, HP+LP
Fan Swipe: B, HP, B, HP
Fatalities: Blk, D, D, D, U, LK */ 

