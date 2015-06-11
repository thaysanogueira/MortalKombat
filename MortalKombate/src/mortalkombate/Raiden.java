package mortalkombate;
public class Raiden extends Personagem{
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
        return "frente, tras, frente, cima, " + chuteforte ;
    }
     String lightnig() {
        return "baixo, frente, baixo, "+ socofraco;
    }
    String torpedo (){
        return "tras,tras, frente, cima, "+ socoforte;
    }
    String teleport (){
        return "baixo, cima";
    }

        }

/*Torpedo: B, B, F , HP (também pode ser feito no ar)
Teleport: D, U
Lightnig: D, F, LP
Fatalities: D, B, F, HK*/   

