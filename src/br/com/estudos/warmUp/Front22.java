package br.com.estudos.warmUp;
/*
* Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
* */

public class Front22 {
    public static  String front22(String str) {
        return (str.length() <= 2) ?  str + str + str : str.substring(0, 2) + str + str.substring(0, 2);
    }

    public  static String front22Bill(String str) {
        String twoChars;
        if(str.length() <= 2){
            twoChars = str;
        }else{
            twoChars = str.substring(0,2);
        }

        return String.format("%s%s%s",twoChars,str,twoChars);
    }

    public static String front22Solution(String str) {
        // First figure the number of chars to take
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }

        String front = str.substring(0, take);
        return front + str + front;
    }

}
