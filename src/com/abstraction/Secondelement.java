package com.abstraction;



public class Secondelement {
    public static void main(String[] args) {

        int arr[] = {32, 4, 6, 78, 9};
        int first = 0;
        int second = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > first)
            {
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second)
            {
                second = arr[i];
            }
        }
        System.out.println(first);
        System.out.println(second);

    }
}







