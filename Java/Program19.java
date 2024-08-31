import java.util.Scanner;
class Program17
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int fact=1;
        int sum=0;
        int lastdigit=0;
        int a=num;
        while(num>0)
        {
            lastdigit=num%10;
            for(int i=1;i<=num;i++)
            {
                fact=fact*i;
                sum=sum+fact;
            }
            System.out.print("Factorial: "+fact);
            num=num/10;
        }
        if(a==sum)
        {
            System.out.println("Strong");
        }
        else
        {
            System.out.println("no");
        }

    }
}