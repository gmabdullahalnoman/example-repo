import java.util.Scanner;
public class Repetition {
    public static void Main(String args[]){
        Scanner input = new Scanner(System.in);
        String dna = input.nextLine();
        int maxCount = 1;
        int currentCount = 1;
        
        for (int i=1; i< dna.length(); i++){
            if(dna.charAt(i)==dna.charAt(i-1)){
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            }else{
                currentCount = 1;
            }
        }
        System.out.println(maxCount);
    }
}