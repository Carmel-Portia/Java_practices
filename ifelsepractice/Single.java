import java.util.*;
class Single
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int a=sc.nextInt();
        if(a<10)
        {
            System.out.print( a +" is a single digit number");
        }
        else if(a>=10 && a<100)
        {
            System.out.print( a +" is a double digit number");

        }
        else if(a>=100)
        {
        System.out.print( a +" is a three dtigit number");
 
        }
    }
}