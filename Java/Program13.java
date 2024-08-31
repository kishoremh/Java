import java.util.Scanner;
class Program13
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        int lastdigit=0;
        int sum=0;
        int product=1;
        while(num>0)
        {
            lastdigit=num%10;
            sum+=lastdigit;
            product*=lastdigit;
            num=num/10;
        }
        if(sum==product)
        {
            System.out.println("Spy");
        }
        else
        {
            System.out.println("Not Spy");
        }
    }
}