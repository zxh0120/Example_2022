
package org.example.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{2, 7, 9, 3, 5, 1};
        for (int t : array) {
            System.out.println(t);
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                //正序是大于号，大的值往后走；反序小于号
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后---------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
