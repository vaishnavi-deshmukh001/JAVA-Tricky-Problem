import java.util.Scanner;

public class even_odd4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        //find even or odd using module operator
        if(n%2 == 0){
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }
    }
}
