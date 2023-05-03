import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        String sentence = "welcome to Bridgelabs";
        int[] array = new int[sentence.length()];
        char[] ch = sentence.toCharArray();
        for (int i = 0; i < sentence.length(); i++) {
            for (int j = i + 1; j < sentence.length(); j++) {
                    if (ch[i] == ch[j]) {

                        array[i]++;
                    }

            }
        }
        for (int i = 0; i < array.length; i++) {
            if (ch[i] != ' ' && ch[i] != '0') {
                System.out.println(ch[i] + " = " + array[i]);
            }
        }
    }
}
