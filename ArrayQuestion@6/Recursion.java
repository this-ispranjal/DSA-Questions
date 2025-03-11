public class Recursion {
//    static int sum= 0;
    static int f( /*int i,*/ int n) {
//         tyr//
    if(n<0)
        System.out.println(n);

    return f(n-1);

//        here we have done with single parameter
//        if (n == 1)
//            return 1;
//
////      return n + f(n-1);
//
//      return n * f(n-1); //  this is for factorial program

        // here we have done with single sorry double  parameter
//        if (i <1) {
//            System.out.print(sum);
//            return;   // this is baseline to stop the function
//        }
//        f(i - 1, sum+i);

    }

    public static void main(String[] args) {
//        f(8);
        System.out.println(f(7));
    }
}
