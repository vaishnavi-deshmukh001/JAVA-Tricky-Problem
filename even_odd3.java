import java.util.Scanner;

public class even_odd3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();

        if((n/2)*2 == n){
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }
    }
}
