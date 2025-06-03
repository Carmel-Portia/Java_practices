import java.util.*;
class driving
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your age:");
        int age=sc.nextInt();
        
        if(age>0)
        {   
        if(age>=18)
        {
            System.out.print("you can apply for driving test!");
        }
        else
        {
            System.out.print("not eligible to aplly for driving test!");

        }
        }
    }
}