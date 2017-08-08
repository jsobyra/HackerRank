package com.hackerrank.data_structures;

public class JavaGenerics {

    public static void main( String args[] ) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        printArray(intArray);
        printArray(stringArray);
    }

    public static <T> void printArray(T[] element){
        for(T t : element)
            System.out.println(t);
    }
}
