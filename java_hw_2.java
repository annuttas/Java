// Реализовать алгоритм сортировки массива слиянием

import java.util.ArrayList;;

public class java_hw_2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = initArray();
        System.out.println("Исходный массив: \n" + printArray(list));
        list = mergeSort(list);
        System.out.println("Отсортированный массив: \n" + printArray(mergeSort(list)));
    }

    public static ArrayList<Integer> initArray() {
        ArrayList<Integer> list = new ArrayList<>();
        int arrayLen = 25;
        for (int i = 0; i < arrayLen; i++) {
            list.add((int) (Math.random() * 100));
        }
        return list;
    }

    public static String printArray(ArrayList<Integer> array) {
        StringBuilder ans = new StringBuilder("");
        for (int i = 0; i < array.size(); i++) {
            ans.append(array.get(i) + " ");
        }
        return ans.toString();
    }

    public static ArrayList<Integer> mergeArrays(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        ArrayList<Integer> outArray = new ArrayList<>();
        int index_1 = 0;
        int index_2 = 0;
        int outLen = array1.size() + array2.size();

        for (int i = 0; i < outLen; i++) {
            if (index_1 >= array1.size()) {
                outArray.add(array2.get(index_2++));
            } else if (index_2 >= array2.size()) {
                outArray.add(array1.get(index_1++));
            } else if (array1.get(index_1) < array2.get(index_2)) {
                outArray.add(array1.get(index_1++));
            } else {
                outArray.add(array2.get(index_2++));
            }
        }

        return outArray;
    }

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> array) {
        if (array.size() == 0) {
            return null;
        }
        if (array.size() < 2) {
            return array;
        }
        ArrayList<Integer> leftArray = new ArrayList<>();
        for (int i = 0; i < array.size() / 2; i++)
            leftArray.add(array.get(i));
        ArrayList<Integer> rightArray = new ArrayList<>();
        for (int i = array.size() / 2; i < array.size(); i++)
            rightArray.add(array.get(i));

        leftArray = mergeSort(leftArray);
        rightArray = mergeSort(rightArray);

        return mergeArrays(leftArray, rightArray);
    }

}