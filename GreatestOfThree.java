import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if(num1>num2&&num1>num3){
            System.out.println("biggest num "+num1);
        } else if (num2>num1&&num2>num3) {
            System.out.println("biggest num "+num2);

        }
        else{
            System.out.println("biggest num "+num3);
        }
    }

}
