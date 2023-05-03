public class Recursion {
    public static void a(int n) {
        if (n > 0) {
            System.out.println(n);
            a(n - 1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {

        a(10);
    }
        }
