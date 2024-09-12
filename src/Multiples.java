public class Multiples {
    public static void main(String[] args) {
        int i = 0;
        int x = 0;
        while (x < 1000){
            if (x % 3 == 0 || x % 5 == 0){
                i++;
            }
            x++;
        }
        System.out.println(i);
    }
}
