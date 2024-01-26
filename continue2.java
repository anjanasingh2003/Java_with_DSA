import java.util.Scanner;

public class continue2
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;  i<=n; i++)
        {
           if(n%10==0)
           {
            continue;
           }
           System.out.println("number was:"+n);
        }
    }
}
