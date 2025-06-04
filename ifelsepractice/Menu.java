import java.util.*;
class Menu
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("HII,HOW CAN I HELP YOU?");
        System.out.print(" please enter a option:");
        int a=sc.nextInt();
        if(a==1)
        {
            System.out.println(" DO TASK ONE");
        }
        else if(a==2)
        {
           System.out.println("DO TASK TWO");

        }
        else
        {
            System.out.println("INVALID OPTION");
        }
    }
}