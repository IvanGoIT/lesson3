import java.util.Scanner;
public class ExampleBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            try {
                System.out.println("Введите число");
                int i = sc.nextInt();
                sc.nextLine();
                break;
            } catch (Exception e) {
                sc.nextLine();
            }
        }
    }
}
