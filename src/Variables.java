public class Variables {
    static Integer a=20;
    static Integer b=30;
    static int c=10;
    static int d=20;


    public void m1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Variables.c);
        System.out.println(Variables.d);
    }
    public static void m2(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Variables.c);
        System.out.println(Variables.d);
    }
    public static void main(String[] args) {
        Variables v=new Variables();
        v.m1();
        v.m2();

    }
}
