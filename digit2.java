import java.util.Scanner;

public class digit2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (temp > 0)
        {
            temp = temp / 10;
            count++;
        }
        int power = (int) Math.pow(10, count - 1);
        
        while (power>0)
        {
            int digit = n / power;
            System.out.print(digit + " ");
            n = n % power;
            power = power / 10;
        }
        System.out.println();

        sc.close();


    }
}
