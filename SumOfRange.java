import java.util.Scanner;

public class SumOfRange {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int first= input.nextInt();
        int end= input.nextInt();
        int sum=0;
        for (int i = first; i <=end ; i++) {
            sum+=i;
        }
        System.out.println("Sum of Range: "+sum);
    }
}
