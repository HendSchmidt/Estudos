package br.com.estudos.warmUp;

/*
* Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.

posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
* */
public class PosNeg {
    public static  boolean posNeg(int a, int b, boolean negative) {

        if((a > 0 && b > 0) && !negative){
            return false;
        }else if((a > 0 || b > 0) && !negative){
            return true;
        }else return (a < 0 && b < 0) && negative;
    }


    public static boolean posNegSolution(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

}
