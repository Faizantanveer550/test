package com.company;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[10];
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        System.out.print(phoneNumber(array));
    }

    static String phoneNumber(int[] arr){

        String number = "";
        for(int i = 0; i < arr.length; i++){

            if(i == 0){
                number = number + "(";
            }
            if(i == 3){
                number = number + ")";
            }
            if(i == 6){
                number = number + "-";
            }
            if(i < arr.length){
                number = number + Integer.toString(arr[i]);
            }
        }
        return number;
    }
}
