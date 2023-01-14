import java.util.Scanner;

public class medianProblem{
    public static void main(String args[]){
        
        int a,b,c = 0, dif;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        if(a>b){
            dif = a-b;
            c = b-dif;
            System.out.printf("%d", c);
        };
        if(a<b){
            dif = b-a;
            c = a-dif;
            System.out.printf("%d", c);
        };
        if(a == b){
           System.out.printf("%d", c); 
        }
        
        
    }
}