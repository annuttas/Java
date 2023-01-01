// Реализовать алгоритм сортировки слиянием

import java.util.*;

public class java_hw_3_1 {
    public static void main(String[] args) {
        int[] array = { 6, 3, 12, 3, 1, 8, 4, 3, 7 };
        System.out.println("Первоначальный массив:");
        System.out.println(Arrays.toString(array));
        array = mergeSorting(array, array.length);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
    }

    private static int[] mergeSorting(int[] arr, int n) {
        if (n < 2) {
            return arr;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }
        mergeSorting(l, mid);
        mergeSorting(r, n - mid);

        merge(arr, l, r, mid, n - mid);
        return arr;
    }

    private static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
