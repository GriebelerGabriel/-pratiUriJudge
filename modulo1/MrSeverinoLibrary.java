import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MrSeverinoLibrary{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        ArrayList<String> listBooks = new ArrayList<String>();
        int books = input.nextInt();
        input.nextLine();
        
        for(int count = 0; books>count; count++){
            listBooks.add(input.nextLine());
        }
        Collections.sort(listBooks);
        for(int count = 0; books>count; count++){
            System.out.printf("%s\n", listBooks.get(count));
        }
    }
}