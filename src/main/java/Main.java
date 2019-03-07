public class Main {
    public static void main(String[] args) {

        int[] sales = {12_000, 8_000, 15_000, 8_000};
        int bonus = 0;
        int limit = 10_000;
        for (int sale : sales) {
            if (sale > limit) {
                bonus += (sale - limit) * 5 / 100;
            }
        }
        System.out.println(bonus);


    }
}

