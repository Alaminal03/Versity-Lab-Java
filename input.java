import java.util.Scanner;

public class input {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int sum = n + m;
        int product = n * m;
        int differ = n - m;

        System.out.println(sum);
        System.out.println(product);
        System.out.println(differ);
    }
}
