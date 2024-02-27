import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);

        int numrand;
        numrand = rand.nextInt(10)+1;
        int numero;

        do {
            System.out.println("Qual o numero estou pensando:");
             numero = entrada.nextInt();
             if (numero != numrand)
             {
                 System.out.println("Que pena, vc errou");
                 System.out.println("Tente mais uma vez");
             }
        }while (numero != numrand);

        System.out.println("Caramba, vc acertou");
        entrada.close();
    }
}