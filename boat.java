import java.util.Scanner;
public class boat 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int ans = (n/4)*4;

        System.out.println(ans);

        sc.close();
    }
}