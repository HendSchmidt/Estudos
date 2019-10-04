package br.com.estudos.warmUp;
/*
* Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
* */
public class delDel {
    public static String delDel(String str) {
        String aux = "";
        if(str.length() > 3 && str.substring(1,4).equals("del")){
            aux = str.substring(0,1) + str.substring(4,str.length());
        }else {
            aux = str;
        }
        return aux;
    }

    public static String delDelSolution(String str) {
        if (str.length()>=4 && str.substring(1, 4).equals("del")) {
            // First char + rest of string starting at 4
            return str.substring(0, 1) + str.substring(4);
        }
        // Otherwise return the original string.
        return str;
    }

    public static String delDelBill(String str) {
        if(str.indexOf("del")!=1){
            return str;
        }
        return str.replace("del", "");
    }
}
