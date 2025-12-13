import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /*if((n & ( n - 1 ))==0){
        System.out.println("True");
        }
    else{
        System.out.println("False");*/
        System.out.println(n>0 && (n&(n-1))==0);
    }
}
