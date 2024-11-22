import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int cnum=num;
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum+=fact(digit);
            num/=10;
        }
        if(cnum==sum){
            System.out.println("Strong number");
        }
        else {
            System.out.println("not strong number");
        }


    }
    public static int fact(int num){
        if(num==1||num==0) return 1;
        return num*fact(num-1);
    }
}
