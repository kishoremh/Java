import java.util.Scanner;
class sumpro
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        int lastdigit;
        int odd=0;
        int even=0;
        while (num>0)
        {
            lastdigit=num%10;
            if (lastdigit%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
            num=num/10;
        }
        System.out.println("The Number of Even Numbers are"+ even);
        System.out.println("The Number of Odd Numbers are"+ odd);
    }
}