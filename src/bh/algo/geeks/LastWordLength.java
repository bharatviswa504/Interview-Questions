package bh.algo.geeks;

import java.util.Scanner;

/**
 * Created by bharatviswanadham on 6/10/17.
 */
public class LastWordLength {
    public static void main (String[] args) {
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();
        for (int i=0;i<testCases;i++) {
            String word = sc.next();
            String[] arr = word.split(" ");
            if(arr.length == 1) {
                System.out.println(0);
            }
            else {
                String lastWord = arr[arr.length-1];
                System.out.println(lastWord.length());
            }
        }
    }
}
