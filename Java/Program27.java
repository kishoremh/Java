import java.util.Scanner;

public class Program27 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while (temp > 0) 
        {
            temp /= 10;
            count++;
        }
        temp = num;
        int sum = 0;
        for (int i = 0; i < count; i++) 
        {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(" Armstrong number.");
        } else {
            System.out.println("not an Armstrong number.");
        }
    }
}
