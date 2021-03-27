public class FunctionVoid {
    public static void main(String[] args) {
        second(5);
        second(3);


    }

    public static void second(int number) {
        for (int i = 1; i < 11; i++) {
            System.out.println(number + "*" + i + "=" + number * i);

        }
    }
}
