package com.jli.test05;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[4];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
