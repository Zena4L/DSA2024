package org.example.recursion;

/*

You are given an array with n number of elements. You have to print the maximum of an array using a recursion function.
Sample Input:  6, 9, 1, 2 Sample Output: 9

 */
public class MaxValueInArray {
    public static void main(String[] args) {
        int[] myArr = {6, 9, 1, 2, 10 };
        System.out.println(printMaxValueInArray(myArr,4));
    }

    private static int printMaxValueInArray(int[] arr , int i){
        if(i > 0){
            return Math.max(arr[i], printMaxValueInArray(arr, --i));
        }else {
            return arr[0];
        }
    }
}
