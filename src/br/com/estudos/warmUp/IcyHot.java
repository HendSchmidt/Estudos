package br.com.estudos.warmUp;

/*
Given two temperatures, return true if one is less than 0 and the other is greater than 100.

icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
* */
public class IcyHot {
    public static boolean icyHot(int temp1, int temp2) {
        if(temp1 < 0){
            if(temp1 < 0 && temp2 > 100){
                return true;
            }
        }else if (temp1 > 100 && temp2 < 0){
            return true;
        }

        return false;
    }

    public static boolean icyHotBill(int temp1, int temp2) {
        boolean first = (temp1<0 && temp2>100);
        boolean second = (temp2<0 && temp1>100);
        return first || second;
        //return (temp1<0 && temp2>100) || (temp2<0 && temp1>100) ;
    }

    public static boolean icyHotSolution(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        } else {
            return false;
        }
        // Could be written as: return ((temp1 < 0 && ...));
    }
}
