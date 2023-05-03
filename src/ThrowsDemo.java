import java.lang.Exception;
class ThrowsDemo12 {
    void demoThrows() throws Exception {
        int a = 100 / 0;
        System.out.println(a);
        throw new ArithmeticException("Error");
    }
}

public class ThrowsDemo{
    public static void main(String[] args) {
        ThrowsDemo12 t = new ThrowsDemo12();
        try {
            t.demoThrows();
        } catch (Exception e){
        e.printStackTrace();
    }
        System.out.println("Handled");
    }

}
