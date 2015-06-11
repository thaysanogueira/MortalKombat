package mortalkombate;
public class KungLao extends Personagem  {
  String combo1 (){
        return chutefraco+"frente"+chuteforte;
    }
    String combo2 (){
        return socoforte+ ","+chuteforte+","+socoforte;
    }
    String fatality1 (){
        return "cima,baixo"+chuteforte;
    }
    String fatality2 (){
        return chuteforte+"cima,cima"+chutefraco;
    }
    String especial (){
        return "tras, frente, baixo, cima" +chuteforte; 
    }
    String teleport (){
        return "baixo, cima";
    }
    String takedow (){
        return socofraco +chuteforte+socoforte+ " cima, baixo, " + chutefraco;
    }

        }


/*Spinning Takedown: BLK, U, LK 
Teleport: D, U
Fatalities: B, F, D, HK */  

