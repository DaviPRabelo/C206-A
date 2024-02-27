import java.util.Random;
import java.util.Scanner;

public class exercicio6 {
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
                    if(numero > numrand)
                    {
                        System.out.println("O meu numero é menor");
                    } else if (numero < numrand) {
                        System.out.println("O meu numero é maior");
                    }
                    System.out.println("Tente mais uma vez");
                    System.out.println("");
                }
            }while (numero != numrand);

            System.out.println("Parabéns, vc acertou");
            entrada.close();
        }
}

