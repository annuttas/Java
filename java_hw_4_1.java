// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список

import java.util.LinkedList;

public class java_hw_4_1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (int i = 0; i < 11; i++) {
            ll.add(i);
        }
        System.out.printf("Первоначальный список :  %s\n", ll);
        System.out.printf("Перевёрнутый список :  %s\n", reverseLinkedList(ll));
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> ll) {
        LinkedList<Integer> revll = new LinkedList<Integer>();
        for (int i = ll.size() - 1; i >= 0; i--) {

            revll.add(ll.get(i));
        }
        return revll;
    }

}