import java.util.Scanner;
class Program9
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=sc.nextInt();
        int lastdigit=0;
        int even_sum=0;
        int even_product=1;
        int odd_sum=0;
        int odd_product=1;
        while(a>0)
        {
            lastdigit=a%10;
            if(lastdigit%2==0)
            {
                even_sum=even_sum+lastdigit;
                even_product=even_product*lastdigit;
            }
            else
            {
                odd_sum+=lastdigit;
                odd_product*=lastdigit;

            }
            a=a/10;
        }
        System.out.println();
        System.out.println("Even Sum: "+even_sum);
        System.out.println("Even Product: "+even_product);
        System.out.println("Odd Sum: "+odd_sum);
        System.out.println("Odd Product: "+odd_product);
    } 
}