import java.util.Scanner;
public class Q9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String hex=sc.next();
        int decimal=Integer.parseInt(hex,16);
        System.out.println(decimal);
    }
}