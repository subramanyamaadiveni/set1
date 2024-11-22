import java.util.Scanner;

public class PostiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        if(num>0){
            System.out.println("postive");
        }
        else {
            System.out.println("negative");
        }
    }
}
