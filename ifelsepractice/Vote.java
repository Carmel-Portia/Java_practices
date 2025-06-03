import java.util.*;
class Vote
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your age:");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.print("is eligible for vote!");
        }
        else
        {
            System.out.print("not eligible for vote!");

        }
    }
}