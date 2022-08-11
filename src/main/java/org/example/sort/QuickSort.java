package org.example.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {6, 1, 9, 8, 3, 3, 10};

//        System.out.println(Arrays.toString(arr) + " 原始数据。。。。。");
//        sort(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr) + "排序完成。。。。。。");

        quick_sort(arr, 0, arr.length);
        for (int i : arr) {
            System.out.printf("\t" + i);
        }
    }

    /**
     * @param num 数组
     * @param l   0
     * @param r   数组长度
     * @return
     */
    public static int[] quick_sort(int[] num, int l, int r) {
        //r为数组元素总个数，last下标等于r-1
        int first = l, last = r - 1, key = num[first];

        while (first < last) {
            while (first < last && num[last] >= key) {
                --last;
            }
            //如果值小于key分界值 交换
            num[first] = num[last];
            while (first < last && num[first] < key) {
                ++first;
            }
            //如果值大于key分界值 交换
            num[last] = num[first];
        }
        num[first] = key;
        //递归左右部分进行快排
        if (first > l) {
            num = quick_sort(num, l, first);
        }
        if (first + 1 < r) {
            num = quick_sort(num, first + 1, r);
        }
        return num;
    }

    private static void sort(int[] arr, int low, int high) {
        //递归返回条件
        if (low >= high) {
            return;
        }
        /*
         * 为什么要定义i和j来代替low和high呢，因为后续左右区间元素还需要用到
         * low和high两个变量，至于key值得引入，其实用arr[low]代替完全没有
         * 影响
         */
        int j = high;
        int i = low;
        int key = arr[i];//基准值
        /*
         * 当这个while内部达到i==j的田间时，while循环终止
         */
        while (i < j) {
            /*
             * 解释一下内层两个while的"i<j":
             *
             * 当数组元素为{2，3}时，第一次j--后i=j,arr[j]=arr[0]=2=key,不加
             * "i<j"，则j继续j--,则出现arr[-1]，数组下标越界
             */
            while (arr[j] >= key && i < j) {
                j--;
            }

            while (arr[i] <= key && i < j) {
                i++;
            }

            /*
             * i!=j时交换arr[i]和arr[j]
             * i=j时交换arr[i]等于arr[j],交换arr[i]和基准处的值
             * 不要想着可以 arr[i]=arr[low];arr[low]=arr[j];
             * 这是很傻的
             *
             */
            if (i != j) {
                int temp;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                System.out.println(Arrays.toString(arr) + " 正在排序中.........");
            } else {
                int temp;
                temp = arr[j];
                arr[j] = arr[low];
                arr[low] = temp;
                System.out.println(Arrays.toString(arr) + " 正在排序中.........");
            }
        }

        /*
         * 你可能觉得当一个数组中最小元素在第一个的时候，i-1小于0，后续代码中
         * 使用arr[i-1]的时候可能数组下标越界，放心，当i-1小于0时首先不满足递
         * 归边界条件，递归就会返回。
         */
        sort(arr, low, i - 1);

        /*
         * 你可能觉得当一个数组中最大元素在最后的时候，i+1大于0，后续代码中
         * 使用arr[i+1]的时候可能数组下标越界，放心，当i+1大于0时首先不满足递
         * 归边界条件，递归就会返回。
         */
        sort(arr, i + 1, high);

    }

}
