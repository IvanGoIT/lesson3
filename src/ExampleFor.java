public class ExampleFor {
    public static void main(String[] args) {
        int[] cars = new int[10];

        for(int index = 0; index < cars.length; index++) {
            cars[index] = 10 + index;
            System.out.println(cars[index]);
        }
    }
}
