package homeWork.homeWork7;

public class Exe2 {
    public static void main(String[] args) {
        String s = "HELLO WORLD";
        char needToReplaceSymbol  = s.charAt(3);
        char replaceSymbol = s.charAt(0);
        char[] sChars = s.toCharArray();
        for (int i = 0; i < sChars.length;i++){
            if(sChars[i] == needToReplaceSymbol){
                sChars[i] = replaceSymbol;
            }
        }
        s = String.valueOf(sChars);
        System.out.println(s);
    }
}
