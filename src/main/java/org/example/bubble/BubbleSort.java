package org.example.bubble;

public class BubbleSort {
    public static void main(String[] args) {
        int[] myArr = {10,2,30,5,3};
        System.out.println("----unsorted ------");
        printArr(myArr);
        bubbleSort(myArr);

        System.out.println("----sorted ------");
        printArr(myArr);

    }

    public static void printArr(int[] arr){
        for (int j : arr) {
            System.out.println(j + " ");
        }
    }
    public static void bubbleSort(int[] arr){
        int i, j;
        int len = arr.length;
        boolean swapped =false;
        for(i=0; i < len-1; i++){
            for(j=0; j<len-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) break;
        }
    }
}
