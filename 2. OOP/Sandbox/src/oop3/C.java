package oop3;

//         A     B     C
// func1   -     -     +
// func2   -     +     -
// func3   +     -     +

public class C extends B{
    @Override
    void func1() {
        System.out.println("FUNC 1 FROM C");
    }

    @Override
    void func3() {
        System.out.println("FUNC 3 FROM C");
    }
}
