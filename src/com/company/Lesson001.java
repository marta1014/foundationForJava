package com.company;

public class Lesson001 {
    public static void main(String[] args) {
        int[] arr = {1,9,8,3};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
            System.out.println(arr[i]);
        }
        System.out.println(6 % 10);
    }
}
