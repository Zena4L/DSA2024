package org.example.recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(2L,2L));
    }

    public static Long power(Long num, Long raisedTo){

        if( raisedTo != 0){
            return num * power(num, raisedTo - 1);
        }else {
            return 1L;
        }
    }
}
