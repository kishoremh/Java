import java.util.Scanner;
class count
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        int lastdigit=0;
        int count=0;
        while(num>0)
        {
            lastdigit=num%10;
            count++;
            num=num/10;
        }
        System.out.println("Number of Digits:"+ count);
    }
}