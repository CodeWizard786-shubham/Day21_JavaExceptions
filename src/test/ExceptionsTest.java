package test;

public class ExceptionsTest {
    public static void main(String[] args) {
        try {
            int a;
            int b = 2;
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
