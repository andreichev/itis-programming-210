package average;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            int x = scanner.nextInt();
            if(x == 0) {
                break;
            }
            sum += x;
            count++;
        }
        System.out.println(Math.round(sum / (double) count));
    }
}
