package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] words = s.split("\s");
        boolean check;
        for (String word : words) {
            check = isPalindrome(word);
            System.out.println(check);
        }
    }
    public static String reverseString(String s){
        String k="";
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            k+=c;
        }
        return k;
    }
    public static boolean isPalindrome(String s){
        String n=s.toLowerCase();
        String m=reverseString(n);
        return n.equals(m);
    }

}
