import java.util.*;
class Divisible
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=sc.nextInt();
        if(num%5==0)
        {
            System.out.print(num +" is divisible by 5");
        }
        else
        {
             System.out.print(num +" is  not divisible by 5");

        }
    }
}