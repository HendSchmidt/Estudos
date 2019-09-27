package br.com.estudos.warmUp;
/*
* Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod

or35(3) → true
or35(10) → true
or35(8) → false
* */

public class Or35 {

    public  static boolean or35(int n) {
        return (!(n < 0) && (n % 3 ==0 || n % 5 == 0)) ? true : false;
    }

    public static boolean or35Bill(int n) {
        int third = n % 3;
        int fifith = n % 5;
        return n < 0 || third == 0 || fifith == 0;
    }

    public static boolean or35Solution(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }

    public  static boolean or35Optimized(int n) {
        return !(n < 0) && (n % 3 == 0 || n % 5 == 0);
    }
}
