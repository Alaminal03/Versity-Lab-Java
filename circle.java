import java.util.Scanner;

public class circle {
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        
        double area = (double) Math.PI * Math.pow(r, 2);
        double cir = (double) 2 * Math.PI * r;

        System.out.println(area);
        System.out.println(cir);
    }
    
}
