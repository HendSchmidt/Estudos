package br.com.estudos.warmUp;
/*
* Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
* */
public class MixStart {
    public static boolean mixStart(String str) {
        return (str.length() >= 3 &&  str.substring(1,3).equals("ix"));
    }

    public static boolean mixStartSolution(String str) {
        // Check if string is too small
        // (so substring() below does not go off the end)
        if (str.length() < 3) return false;

        // Pull out length 2 string for the "ix" part
        // (i.e. substring starting at index 1 and stopping just before 3).
        String two = str.substring(1, 3);

        if (two.equals("ix")) {
            return true;
        } else {
            return false;
        }
        // This last part can be shortened to just:
        // return(two.equals("ix"));
    }

    public static boolean mixStartBill(String str) {
        if((str.length()>=0 && str.length()<3)) return false;
        return  (str.substring(1,3).equals("ix"));
    }
}
