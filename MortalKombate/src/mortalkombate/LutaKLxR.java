package mortalkombate;
public class LutaKLxR {
   private String cenario;
    private Raiden personagem1;//3
    private KungLao personagem2;//2

    //Danos da luta
    private Integer dano;
    private Integer dano2;
    private Integer danocombo1;
    private Integer dancombo2;

    public String getCenario() {
        return cenario;
    }

    public void setCenario(String cenario) {
        this.cenario = cenario;
    }

    public Raiden getPersonagem1() {
        return personagem1;
    }

    public void setPersonagem1(Raiden personagem1) {
        this.personagem1 = personagem1;
    }

    public KungLao getPersonagem2() {
        return personagem2;
    }

    public void setPersonagem2(KungLao personagem2) {
        this.personagem2 = personagem2;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public Integer getDano2() {
        return dano2;
    }

    public void setDano2(Integer dano2) {
        this.dano2 = dano2;
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
    
    
    public LutaKLxR() {
        this.cenario = "Floresta";
        this.personagem2 = new KungLao();//2
        this.personagem1 = new Raiden();//3
        this.dano = 9;
        this.dano2 = 13;
        this.danocombo1 = 18;
        this.dancombo2 = 22;
    }
    

    /*
     Recebe como parametro o lutador que ACERTOU o golpe
     Tira a vida do que foi acertado, considerando o dano
     */
    public void AcertaGolpe(String lutador) 
    {
        if (lutador.equals("p3")) 
        {
            //tira a vida do personagem 2 
            this.personagem2.setVida(this.personagem2.getVida() - this.dano);
        } else 
        {
            this.personagem1.setVida(this.personagem1.getVida() - this.dano);
        }
    }

    public void AcertaGolpe2(String lutador) 
    {
        if (lutador.equals("p3"))
        {
            
          this.personagem2.setVida(this.personagem2.getVida() - this.dano2);
    }
else      
    {
    this.personagem1.setVida(this.personagem1.getVida() - this.dano2);
    }
}
    public void AcertaCombo2(String lutador) 
    {
        if (lutador.equals("p3"))
        {
            
          this.personagem2.setVida(this.personagem2.getVida() - this.dancombo2);
    }
else      
    {
    this.personagem1.setVida(this.personagem1.getVida() - this.dancombo2);
    }
}
    public void AcertaCombo1(String lutador) 
    {
        if (lutador.equals("p2"))
        {
            
          this.personagem1.setVida(this.personagem1.getVida() - this.danocombo1);
    }
else      
    {
    this.personagem2.setVida(this.personagem2.getVida() - this.danocombo1);
    }
}
    
} 

