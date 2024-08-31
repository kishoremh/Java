import java.util.Scanner;
class Program20
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            sum=a+b;
            System.out.print(a+"+");
            a=b;
            b=sum;
            
        }
        
    }
}