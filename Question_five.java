public class Question_five {

    public static boolean palindromeCheck (String arg){
        int i = 0, j = arg.length() - 1;

        while (i < j) {
            String buffOne = String.valueOf(arg.charAt(i));
            String buffTwo = String.valueOf(arg.charAt(j));
 
            if (!buffOne.equals(buffTwo))
                return false;
            i++;
            j--;
        }
 
        return true;
    }
    public static void main (String[] args)
    {
        String m = "";
        for(String word : args){
            m += word;
            m += " ";
        }
        m = m.substring(0, m.length()-1);
        System.out.println(m);
        if(palindromeCheck(m) == true){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}
