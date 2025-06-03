import java.util.*;
class PositiveNegative
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int a=sc.nextInt();
        if(a>0)
        {
            System.out.print( a +"is apositive number");
        }
        else
        {
            System.out.print( a +" is a negative number");

        }
    }
}