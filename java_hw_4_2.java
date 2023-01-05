// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.Scanner;
import java.util.LinkedList;

public class java_hw_4_2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (int i = 0; i < 6; i++) {
            ll.add(i);
        }
        System.out.printf("Начальная очередь:  %s\n", ll);
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите новый элемент очереди: ");
        int newElem = iScanner.nextInt();
        iScanner.close();

        System.out.printf("Помещаем элемент '%s' в конец очереди. Очередь: %s\n", newElem, Enqueue(ll, newElem));
        System.out.printf("Первый элемент из очереди '%s' удален. Очередь: %s\n", Dequeue(ll), ll);
        System.out.printf("Возвращаем первый элемент из очереди '%s', не удаляя его. Очередь: %s", First(ll), ll);
    }

    public static LinkedList<Integer> Enqueue(LinkedList<Integer> ll, int newElem) {
        ll.add(newElem);
        return ll;
    }

    public static int Dequeue(LinkedList<Integer> ll) {
        int firstElement = ll.poll();
        return firstElement;
    }

    public static int First(LinkedList<Integer> ll) {
        int first = ll.getFirst();
        return first;
    }
}