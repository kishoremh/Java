import java.util.Scanner;
class Program28
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        int lastdigit=num%10;
        while(num>9)
        {
            num=num/10;
        }
        int total=num+lastdigit;
        System.out.println("total:"+total);
    }
}