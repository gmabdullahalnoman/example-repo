import java.util.Scanner;

public class MissingNumber {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long expectedSum = n* (n-1) /2;

        long actualSum = 0;
        for (int i =1 ; i<n-1; i++){
            actualSum += sc.nextLong();
        }
        System.out.println(expectedSum - actualSum);
    }
}