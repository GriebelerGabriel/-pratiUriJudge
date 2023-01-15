import java.util.Scanner;

public class MoonPhases{
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        int twoDays = input.nextInt();
        int dayBefore = input.nextInt();
        
        if(twoDays<dayBefore){
            if((0 <= dayBefore) && (dayBefore <= 2)){
                System.out.printf("Nova");
            }
            else if((3 <= dayBefore) && (dayBefore <= 96)){
                System.out.printf("Crescente");
            }
            else if((97 <= dayBefore) && (dayBefore <= 100)){
                System.out.printf("Cheia");
            }
        }
        else{
            if((100 >= dayBefore) && (dayBefore >= 97)){
                System.out.printf("Cheia");
            }
            else if((96 >= dayBefore) && (dayBefore >= 0)){
                System.out.printf("Minguante");
            }
            
        }
    }
}