package com.abishek.sample;

import java.util.Scanner;

public class ReplaceDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        System.out.println(new String(findDuplicates(word.toCharArray())));

    }

    private static char[] findDuplicates(char[] str) {
        int count = 0, valueCounter = 1;
        while(str.length > count ) {
            for(int i = valueCounter; i < str.length; i++) {
                if(String.valueOf(str[count]).equalsIgnoreCase(String.valueOf(str[i]))) {
                    if(str[i] == 'z') {
                        str[i] = 'a';
                        continue;
                    }
                    if(str[i] == 'Z') {
                        str[i] = 'A';
                        continue;
                    }
                    if(str[i] == '9') {
                        str[i] = '0';
                        continue;
                    }
                    int temp = str[i];
                    ++temp;
                    str[i] = (char) temp;
                    count++;
                    valueCounter++;
                    findDuplicates(str);
                }
            }
            valueCounter++;
            count++;
        }
        return str;
    }
}
