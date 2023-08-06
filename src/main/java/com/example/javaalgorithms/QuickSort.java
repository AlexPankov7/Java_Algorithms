package com.example.javaalgorithms;

public class QuickSort {
    public static void main(String args[]){
        int[] arr = {2023, 5, 7, 3, 2, 777, 13, 19, -2};
        quickSort(arr, 0, arr.length -1);
        System.out.println("QuickSort");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    private static void quickSort(int[] arr, int l, int r) {
        if(l >= r) return;
        int pi = partition(arr, l, r);

        quickSort(arr, l, pi - 1);
        quickSort(arr, pi + 1, r);
    }
    private static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int ptr = l - 1;

        for(int i = l; i < r; i++){
            if(arr[i] < pivot){
                ptr++;
                swap(ptr, i, arr);
            }
        }
        swap(ptr + 1, r, arr);
        return ptr + 1;
    }

    private static void swap(int ptr, int i, int[] arr){
        int temp = arr[ptr];
        arr[ptr] = arr[i];
        arr[i] = temp;
    }
}