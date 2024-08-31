import java.util.Scanner;
class Program12
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int a=sc.nextInt();
        int count=0;
        int sum=0;
        int product=1;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                count++;
                System.out.print(i+" ");
                sum+=i;
                product*=i;
            }
        }
        System.out.println();
        System.out.println("Count:"+count);
        System.out.println("Sum:"+sum);
        System.out.println("Product:"+product);
    }
}