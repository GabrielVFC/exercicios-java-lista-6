import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 19");
        Scanner sc = new Scanner(System.in);

        int idade = 1;
        int soma = 0;
        int i = 0;
        while (idade != 0){
            System.out.println("Digite um idade: ");
            idade = sc.nextInt();

            if (idade != 0){
                soma = soma + idade;
                i++;
            }
        }

        if (i > 0){
            double media = (double) soma / i;
            System.out.printf("A média do grupo é de: %.2f", media);
        } else {
            System.out.println("Nenhuma idade informada");
        }
    }
}