import java.util.Scanner;
class Digits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        int lastdigit;
        int sum=0;
        int product=1;
        while(num>0)
        {
            lastdigit=num%10;
            sum=sum+lastdigit;
            product=product*lastdigit;
            num=num/10;
        }
        System.out.println("Sum= " + sum);
        System.out.println("Product= " + product);
    }
}