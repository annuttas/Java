// 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class java_hw_1_1 {
    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.println("Введите число n: ");
            int n = iScanner.nextInt();
            for (int i = 1; i <= n; i++) {
                if (i != n) {
                    System.out.print(i + "+");
                } else {
                    System.out.print(i + "=");
                }
            }
            System.out.print(n * (n + 1) / 2);
        }
    }

}