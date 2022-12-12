// 2. Вывести все простые числа от 1 до 1000

public class java_hw_1_2 {
    public static void main(String[] args) {
        boolean b = true;
        for (int n = 2; n <= 1000; n++) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b)
                System.out.println(n);
            else
                b = true;
        }
    }
}