import java.util.Scanner;

public class compare {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n>m)
        {
            System.out.println("First is greater");
        }
        else if(m>n)
        {
            System.out.println("Second is greater");
        }
        else
        {
            System.out.println("Both ara Equal");
        }
    }
    
}
