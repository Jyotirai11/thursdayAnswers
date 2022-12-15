package jyoti;

import java.util.Scanner;

public class UseString {

	public static void main(String[] args) {
		String str1  = "Hello World";
        System.out.println(str1);

        String str2  = "Hello Jyoti";
        System.out.println(str2);

// break string
        String str3 = str1.substring(0,5);
        System.out.println(str3);

        String str4 = str2.substring(5);
        System.out.println(str4);

// Concatination of string
        String  str5 = str3.concat(str4);
        System.out.println(str5);

// Indexof
        System.out.println( str5.indexOf("Jyoti"));

// get a double value and convert it into a string
        double y = 203.354d;
        String str6 = String.valueOf(y);
        System.out.println(str6);
	}

}
