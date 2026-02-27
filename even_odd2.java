import java.util.Scanner;
public class even_odd2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        //find even or odd using n-2 approach
        while(n>1){
            n = n - 2;
        }
            if(n == 0){
                System.out.print("Even");
            } else {
                System.out.print("Odd");
            }
        

    }
}
