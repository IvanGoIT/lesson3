public class ExampleContinue {
    public static void main(String[] args) {
        int a = 0;
        while(a < 5) {
            a++;
            if (a == 3) {
                continue;
            }
            System.out.println("a = " + a);
        }
    }
}
