import java.util.*;
class NestedEven
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int a=sc.nextInt();
        if(a>0)
        {
        if(a%2==0)
        {
            System.out.print(a +" the number is even!");
        }
        else
        {
           System.out.print(a +" the number is odd!");

        }
        }
        else
        {
            System.out.print(a + "unknown number");

        }
      
    }
}