public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 20");

        double i = 1;

        while (i <= 15){

            /*int quadrado = i * i;*/
            double quadrado = Math.pow(i, 2);
            System.out.printf("O quadrado de %.0f é %.0f%n", i, quadrado);
            i++;
        }
    }
}