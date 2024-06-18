package com.abstraction;

public class Maximum {
    public static void main(String[] args) {
        int max = 0;

        int a[]= {21,34,5,6,78,90};
        for (int i=0;i< a.length;i++){
            if(a[i]>max){
                max=a[i];



            }
        }
        System.out.println(max);
    }
}
