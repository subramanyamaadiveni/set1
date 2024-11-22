import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num= input.nextInt();
        int sum=0;
        int n=num/2;
        for (int i = 1; i <=n; i++) {
            if(num%i==0){
                sum+=i;
            }
        }
        if(num==sum){
            System.out.println("Perfect number");
        }
        else {
            System.out.println("not perfect");
        }
    }
}
