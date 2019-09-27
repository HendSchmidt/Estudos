package br.com.estudos.warmUp;
/*
* Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.

front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
* */
public class Front3 {

    public String front3(String str) {
        return (str.length() >= 3) ? str.substring(0 ,3) + str.substring(0,3) + str.substring(0,3) : str + str + str;
    }


    public String front3Solution(String str) {
        String front;
        if (str.length() >= 3) {
            front = str.substring(0, 3);
        }
        else {
            front = str;
        }
        return front + front + front;
    }

}
