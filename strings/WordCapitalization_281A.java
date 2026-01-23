
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class WordCapitalization_281A {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int firstChar = (int) word.charAt(0);

        if(firstChar >= 97 && firstChar <= 122) {
            char capitalizedChar = (char) (firstChar - 32);
            String capitalizedWord = capitalizedChar + word.substring(1);
            System.out.println(capitalizedWord);
        } else {
            System.out.println(word);
        }

    }
}
