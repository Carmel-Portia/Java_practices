import java.util.*;
class Positivenegative2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int a=sc.nextInt();
        if(a>0)
        {
            System.out.print( a +" is a positive number");
        }
        else if(a<0)
        {
            System.out.print( a +" is a negative number");

        }
        else
        {
        System.out.print( a +" is zero");
 
        }
    }
}