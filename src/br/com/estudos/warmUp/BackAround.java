package br.com.estudos.warmUp;

/*
*Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
* */
public class BackAround {

    public static String backAround(String str) {
        return str = str.substring(str.length()-1 ) + str + str.substring(str.length()-1);
    }

    public static String backAroundSolution(String str) {
        // Get the last char
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }

    public static String backAround2(String str) {
        String lastChar = str.substring(str.length()-1);
        return String.format("%s%s%s",lastChar,str,lastChar);
    }
}
