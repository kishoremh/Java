import java.util.Scanner;
class Program25
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int a=sc.nextInt();
        System.out.println("Enter a Number");
        int b=sc.nextInt();
        System.out.println("====Before Swapping====");
        System.out.println("A===>"+a);
        System.out.println("B===>"+b);
        a=(a+b);
        b=(a-b);
        a=(a-b);
        System.out.println("====After Swapping====");
        System.out.println("A===>"+a);
        System.out.println("B===>"+b);
    }
}