import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Hulk_705A {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 1) {
                result.append("I hate");
            } else {
                result.append("I love");
            }

            if (i < n) {
                result.append(" that ");
            } else {
                result.append(" it");
            }
        }

        System.out.println(result);
    }
}
