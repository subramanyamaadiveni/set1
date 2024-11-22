import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float base= input.nextFloat();
        float height= input.nextFloat();
        double Area=0.5*base*height;
        System.out.println("AreaofTrinagle "+ Area);
    }
}
