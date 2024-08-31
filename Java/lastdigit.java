import java.util.Scanner;
class lastdigit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        lastdigit(num);
    }
    public static void lastdigit(int a)
    {
        int res=a%10;
        System.out.println("Remainder:"+ res);
    }
    
}