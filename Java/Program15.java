import java.util.Scanner;
class Program15
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        int square=num*num;
        int sum=0;
        int lastdigit=0;
        while(square>0)
        {
            lastdigit=square%10;
            sum+=lastdigit;
            square=square/10;
        }
        if(sum==num)
        {
            System.out.println("Neon");
        }
        else
        {
            System.out.println("Not Neon");
        }
    }
}