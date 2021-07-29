public class Question_four {
    public static void main (String[] args)
    {
        String m = "";
        for(String word : args){
            m += word;
            m += " ";
        }
        if(m == null || m.equals("")){
            System.out.println(m);
        } else{
            int wordLength = m.length();
            char[] temp = new char[wordLength];
            for (int i = 0; i < wordLength; i++) {
                temp[wordLength - i - 1] = m.charAt(i);
            }
            String res = String.copyValueOf(temp);
            res = res.substring(1, wordLength);
            System.out.println(res);
        
        }
    }
}
