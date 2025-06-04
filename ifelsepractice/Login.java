import java.util.*;
class Login
{
    public static void main(String args[])
    {
        String username="Carmel_portia";
        int pass=12345;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your name:");
        String name=sc.nextLine();
        if(username.equals(name))
        {
        System.out.print("enter your password:");
        int password=sc.nextInt();
        if(pass==password)
            {
                
                System.out.print("SUCCESSFULLY LOGINED!");
        }
        else
        {

            System.out.print("INVALID PASSWORD!");
        } 
        }
        else
        {
         System.out.print("INVALID USER NAME!");
         }    
    }
}