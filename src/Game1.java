import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int t=0;
        int f=0;
        while(f<3){
        int num2=rand.nextInt(4)+2;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<num2; i++) {
            int num1= rand.nextInt(10)+1;
             list.add(num1);
        }
        int sum=0;
        for(int i=0; i<list.size(); i++) {
            sum+=list.get(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(" + ");
            }
        }
        System.out.print(" = ");

        int num3=sc.nextInt();

            if (num3 == sum) {
                t++;
            }
            else{
                System.out.println("Wrong! the answer is"+ sum);
                f++;
            }
        }
        System.out.println("you earned "+ t+"total points");
    }
}
