package com.abishek.sample;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        char[] wordArray = word.toCharArray();
        int backwardCount = wordArray.length - 1, forwardCount = 0;

        while(forwardCount < backwardCount) {
                if (!Character.isAlphabetic(wordArray[forwardCount])) {
                    forwardCount++;
                } else if(!Character.isAlphabetic(wordArray[backwardCount])) {
                    backwardCount--;
                } else {
                    char temp = wordArray[forwardCount];
                    wordArray[forwardCount] = wordArray[backwardCount];
                    wordArray[backwardCount] = temp;
                    forwardCount++;
                    backwardCount--;
                }
        }
        System.out.println(new String(wordArray));
    }
}
