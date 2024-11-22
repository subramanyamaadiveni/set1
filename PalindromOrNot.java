import java.util.Scanner;

public class PalindromOrNot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int n=num;
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum=sum*10+digit;
            n/=10;
        }
        if(sum==num){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("not Palindrom");
        }
    }
}
