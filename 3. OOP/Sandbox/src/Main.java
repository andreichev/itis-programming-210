public class Main {
    // . это опасный оператор
    // [] это тоже опасный оператор
    public static void main(String[] args) {
        int[] x = null;
        int[] y = null;
        x = new int[1];
        System.out.println(x.length);
        x[0] = 5;
        y = x;
        y[0] += 1;
        System.out.println(x[0]);
    }
}