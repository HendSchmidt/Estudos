package br.com.estudos.warmUp;
/*
* Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
* */
public class StartOz {

    public static String startOz(String str) {
        String aux;
        if(str.length() >= 2 && str.substring(0,2).equals("oz")){
            return str.substring(0,2);
        }else if (str.length() >= 1){
            if(str.substring(0,1).equals("o")){
                return str.substring(0,1);
            }else if(str.substring(1,2).equals("z")){
                return str.substring(1,2);
            }
        }
        return str = "";
    }

    public static String startOzSolution(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }

        return result;
    }

    public static String startOzBill(String str) {
        String pos1;
        String pos2;

        if(str.length()>=2){
            pos1 = str.substring(0,1);
            pos2 = str.substring(1,2);

            if(pos1.equals("o")&&pos2.equals("z")){
                return "oz";
            }else if(pos1.equals("o")){
                return "o";
            }else if(pos2.equals("z")){
                return "z";
            }

        }else if(str.length()==1){
            pos1 = str;
            if(pos1.equals("o")){
                return "o";
            }else if(pos1.equals("z")){
                return "z";
            }
        }

        return "";
    }
}
