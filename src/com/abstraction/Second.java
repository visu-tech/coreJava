package com.abstraction;

public class Second {
    public static void main(String[] args) {
        int max1=0;
               int  max2 = 0;
        int a[]={21,65,87,9,76,55,45};
        for(int i=0;i<a.length;i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            } else if (a[i]>max2) {
                max2=a[i];

            }
        }
        System.out.println(max2);
    }
}
