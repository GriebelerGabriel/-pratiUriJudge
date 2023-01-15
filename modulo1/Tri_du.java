import java.util.Scanner;

public class Tri_du{
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        
        if(A == B){
            System.out.printf("%d", A);
        }
        else if(A>B){
            System.out.printf("%d", A);
        }
        else if(A<B){
            System.out.printf("%d", B);
        }
    }
}