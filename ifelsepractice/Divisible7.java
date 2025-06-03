import java.util.*;
class Divisible
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=sc.nextInt();
        if(num%7==0)
        {
            System.out.print(num +" is divisible by 7");
        }
        else
        {
             System.out.print(num +" is  not divisible by 7");

        }
    }
}