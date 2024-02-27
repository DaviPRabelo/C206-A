import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner nota = new Scanner(System.in);

        System.out.println("Informe a nota do aluno: ");
        int nota1 = nota.nextInt();
        if(nota1 >= 60)
        {
            System.out.println("Boa! Joga muito.");
        } else {
            System.out.println("Ainda da... confia");
            System.out.println("Qual a nota da NP3 do aluno: ");
            int np3 = nota.nextInt();
            if((np3+nota1)/2 >= 50){
                System.out.println("Nota final: " +(np3+nota1)/2);
                System.out.println("Ae, sabia que iria conseguir.");
            }
            else {
                System.out.println("Nota final: " +(np3+nota1)/2);
                System.out.println("Nao foi desta vez.");
            }

        }
        nota.close();
    }
}
