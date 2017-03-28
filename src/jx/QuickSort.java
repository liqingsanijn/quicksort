package jx;

import java.util.Arrays;

public class QuickSort {

    public QuickSort(){

    }

    public static void main(String[] args) {
        int arr[] = {7, 9, 0, 6, 8, 2, 4, 3, 5, 1};
        int arr2[] = {1, 6, 5, 2, 4};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr,0, 9);
        System.out.println(Arrays.toString(arr));
    }

    public void quickSort(int[] array, int low, int high) {
        System.out.println("low:"+low+",high:"+high);
        System.out.println(Arrays.toString(array));
        if (low < high) {
            int q = partition(array, low, high);
            quickSort(array, low, q-1);
            quickSort(array, q+1, high);
        }
    }

    public int partition(int[] array, int low, int high) {
        int x = array[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (array[j] <= x) {
                i++;
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
        int t = array[i + 1];
        array[i + 1] = array[high];
        array[high] = t;
        return i+1;
    }
}