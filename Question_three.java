public class Question_three {
    public static void main (String[] args)
    {
        String jam = args[0];
        String statusJam = args[1];
        
        // Validasikan format jam dan statusnya
        if((jam.charAt(2) == ':') && (jam.charAt(5) == ':') && ((statusJam.equals("AM")) || (statusJam.equals("PM")))){
            System.out.println("Format true!");
            int a=Integer.parseInt(String.valueOf(jam.charAt(0)));  
            int b=Integer.parseInt(String.valueOf(jam.charAt(1)));  
            int c = 10*a + b;

            int d=Integer.parseInt(String.valueOf(jam.charAt(3)));  
            int e=Integer.parseInt(String.valueOf(jam.charAt(4)));  
            int f = 10*d + e;
            System.out.println(f);
            if(c == 12 && statusJam.equals("AM")){
                if(f < 10){
                    System.out.println("00:0" + String.valueOf(f));
                } else{
                    System.out.println("00:" + String.valueOf(f));
                }
            } else{
                if(f < 10){
                    if(c<10){
                        System.out.println("0" + String.valueOf(c) + ":0" + String.valueOf(f));
                    } else{
                        System.out.println(String.valueOf(c) + ":0" + String.valueOf(f));
                    }
                } else{
                    if(c<10){
                        System.out.println("0" + String.valueOf(c) + ":" + String.valueOf(f));
                    } else{
                        System.out.println(String.valueOf(c) + ":" + String.valueOf(f));
                    }
                }
            }
        } else{
            System.out.println("Format wrong!");
        }
        
    }
}
