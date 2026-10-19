import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 16");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        int base = sc.nextInt();
        System.out.println("Digite o valor do expoente: ");
        int expoente = sc.nextInt();

        int resultado = 1;
        int i = 0;
        while (i < expoente){
            resultado = resultado * base;
            i++;
        }

        System.out.printf("O %d elevado a %d da %d%n", base, expoente, resultado);
    }
}