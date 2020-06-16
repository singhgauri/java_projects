package com.company;
import java.util.regex.Pattern;

public class Main {

    static String reversewords(String str) {

        Pattern pattern = Pattern.compile("\\s");
        String[] temp = pattern.split(str);
        String result = "";

        for (int i = 0;)


        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;

    }

    public static void main(String[] args) {
        String str1 = "I am learning Java";
        String reverse = "";

        int i;
        for (i = str1.length()-1; i>=0;i--) {
            reverse = reverse + str1.charAt(i);
        }

        System.out.println("Reversed letter of string are:\n " + reverse);

        System.out.println("Reversed words of string are: \n" + reversewords(str1));

    }



}


