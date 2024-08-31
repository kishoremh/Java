import java.util.Scanner;
class Program23
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int a=sc.nextInt();
        System.out.println("Enter a Number");
        int b=sc.nextInt();
        int c=0;
        System.out.println("====Before Swapping====");
        System.out.println("A===>"+a);
        System.out.println("B===>"+b);
        c=a;
        a=b;
        b=c;
        System.out.println("====After Swapping====");
        System.out.println("A===>"+a);
        System.out.println("B===>"+b);
    }
}