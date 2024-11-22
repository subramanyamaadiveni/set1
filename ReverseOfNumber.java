import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        int rev=0;
        while (num!=0){
            int digit=num%10;
            rev=digit+rev*10;
            num/=10;
        }
        System.out.println(rev);
    }
}
