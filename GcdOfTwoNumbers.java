import java.sql.SQLOutput;
import java.util.Scanner;

public class GcdOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();

        while (b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        System.out.println(a);
    }
}
