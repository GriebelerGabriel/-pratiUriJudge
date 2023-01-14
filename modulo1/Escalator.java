import java.util.Scanner;

public class Escalator{
    public static void main(String args[]){
        int pessoas, activatedTime = 0, lastUsed = 0, usedTime = 0;
        Scanner input = new Scanner(System.in);
        pessoas = input.nextInt();

        if(pessoas > 0){
            
            for(int count = 0; pessoas > count; count++){
                activatedTime = input.nextInt();
                
                if(activatedTime == lastUsed){
                    usedTime += 10;
                    lastUsed += activatedTime+10;
                }
                
                else if(activatedTime > lastUsed){
                    usedTime += 10;
                    lastUsed += activatedTime+10;
                }
                
                else if(activatedTime < lastUsed){
                    usedTime += ((activatedTime+10) - lastUsed);
                    lastUsed = activatedTime+10;
                }
            }
            System.out.printf("%d", usedTime);
        }
        else{
            System.out.printf("%d", usedTime);
        }
    }
}