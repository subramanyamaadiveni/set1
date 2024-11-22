import java.util.Scanner;

public class AddToFractions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1=2; //input.nextInt();
        int d1= 3;//input.nextInt();
        int n2=3; //input.nextInt();
        int d2= 5;//input.nextInt();
        int lcd=lcm(d1,d2);
        int add1=n1*(lcd/d1);
        int add2=n2*(lcd/d2);
        int result=add1+add2;
        double ans=result/lcd;
        System.out.println(ans);

        System.out.println(result+"/"+lcd);
    }
    public static int gcd(int a,int b){
        while ((b!=0)){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    public static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
}
