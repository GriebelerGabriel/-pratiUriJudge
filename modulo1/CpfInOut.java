import java.util.*;

public class CpfInOut{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String cpf = input.nextLine();
        String[] splitedCPF = cpf.split("[.-]+");

        for (int c=0; c<4; c++){
            System.out.printf("%s\n", splitedCPF[c]);
        } 
        
    }
}