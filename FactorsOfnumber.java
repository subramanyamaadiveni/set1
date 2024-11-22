import java.util.ArrayList;
import java.util.Scanner;

public class FactorsOfnumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i <=num ; i++) {
            if(num%i==0){
                list.add(i);
            }

        }
        System.out.println(list);
    }
}
