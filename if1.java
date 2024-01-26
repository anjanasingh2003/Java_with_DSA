public class if1 
{
    public static void main(String[] args)
     {
        
        int age=25;
        if(age>=18)
        {
           System.out.println("eligible to vote"); 
        }
        if(age>13 || age< 18)
        {
            System.out.println("teenagar");
        }
        else
        {
            System.out.println("not eligible to vote");
        }
    }
    
}