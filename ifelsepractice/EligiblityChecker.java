import java.util.*;
class EligibilityChecker
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your age:");
        int age=sc.nextInt();
        sc.nextLine();
        String eye="yes";
        String written="yes";
        if(age>0)
        {
            if(age>=18 && age<=100)
            {
              System.out.println("HAVE YOU COMPLETED YOUR EYE TEST?");
               String etest=sc.nextLine();
               System.out.println("HAVE YOU COMPLETED YOUR WRITTEN TEST?");
               String wtest=sc.nextLine();
            if(eye.equalsIgnoreCase(etest) && written.equalsIgnoreCase(wtest))
            {
                 System.out.print("is eligible!");
            }
        else
        {
            System.out.print("not eligible!");

        }
    }
    else
    {
        System.out.print("not eligiblen due to age!");
    }
    
}
else
        {
           System.out.print("INVALID OUTPUT!");
        }
}
}