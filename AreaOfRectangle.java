import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float len= input.nextFloat();
        float b= input.nextFloat();
        float Area=len*b;
        System.out.println("AreaOfRectangle "+Area);
    }
}
