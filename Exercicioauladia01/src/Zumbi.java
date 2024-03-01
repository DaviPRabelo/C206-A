public class Zumbi {
    int vida;
    String nome;
    float altura;
    float forca;

    void iniciar(){
        vida = 100;
        nome = "Veloso, cabelo de buneca";
        altura = 1.84f;
        forca = 50;
    }
    void andar(){
        System.out.println("Zumbi andando");
    }
    void seAlimentar(){
        System.out.println("Comendo um humano");
    }

}
