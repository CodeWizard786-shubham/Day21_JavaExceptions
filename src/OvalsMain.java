import java.util.Scanner;

public class OvalsMain {
    void ovals(char ch){
        switch(ch){
            case 'a':
                System.out.println("It is a oval");
                break;
            case 'e':
                System.out.println("It is a oval");
                break;
            case 'i':
                System.out.println("It is a oval");
                break;
            case 'o':
                System.out.println("It is a oval");
                break;
            case 'u':
                System.out.println("It is a oval");
                break;
            default:
                System.out.println("Not a oval");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch=sc.next().charAt(0);
        OvalsMain o=new OvalsMain();
        o.ovals(ch);
            }
}
