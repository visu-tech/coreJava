package com.linea;

public class Linear {
    public static void main(String[] args) {
        // public int greatInvision(int[]arr, int key){
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int key = 4;
        for (int i = 0; i < intArray.length; i++) {
            if (key == intArray[i]) {


                System.out.println(i);
            }
        }
    }
}


