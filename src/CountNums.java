public class CountNums {
    public static void main(String[] args) {
        int n = 455533;

        int count = 0;

        while (n > 0) {
            int remainder = n % 10;

            if (remainder == 4) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
