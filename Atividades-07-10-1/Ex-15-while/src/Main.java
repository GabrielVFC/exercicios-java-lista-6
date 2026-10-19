import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 15");
        Scanner sc = new Scanner(System.in);

        double preco = 1;

        while (preco > 0){
            System.out.println("Digite um preço de um produto: ");
            preco = sc.nextDouble();
        }

        System.out.println("Você digitou um preço negativo");
    }
}