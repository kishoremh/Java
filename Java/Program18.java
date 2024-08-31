import java.util.Scanner;
class Program18
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        int fact=1;
        int oddfact=1;
        int evenfact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        
            if(i%2==0)
            {
                evenfact=evenfact*i;
            }
            else
            {
                oddfact=oddfact*i;
            }
        
        }
        System.out.println(oddfact);
    }
}