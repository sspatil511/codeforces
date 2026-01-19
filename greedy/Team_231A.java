import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Team_231A {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int totalProblems = 0;

        for(int i = 0; i < n; i++) {

            String line = reader.readLine();

            if((line.charAt(0) == '1' ? 1 : 0) +
               (line.charAt(2) == '1' ? 1 : 0) +
               (line.charAt(4) == '1' ? 1 : 0) >= 2) {

                totalProblems++;
            }
        }

        System.out.println(totalProblems);
        reader.close();
    }
}
