package com.abstraction;

import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        int key = 9;
        int a[] = {1, 2, 3, 4, 5, 6, 6, 8, 9};
        for (int i = 0; i < a.length; i++)
        {
            if (key == a[i])
            {
                System.out.println("it is found element");

            }
            else {
                System.out.println("the element is not found");
            }

        }

    }
}
