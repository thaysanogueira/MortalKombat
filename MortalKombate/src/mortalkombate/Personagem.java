package mortalkombate;

public class Personagem {
    protected String socofraco;
    protected String socoforte;
    protected String chutefraco;
    protected String chuteforte;
    protected String defesa;
    protected String agarra;
    protected String especial;
    protected String trocapersonagem;
    private Integer vida;

    //Get e Set (Get = retorna o valor do atributo e Set eu atribuo novo valor)
    //This = atributo, variavel da propia classe
    public String getTrocapersonagem() {
        return trocapersonagem;
    }

    public void setTrocapersonagem(String trocapersonagem) {
        this.trocapersonagem = trocapersonagem;
    }

    public String getSocofraco() {
        return socofraco;
    }

    public void setSocofraco(String socofraco) {
        this.socofraco = socofraco;
    }

    public String getSocoforte() {
        return socoforte;
    }

    public void setSocoforte(String socoforte) {
        this.socoforte = socoforte;
    }

    public String getChutefraco() {
        return chutefraco;
    }

    public void setChutefraco(String chutefraco) {
        this.chutefraco = chutefraco;
    }

    public String getChuteforte() {
        return chuteforte;
    }

    public void setChuteforte(String chuteforte) {
        this.chuteforte = chuteforte;
    }

    public String getDefesa() {
        return defesa;
    }

    public void setDefesa(String defesa) {
        this.defesa = defesa;
    }

    public String getAgarra() {
        return agarra;
    }

    public void setAgarra(String agarra) {
        this.agarra = agarra;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Personagem() {
        this.agarra = null;
        this.chuteforte = null;
        this.chutefraco = null;
        this.socoforte = null;
        this.socofraco = null;
        this.defesa = null;
        this.especial = null;
        this.vida = 100;
        this.trocapersonagem = null;
    }

    String combo1() {
        return null;
    }

    String combo2() {
        return null;
    }

    String fatality1() {
        return null;
    }

    String fatality2() {
        return null;
    }
    
}
