import java.util.Scanner;
class Program29
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        int lastdigit=num%10;
        num=num/10;
        while(num>9)
        {
            int digit=num%10;
            sum+=digit;
            num=num/10;
        }
        int total=num+lastdigit;
        if(total==sum)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
    }
}