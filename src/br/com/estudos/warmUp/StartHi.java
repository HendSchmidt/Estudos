package br.com.estudos.warmUp;
/*
Given a string, return true if the string starts with "hi" and false otherwise.

startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
* */
public class StartHi {
    public static boolean startHi(String str) {
        if(str.length() < 2 ){
            return false;
        }else if(str.substring(0,2).equals("hi")){
            return true;
        }
        return false;
    }

    public static boolean startHiBill(String str) {
        if(str.length()<2){
            return str.equals("hi");
        } else {
            return str.substring(0,2).equals("hi");
        }
        // return (str.length()<2)?(str.equals("hi")):(str.substring(0,2).equals("hi"));
    }

    public static boolean startHiSolution(String str) {
        // First test if the string is not at least length 2
        // (so the substring() below does not go past the end).
        if (str.length() < 2) return false;

        // Pull out the string of the first two chars
        String firstTwo = str.substring(0, 2);

        // Test if it is equal to "hi"
        if (firstTwo.equals("hi")) {
            return true;
        } else {
            return false;
        }
        // This last part can be shortened to: return(firstTwo.equals("hi"));
    }

}
