package com.rene;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x;
        System.out.println("enter Number of Laps : \r");
        x=scanner.nextInt();

        int[] lapTimes = getLaptimes(x);
        int[] sorted = sortLaptimes(lapTimes);
        printArray(sorted);
    }

    public static int[] getLaptimes(int lapnumber) {
        int[] array = new int[lapnumber];
        System.out.println("enter " + lapnumber + " Laptimes: " );
        for(int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(" Lap " + i + " time " + array[i]);
        }
    }

    public static int[] sortLaptimes(int[] array){
        int[] sortedArray = new int[array.length];
        for(int i=0; i<array.length; i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}

