import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Starting");
        System.out.println("--------------------------------");
        System.out.println("~~~~~menu~~~~~");
        System.out.println("Chọn lựa:");
        System.out.println("1 : Kéo ");
        System.out.println("2 : Búa ");
        System.out.println("3 : Bao ");

        int choose;
        do {
            System.out.print("Lựa chọn của bạn (1, 2, 3): ");
            choose = sc.nextInt();
        } while (choose < 1 || choose > 3);
        String[] choices = {"Kéo", "Búa", "Bao"};
        int random = rand.nextInt(3);
        String computerChoice = choices[random];
        System.out.println("Đối thủ ra: " + computerChoice);
        if (choose == random + 1) {
            System.out.println("Hòa!");
        } else if ((choose == 1 && random == 1) ||
                (choose == 2 && random == 2) ||
                (choose == 3 && random == 0)) {
            System.out.println("Bạn thua!");
        } else {
            System.out.println("Bạn thắng!");
        }
    }
}
