import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 13");
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int negativos = 0;

        while (i < 10){
            System.out.println("Digite um valor: ");
            int num = sc.nextInt();

            if (num < 0){
                negativos++;
            }
            i++;
        }
        System.out.printf("Quantidade de números negativos: %d%n", negativos);
    }
}