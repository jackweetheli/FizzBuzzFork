public class test {
    public static void main(String[] args) {
        int i = 1;
        while (i < 100) {

            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        boolean d3 = i % 3 == 0;
        boolean d5 = i % 5 == 0;

        if (d3 && d5) {
            System.out.println("FizzBuzz");
        } else if (d3) {
            System.out.println("Fizz");
        } else if (d5) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }

        i++;
        return i;
    }
}
