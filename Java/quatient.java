import java.util.Scanner;
class quatient
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        quatient(num);
    }
    public static void quatient(int a)
    {
        int rem=a/10;
        System.out.println("Quatient:"+ rem);
    }
}