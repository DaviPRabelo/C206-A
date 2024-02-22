public class Main {
    public static void main(String[] args) {
        int numero = 9;

        System.out.println(calcularFatorial(numero));
        numerosPares(numero);

    }

    public static int calcularFatorial(int numero){
        if(numero == 0|| numero == 1) {
            return 1;
        }
        else {
            return numero*calcularFatorial(numero-1);
        }
    }
    public static void numerosPares(int numero){
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
    }
}