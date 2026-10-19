import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 14");
        Scanner sc = new Scanner(System.in);

        int num = -1;

        while (num != 0) {
            System.out.println("Digite um número: ");
            num = sc.nextInt();
        }

        System.out.println("Você digitou zero");
    }
}