import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();

        System.out.println("Tabela de multiplicação de " + number);

        for (int i = 1; i <= 10; i++) {
            double result = i * number;
            System.out.println(i + " * " + number + " = " + result);
        }
    }
}
