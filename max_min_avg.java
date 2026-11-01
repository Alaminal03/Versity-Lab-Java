import java.util.Scanner;

public class max_min_avg 
 {

     public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max = sc.nextInt();
        int min = max;
        int sum = max;
        for (int i = 1; i < n; i++) 
        {
            int a = sc.nextInt();
            if (a >= max)
                max = a;

            if (a <= min)
                min = a;

            sum += a;
        }

        double d = (double) sum / n;

        System.out.println("Maximum " + max);
        System.out.println("Minimum " + min);
        System.out.println("Average is " + d);


        sc.close();
    }
    
   
}