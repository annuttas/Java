// Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000

import java.util.Scanner;

public class java_hw_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("\n\nВведите число: a = ");
        int a = iScanner.nextInt();
        System.out.print("Введите степень числа: b = ");
        int b = iScanner.nextInt();
        iScanner.close();
        double res = 1;
        for (int i = b > 0 ? b : -b; i > 0; i--) {
            res *= a;
        }
        if (a == 0) {
            System.out.print("ответ: не определено");
        } else {
            System.out.print("ответ: ");
            System.out.print(b > 0 ? res : 1 / res);
        }

    }
}