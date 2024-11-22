public class LcmOfTwoNumbers {
    public static void main(String[] args) {
        int n1=10;
        int n2=3;
        System.out.println(lcm(n1,n2));

    }
    public static int gcd(int a, int b){
        while(b!=0){
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
