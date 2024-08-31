import java.util.Scanner;
class Program26
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        int lastdigit=0;
        int rev=0;
        int temp=num;
        while(num>0)
        {
            lastdigit=num%10;
            rev=rev*10+lastdigit;
            num=num/10;
        }
        System.out.println(rev);
        if(temp==rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}