package org.example.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] myArr = {1,2,3,4,5};
        linearSearch(myArr,7);
    }

    public static void linearSearch(int[] arr, int item){
        for(int i =0; i < arr.length; i++){
            if(arr[i] == item){
                System.out.println(item + " found at index " + i);
                return;
            }
        }
        System.out.println("item not found");

    }
}
