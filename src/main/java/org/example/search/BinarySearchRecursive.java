package org.example.search;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] myArr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(myArr,0,myArr.length -1,5));
    }

    public static int binarySearch(int[] arr, int left, int right, int item){
        if(right >= left){
            int mid = left + ((right - left)/2);
            if(arr[mid] == item){
                return mid;
            } else if (arr[mid] > item) {
                return binarySearch(arr,left, mid-1,item);
            }else {
                return binarySearch(arr, mid+1,right,item);
            }
        }else {
            return -1;
        }
    }
}
