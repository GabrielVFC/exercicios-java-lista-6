import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 17");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        long fatorial = 1;
        int i = 1;

        while (i <= num){
            fatorial *= i;
            i++;
        }

        System.out.printf("O fatorial de %d é %d", num, fatorial);
    }
}