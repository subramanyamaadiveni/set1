import java.util.Scanner;

public class AmstrongNumberOrNot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num=input.nextInt();
        int n1=num;
        int sum=0;
        int c=count(n1);
        while (n1!=0){
            int digit=n1%10;
            sum+=Math.pow(digit,c);
            n1/=10;
        }
        if(sum==num){
            System.out.println("amstrong number");

        }
        else{
            System.out.println("not amstrong ");
        }

    }
    public  static int count(int n){
        int sum=0;
        while(n!=0){
            sum++;
            n/=10;
        }
        return sum;
    }
}
