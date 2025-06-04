import java.util.*;
class Vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a day:");
        String day=sc.nextLine();
        if(day.equalsIgnoreCase("saturday")||day.equalsIgnoreCase("sunday"))
        {
            System.out.print("it is a weekend!");

        }
        else
        {
            System.out.print("it is a week day!");

        }
        }
        }