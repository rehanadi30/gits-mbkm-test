public class Question_two {
    public static boolean checkEmail (String arg){
        String temp = arg;
        int n = temp.length();
        if (!temp.contains("@")){
            return false;
        }
        int i = temp.indexOf("@");
        if(i > 20){
            return false;
        }
        String afterAtSymbol = temp.substring(i, n);
        int j = afterAtSymbol.indexOf(".");
        System.out.println(j);
        if(j == 1){
            return false;
        }
        String afterDom = afterAtSymbol.substring(j, afterAtSymbol.length());
        if(!(afterDom.equals(".co.id") || afterDom.equals(".id"))){
            return false;
        }
        System.out.println(afterDom);
        if(!(temp.endsWith(".id") || temp.endsWith(".co.id"))){
            return false;
        }
        return true;
    }
    public static void main (String[] args)
    {
        if(checkEmail(args[0])){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}
