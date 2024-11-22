import java.util.Scanner;

public class GreatestOfTwo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2= input.nextInt();
        if(num1>num2){
             System.out.println("biggest num "+num1);
        }
        else{
            System.out.println("biggest num "+num2);
        }
    }
}
