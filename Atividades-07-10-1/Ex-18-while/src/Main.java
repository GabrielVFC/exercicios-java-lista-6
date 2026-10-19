public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 18");

        double popA = 1000.0;
        double popB = 1500.0;

        int anos = 0;

        while (popA <= popB){
            popA = popA + (popA * 0.02);
            popB = popB + (popB * 0.01);

            anos++;
        }

        System.out.printf("A cidade A passará a cidade B em: %d anos%n", anos);
        System.out.printf("População final da cidade A: %.0f habitantes%n", popA);
        System.out.printf("População final da cidade B: %.0f habitantes%n", popB);
    }
}