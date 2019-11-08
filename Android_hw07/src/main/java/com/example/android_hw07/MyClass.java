package com.example.android_hw07;

public class MyClass {
    public  static  void main(String[] avrg) {
        java.util.Scanner scanner= new
                java.util.Scanner(System.in);
        int inp,sum;

        System.out.println("請輸入一個數值 :");
        inp=scanner.nextInt();
        sum=0;
        for (int n=1;n<=inp;n++)
        {
            sum+=n;
        }
        System.out.println("Ans:"+sum);
    }
}