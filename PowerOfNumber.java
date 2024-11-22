import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int base= input.nextInt();
        int exp= input.nextInt();

        double power=Math.pow(base,exp);
        System.out.println(power);
    }
}
