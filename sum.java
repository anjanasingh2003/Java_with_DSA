import java.util.Scanner;

public class sum{

  int a;
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
       int  a= sc.nextInt();
        int  b= sc.nextInt();
        int sum=a+b;
       
       System.out.println(sum);

       int mul=a*b;
       System.out.println(mul);

      int sub=a-b;
      System.out.println(sub);
    }
}