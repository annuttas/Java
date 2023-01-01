// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.List;

public class java_hw_3_2 {
    public static void main(String[] args) {

        List<Integer> list_numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list_numbers.add(getRandomNumber());
        }
        System.out.println(list_numbers);

        int i = 0;
        while (i < list_numbers.size()) {
            if (list_numbers.get(i) % 2 == 0) {
                list_numbers.remove(i);
            } else
                i++;
        }
        System.out.println(list_numbers);
    }

    public static int getRandomNumber() {
        double x = (Math.random() * 100);
        int num = (int) x;
        return num;
    }
}