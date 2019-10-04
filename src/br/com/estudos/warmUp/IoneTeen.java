package br.com.estudos.warmUp;

/*
* We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.

loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
* */

public class IoneTeen {
    public static boolean loneTeen(int a, int b) {
        boolean isTeenA = (a >= 13 && a <= 19);
        boolean isTeenB = (b >= 13 && b <= 19);

        return (isTeenA && !isTeenB) ||  (!isTeenA && isTeenB);
    }

    public static  boolean loneTeenBill(int a, int b) {
        boolean rangeA = (a >= 13 && a <= 19) ;
        boolean rangeB = (b >= 13 && b <= 19);
        return (rangeA || rangeB) && rangeA != rangeB;
    }

}
