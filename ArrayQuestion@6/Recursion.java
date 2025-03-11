public class Recursion {

    static void f(int i, int n) {
        if (i > n)
            return;   // this is baseline to stop the function
        f(i + 1, n);
        System.out.println(i);


    }

    public static void main(String[] args) {
        f(1, 4);
    }
}
