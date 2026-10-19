import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 11");
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite uma nota entre 0 e 10: ");
        int nota = sc.nextInt();

        while (nota < 0 || nota > 10){
            System.out.println("Valor errado, digite uma nota entre 0 e 10: ");
            nota = sc.nextInt();
        }

        System.out.printf("Nota informada válida: %d%n", nota);
    }
}