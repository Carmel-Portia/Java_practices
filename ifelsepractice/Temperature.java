import java.util.*;
class Temperature
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter temmperature:");
        int a=sc.nextInt();
        if(a>=40)
        {
            System.out.print( "  VERY HOT");
        }
        else if(a>=30 && a<40)
        {
            System.out.print( " HOT");

        }
        else
        {
        System.out.print( "COLD");
 
        }
    }
}