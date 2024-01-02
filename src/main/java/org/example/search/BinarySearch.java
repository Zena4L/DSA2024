package org.example.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] myArr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(myArr,0,myArr.length -1,6));
    }

    public static int binarySearch(int[] arr,int low, int high, int target){
        while (low <= high){
            int mid = ((low + high)/2);
            if (arr[mid] < target){
                low = mid + 1;
            }else if (arr[mid] > target){
                high = mid -1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
