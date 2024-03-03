public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi(23.5, "Jorge");
        Zumbi zumbi2 = new Zumbi(50, "Renato");

        System.out.println(zumbi1.mostraVida());
        System.out.println(zumbi2.mostraVida());

        zumbi1.transfereVida(zumbi2, 11);
    }
}