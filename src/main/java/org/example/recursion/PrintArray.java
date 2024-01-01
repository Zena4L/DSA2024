package org.example.recursion;

public class PrintArray {
    public static void main(String[] args) {
        int[] myArr ={1,2,2,4,5,7};
        printArray(myArr,6,0);
        System.out.println(firstOccurance(myArr,6,0,7));
        System.out.println(lastOccurance(myArr,6,5,2));
            reverseArry(myArr,6,5);
    }

    public static void printArray(int[] arr, int size, int index){
        if(index == size) return;
        System.out.println(arr[index]);
        printArray(arr,size,++index);
    }

    public static void reverseArry(int[] arr, int size, int index){
        if (index < 0) return;
        System.out.println(arr[index]);
        reverseArry(arr,size,--index);
    }

    public static int firstOccurance(int[] arr, int size, int index, int val){
        if (index == size) return -1;
        if (arr[index] == val){
            return index;
        }
        return firstOccurance(arr,size,++index,val);
    }

    public static int lastOccurance(int[] arr, int size, int index, int val){
        if (index < 0) return -1;
        if (arr[index] == val){
            return index;
        }
        return lastOccurance(arr,size,--index,val);
    }
}
