class Question_one
{
    public static void main (String[] args)
    {
        int temp = Integer.valueOf(args[0]);

        if(temp%15 == 0){
            System.out.println("Hello World");
        }
        else if(temp%3 == 0){
            System.out.println("Hello");
        }
        else if(temp%5 == 0){
            System.out.println("World");
        }
    }
}