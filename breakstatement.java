import java.util.Scanner;

public class breakstatement
 {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            if(i==5)
            {
                break;
            }
            System.out.println(i);
        }
System.out.println("i am out of the loop");
    }
}
