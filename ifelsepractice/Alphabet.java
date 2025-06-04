import java.util.*;
class Alphabet
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a letter:");
        char ch=sc.nextLine().charAt(0);
        char l =Character.toLowerCase(ch);
        if(l>='a' && l<='z')
        {
        if(l=='a'|| l=='e'|| l=='i'|| l=='o'||l=='u')
        {
            System.out.print( l+" the letter is vowel!");
        }
        else
        {
            System.out.print(l+" the letter is consonat!");
        }
        }
        else
        {
            System.out.print(l+" is a special Symbol!");
        }
    }
}