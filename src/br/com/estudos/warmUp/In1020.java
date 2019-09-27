package br.com.estudos.warmUp;
/*
* Given 2 int values, return true if either of them is in the range 10..20 inclusive.

in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
* */
public class In1020 {
    public static boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

    public static boolean in1020Bill(int a, int b) {
        boolean rangeA = (a >= 10 && a <= 20);
        boolean rangeB = (b >= 10 && b <= 20);
        return rangeA || rangeB;
        // return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }
}
