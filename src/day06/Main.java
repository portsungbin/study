package day06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] a = new char[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.next().charAt(0);
        }

        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }


    }
}