import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Podaj liczbe 1:");
            int a = scanner.nextInt();
            System.out.println("Podaj liczbe 2:");
            int b = scanner.nextInt();
            Operations calc = new Operations();

        System.out.println("Wynik: " + calc.calc1(a, b));

             }
         }

