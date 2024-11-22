import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num=input.nextInt();
        System.out.println(fact2(num));

    }
    static int fact(int num){
// using recursion
        if(num==1||num==0){
            return 1;
        }
        return num*fact(num-1);
    }
    static int fact2(int num){
        int sum=1;
        for (int i = 1; i <=num ; i++) {
            sum*=i;
        }
        return sum;
    }
}
