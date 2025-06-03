import java.util.*;
class Grade
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your  mark:");
        int m=sc.nextInt();
        if(m>=90 && m<=100)
        {
            System.out.print("A GRADE");
        }
        else if(m>=75 && m<=89)
        {
             System.out.print("B GRADE");

        }
         else if(m>=60 && m<=74)
        {
             System.out.print("C GRADE");

        }
        else if(m>=40 && m<=59)
        {
             System.out.print("C GRADE");

        }
        else
        {
            System.out.print("FAIL!");

        }
    }
}