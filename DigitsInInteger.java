import java.util.Scanner;

public class DigitsInInteger {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num= input.nextInt();

        int count=0;
        while(num!=0){
            count+=1;
            num/=10;
        }
        System.out.println("count of given Integer: "+count);
    }
}
