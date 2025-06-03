import java.util.*;
class Leap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the year:");
        int year=sc.nextInt();
        if(year%4==0)
        {
            System.out.print(year +" ia a leap year");
        }
        else
        {
             System.out.print(year +" is  not a leap year");

        }
    }
}