// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;

public class java_hw_3_3 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int num = random.nextInt(100);
            array.add(num);
            count += num;
        }
        System.out.println("\nЦелочисленный список ArrayList:\n" + array);
        Collections.sort(array);

        System.out.println("Минимальное: " + array.get(0));
        System.out.println("Максимальное: " + array.get(9));
        System.out.println("Среднее: " + count / 10);
    }

}