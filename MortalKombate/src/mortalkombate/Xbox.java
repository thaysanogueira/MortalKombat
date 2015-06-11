package mortalkombate;
public class Xbox {
    public static void main(String[] args) {
        
        Reptile p1 = new Reptile();
        p1.setChuteforte("Triangulo");
        p1.setChutefraco("Circulo");
        p1.setSocoforte("Quadrado");
        p1.setSocofraco("Xis");
        p1.setAgarra("R1");
        p1.setDefesa("R2");
        p1.setEspecial("L1");

        KungLao p2 = new KungLao();
        p2.setChuteforte("Triangulo");
        p2.setChutefraco("Circulo");
        p2.setSocoforte("Quadrado");
        p2.setSocofraco("Xis");
        p2.setAgarra("R1");
        p2.setDefesa("R2");
        p2.setEspecial("L1");

        Raiden p3 = new Raiden();
        p3.setChuteforte("Triangulo");
        p3.setChutefraco("Circulo");
        p3.setSocoforte("Quadrado");
        p3.setSocofraco("Xis");
        p3.setAgarra("R1");
        p3.setDefesa("R2");
        p3.setEspecial("L1");

        Kitana p4 = new Kitana();
        p4.setChuteforte("Triangulo");
        p4.setChutefraco("Circulo");
        p4.setSocoforte("Quadrado");
        p4.setSocofraco("Xis");
        p4.setAgarra("R1");
        p4.setDefesa("R2");
        p4.setEspecial("L1");

        //Exibir na tela os valores
        System.out.println("     **** Xbox****");
        System.out.println("\n ----Comandos especiais para o Reptile----");
        System.out.println("Especial: " + p1.especial);
        System.out.println("Acido: " + p1.acido());
        System.out.println("BolaForte: " + p1.bolaforte());
        System.out.println("Combo1: " + p1.combo1());
        System.out.println("Combo2: " + p1.combo2());
        System.out.println("Fatality: " + p1.fatality1());
        System.out.println("Fatality: " + p1.fatality2());
        System.out.println("Agarrar: " + p1.agarra);
        System.out.println("Defesa" + p1.defesa);
        System.out.println("Chute forte: " + p1.chuteforte);
        System.out.println("Chute forte: " + p1.chutefraco);
        System.out.println("Soco forte: " + p1.socoforte);
        System.out.println("Soco forte: " + p1.socofraco);
        System.out.println("Trocar personagem: " + p1.trocapersonagem);

        
        System.out.println("\n ----Comandos especiais para o KungLao----");
        System.out.println("Combo1: " + p2.combo1());
        System.out.println("Combo2: " + p2.combo2());
        System.out.println("Fatality1: " + p2.fatality1());
        System.out.println("Fatality2: " + p2.fatality2());
        System.out.println("Especial: " + p2.especial());
        System.out.println("Agarrar: " + p2.agarra);
        System.out.println("Chute forte: " + p2.chuteforte);
        System.out.println("Chute forte: " + p2.chutefraco);
        System.out.println("Soco forte: " + p2.socoforte);
        System.out.println("Soco forte: " + p2.socofraco);
        System.out.println("Defesa: " + p2.defesa);
        System.out.println("Trocar personagem: " + p2.trocapersonagem);

        System.out.println("\n ----Comandos especiais para o Raiden----");
        System.out.println("Especial: " + p3.especial());
        System.out.println("Combo1: " + p3.combo1());
        System.out.println("Combo2: " + p3.combo2());
        System.out.println("Fatality1:" + p3.fatality1());
        System.out.println("Fatality2:" + p3.fatality2());
        System.out.println("Agarrar: " + p3.agarra);
        System.out.println("Chute forte:" + p3.chuteforte);
        System.out.println("Chute forte:" + p3.chutefraco);
        System.out.println("Soco forte:" + p3.socoforte);
        System.out.println("Soco forte:" + p3.socofraco);
        System.out.println("Defesa" + p3.defesa);
        System.out.println("Trocar personagem" + p3.trocapersonagem);
        
        System.out.println("\n ----Comandos especiais para o Kitana----");
        System.out.println("Combo1: " + p4.combo1());
        System.out.println("Combo2: " + p4.combo2());
        System.out.println("Fatality1: " + p4.fatality1());
        System.out.println("Fatality2: " + p4.fatality2());
        System.out.println("Especial: " + p4.especial());
        System.out.println("Agarrar: " + p4.agarra);
        System.out.println("Chute forte: " + p4.chuteforte);
        System.out.println("Chute forte: " + p4.chutefraco);
        System.out.println("Soco forte: " + p4.socoforte);
        System.out.println("Soco forte: " + p4.socofraco);
        System.out.println("Defesa: " + p4.defesa);
        System.out.println("Trocar personagem: " + p4.trocapersonagem);
        
        
        //Luta entre Kitana e Reptile
        System.out.println("\n\t ---------Luta entre Reptile e Kitana--------");
        LutaRxK lrk = new LutaRxK();
        lrk.setCenario("Floresta");
        lrk.setPersonagem1(p1); //Reptile
        lrk.setPersonagem2(p4);//Kitana

        lrk.AcertaGolpe("p1");
       System.out.println("Reptile acertou um golpe normal em Kitana (7)");
         /*System.out.println("Reptile: " + lrk.getPersonagem1().getVida()+ 
         "\nKitana: " + lrk.getPersonagem2().getVida()+"\n");*/

        lrk.AcertaCombo1("p4");
       System.out.println("Kitana acertou um combo1 em Reptile (15)");
         /*System.out.println("R:" + lrk.getPersonagem1().getVida()+ 
         "\nK: " + lrk.getPersonagem2().getVida()+"\n");*/

        lrk.AcertaCombo2("p4");
        System.out.println("Kitana acertou um combo2 em Reptile (20)");
        System.out.println("Reptile: " + lrk.getPersonagem1().getVida() + " vidas"
                + "\nKitana: " + lrk.getPersonagem2().getVida() + " vidas \n");

        System.out.println("\t ---------Luta entre KungLao e Raiden --------");
        LutaKLxR lklr = new LutaKLxR();
        lklr.setCenario("Penhasco");
        lklr.setPersonagem1(p3); //Raiden
        lklr.setPersonagem2(p2);//KungLao

        lklr.AcertaGolpe("p3");
        System.out.println("Raiden acerta golpe normal em KungLao (9)");
        /*System.out.println("R: " + lklr.getPersonagem1().getVida()+ 
         "\nK: " + lklr.getPersonagem2().getVida()+"\n");*/

        lklr.AcertaCombo1("p3");
        System.out.println("Raiden acerta golpe com dano 13 em KangLao (13)");
        /*System.out.println("R: " + lklr.getPersonagem1().getVida()+ 
         "\nK: " + lklr.getPersonagem2().getVida()+"\n");*/

        lklr.AcertaCombo1("p3");
        System.out.println("Raiden acerta combo 2 em KungLao (22)");
        /*System.out.println("R: " + lklr.getPersonagem1().getVida()+ 
         "\nK: " + lklr.getPersonagem2().getVida()+"\n");*/

        lklr.AcertaCombo2("p2");
        System.out.println("KungLao acerta combo 1 em Raiden (18)");
        System.out.println("Raiden: " + lklr.getPersonagem1().getVida() + " vidas"
                + "\nKungLao: " + lklr.getPersonagem2().getVida() + " vidas \n");

    }
    }
    

