package org.example.recursion;

/*
Sample Input1 —- 1 Sample Output1 —-1 1 1
Sample Input2 —- 2 Sample Output2 —- 2 1 1 1 2 1 1 1 2
Sample Input2 —- 3 Sample Output3 —- 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
Figure out the pattern and solve it using a recursive function to achieve the above for any positive number n.

 */
public class FindPattern {
    public static void main(String[] args) {
        System.out.println(printPatter(3));
    }

    public static String printPatter(int n){
        if(n == 1){
            return String.valueOf(n).repeat(3);
        }else {
            return (n + printPatter(n-1)).repeat(n)+n;
        }
    }
}
