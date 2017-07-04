public class ExampleWhile {
    public static void main(String[] args){
        int[] cars = new int[10];

        int index = 0;
        while(index < cars.length) {
            cars[index] = 10 + index;
            System.out.println(cars[index]);
            index++;
        }
    }
}
