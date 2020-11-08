package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int tmp = input;
        int number2 = 0;

        while (tmp > 0) {
            int t = tmp % 10;
            number2 = t + number2 * 10;
            tmp /= 10;
        }
        if (input == number2){
            System.out.println("It's palindrome");
        }
        else System.out.println("It's NOT palindrome");
    }
}
