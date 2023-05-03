class AgeException extends Exception{
    public AgeException(String s){
        super(s);
    }
}
public class MyException{
    void ageChecker(int a) throws AgeException{
        if(a<18){
            throw new AgeException("Runtime Exception");
        }else{
            System.out.println("Eligible Age");
        }
    }

    public static void main(String[] args) {
        MyException e1=new MyException();
        try{
            e1.ageChecker(10);
            e1.ageChecker(20);

        }catch(AgeException e) {
            e.printStackTrace();
        }
        System.out.println("Handled");

        }
    }
