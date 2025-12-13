import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int First=n / 100;
        int Last= n%10;
        int sum= First+Last;
        System.out.println(sum);
    }
    
}