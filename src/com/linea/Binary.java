package com.linea;

public class Binary {

    int mid;

    public int giveIndex(int[] arr, int key, int low, int high) {
        while (low <= high) {
            if (key == arr[mid]) {
                return mid;

            } else if (key < arr[mid]) {
                mid = low + high / 2;

            }
            if (key > arr[mid]) {
                return mid;
            }
        }
        return -1;

    }

}







