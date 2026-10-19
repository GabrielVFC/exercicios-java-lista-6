import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 12");
        Scanner sc = new Scanner(System.in);

        int senha = 1234;

        System.out.println("Digite a senha: ");
        int senhaDigitada = sc.nextInt();

        while (senha != senhaDigitada){
            System.out.println("Senha incorreta, tente novamente!");
            senhaDigitada = sc.nextInt();
        }

        System.out.println("Senha digitada correta.");
    }
}