import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a octal number:"); 
        String oct=sc.next();
        int decimal=Integer.parseInt(oct,8);
        System.out.println(" Decimal value "+decimal);
    }
}
