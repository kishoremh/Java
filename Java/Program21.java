import java.util.Scanner;
class Program21
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        String reg="Not a Duck Number";
        int lastdigit=0;
        while(num>0)
        {
            lastdigit=num%10;
            if(lastdigit==0)
            {
                reg="Duck Number";
            }
            num=num/10;
        }
        System.out.println(reg);
    }
}