package mortalkombate;
public class LutaRxK {
  
private String cenario;
    private Reptile personagem1;
    private Kitana personagem2;

    //Danos da luta
    private Integer dano;
    private Integer danocombo1;
    private Integer dancombo2;

    public String getCenario() {
        return cenario;
    }

    public void setCenario(String cenario) {
        this.cenario = cenario;
    }

    public Reptile getPersonagem1() {
        return personagem1;
    }

    public void setPersonagem1(Reptile personagem1) {
        this.personagem1 = personagem1;
    }

    public Kitana getPersonagem2() {
        return personagem2;
    }

    public void setPersonagem2(Kitana personagem2) {
        this.personagem2 = personagem2;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public Integer getDanocombo1() {
        return danocombo1;
    }

    public void setDanocombo1(Integer danocombo1) {
        this.danocombo1 = danocombo1;
    }

    public Integer getDancombo2() {
        return dancombo2;
    }

    public void setDancombo2(Integer dancombo2) {
        this.dancombo2 = dancombo2;
    }
  
    
    public LutaRxK() {
        this.cenario = "Floresta";
        this.personagem2 = new Kitana();//4
        this.personagem1 = new Reptile();//1
        this.dano = 7;
        this.danocombo1 = 15;
        this.dancombo2 = 20;
    }
    

    /*
     Recebe como parametro o lutador que ACERTOU o golpe
     Tira a vida do que foi acertado, considerando o dano
     */
    public void AcertaGolpe(String lutador) 
    {
        if (lutador.equals("p1")) 
        {
            //tira a vida do personagem 2 
            this.personagem2.setVida(this.personagem2.getVida() - this.dano);
        } else 
        {
            this.personagem1.setVida(this.personagem1.getVida() - this.dano);
        }
    }

    public void AcertaCombo1(String lutador) 
    {
        if (lutador.equals("p4"))
        {
            
          this.personagem1.setVida(this.personagem1.getVida() - this.danocombo1);
    }
else      
    {
    this.personagem2.setVida(this.personagem2.getVida() - this.danocombo1);
    }
}
    public void AcertaCombo2(String lutador) 
    {
        if (lutador.equals("p4"))
        {
            
          this.personagem1.setVida(this.personagem1.getVida() - this.dancombo2);
    }
else      
    {
    this.personagem2.setVida(this.personagem2.getVida() - this.dancombo2);
    }
}
}
