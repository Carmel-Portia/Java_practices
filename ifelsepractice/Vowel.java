import java.util.*;
class Vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a letter:");
        char l=sc.nextLine().charAt(0);
        if(l=='a'|| l=='e'|| l=='i'|| l=='o'||l=='u'||l=='A'|| l=='E'|| l=='I'|| l=='O'||l=='U')
        {
            System.out.print( l+" the letter is vowel!");
        }
        else
        {
            System.out.print(l+" the letter is consonat!");
        }
    }
}