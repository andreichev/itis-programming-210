package ru.itis.functional.example1;

public class Main {
    public static void main(String[] args) {
        Logger logger = (x) -> System.out.println("ANONIMUS CLASS " + x);
        logger.print(10);
        logger.print(11);


        A a = new A() {
            private int x;
            @Override
            public void func1() {
                x++;
            }

            @Override
            public int func2() {
                return x;
            }
        };

        Filter filter1 = x -> x % 2 == 0;
        Filter filter2 = x -> x > 20;

        int[] x = {1, 43, 5, 21, 40, 33, 22, 11};
        for (int j : x) {
            if (filter1.decide(j)) {
                System.out.println(j);
            }
        }
    }
}