import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner alunos = new Scanner(System.in);
        System.out.println("Qual a quantidade de alunos: ");
        int aluns = alunos.nextInt();

        switch(aluns){
            case 10:
            {
                System.out.println("A sala a ser utilizada e: I-16");
            }
            break;
            case 20:{
                System.out.println("A sala a ser utilizada e: I-16");
            }
            break;
            case 30:
            {
                System.out.println("A sala a ser utilizada e: I-22");
            }
            break;
            default:
            {
                System.out.println("Nenhuma sala destinada a essa quantidade.");
            }
        }
        alunos.close();
    }
}
