public class Main {
    public static void main(String[] args) {
        Zumbi zumbi = new Zumbi();

        zumbi.forca = 100;
        zumbi.vida = 200;
        zumbi.altura = 1.50f;
        zumbi.nome = "David";

        System.out.println("o nome é: " +zumbi.nome);
        zumbi.andar();
        zumbi.seAlimentar();

        zumbi.iniciar();
        System.out.println("o nome é: " +zumbi.nome);
    }
}