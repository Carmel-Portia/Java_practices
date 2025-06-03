import java.util.*;
class Precentage
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your  mark:");
        int m=sc.nextInt();
        if(m>=80 && m<=100)
        {
            System.out.print("DISTINCTION");
        }
        else if(m>=60&& m<=79)
        {
             System.out.print("FIRST CLASS");

        }
         else if(m>=50 && m<60)
        {
             System.out.print("SECOND CLASS");

        }
        else if(m>=30 && m<50)
        {
             System.out.print("THIRD CLASS");

        }
        else
        {
            System.out.print("FAIL!");

        }
    }
}