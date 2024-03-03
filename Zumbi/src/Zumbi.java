public class Zumbi {
   public double vida;
   public String nome;

    public Zumbi(double vida, String nome) {
        this.vida = vida;
        this.nome = nome;
    }

    public double mostraVida(){
        return this.vida;
    }

    public void transfereVida(Zumbi zumbiAlvo, double quantia){
        this.vida += quantia;
        zumbiAlvo.vida -= quantia;
        System.out.println(this.vida);
        System.out.println(zumbiAlvo.vida);
    }
    void andar(){
        System.out.println("Zumbi andando");
    }
    void seAlimentar(){
        System.out.println("Comendo um humano");
    }
}