import java.util.Scanner;

public class truefalse {
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n%2==0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

        sc.close();
    }
}
