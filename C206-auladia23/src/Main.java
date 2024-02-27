import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero de lanches da primeira hora: ");
        int lanche1 = entrada.nextInt();
        System.out.println("Digite o numero de lanches da segunda hora: ");
        int lanche2 = entrada.nextInt();
        System.out.println("Digite o numero de lanches da terceira hora: ");
        int lanche3 = entrada.nextInt();

        int lanchetotal = lanche1 + lanche2 + lanche3;
        float media = lanchetotal/3.0f;

        System.out.println("O total de lanches foi: "+lanchetotal);
        System.out.println("A media de lanches foi: "+media);

        entrada.close();
    }
}