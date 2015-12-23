package com.course.misc;
import java.util.Random;

public class ArrayExercises {

    public static void main(String[] args){

        int[] array = createRandomIntArray(10, 10);
        System.out.println("original random array:");

        arrayPrinter(array);

        int[] newArray = getUniqueArray(array);

        System.out.println("After deletion of duplicates:");

        arrayPrinter(newArray);


    }

    //Create an array with random numbers
    public static int[] createRandomIntArray(int length, int randomMax){
        int[] array = new int[length];
        Random rnd = new Random();

        for(int i = 0; i < length; i++){
            array[i] = rnd.nextInt(randomMax);
        }

        return array;
    }
    //Check whether an array contains a number given by arguments.
    public static boolean isArrayUnique(int[] nums,int check, int max){

        for (int i = 0; i < max; i++) {
            if(nums[i] == check){
                return false;
            }
        }

        return true;
    }

    //Get an array and return a new array without duplicates
    public static int[] getUniqueArray(int[] original){
        int[] newArray = new int[original.length];

        int count = 0;

        for (int i = 0; i < original.length; i++) {

            if(isArrayUnique(newArray, original[i], count)){
                newArray[count] = original[i];
                count++;
            }

        }
        //copy the new array to an even newer array with an appropriate number of indices
        int[] formattedArray = new int[count];

        System.arraycopy(newArray, 0, formattedArray, 0, count);

        return formattedArray;
    }

    public static void arrayPrinter(int[] array){
        for(int i: array){
            System.out.print("[" + i + "] ");
        }
        System.out.println();
    }

    public static int[] reverseArray(int[] array){
        int[] newArray = new int[array.length];

        for(int i = 0, j = array.length - 1; i < array.length; i++, j--){
            newArray[j] = array[i];
        }

        return newArray;
    }


}
