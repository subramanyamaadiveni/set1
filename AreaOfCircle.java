import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int radius= input.nextInt();
        float pie=3.14f;
        float Area=pie*radius*radius;
        System.out.println("Area of circle: "+Area);
    }
}
