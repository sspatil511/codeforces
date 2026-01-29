import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EasyHard_1030A {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '1') {
                System.out.println("HARD");
                br.close();
                return;
            }
        }

        System.out.println("EASY");

        br.close();
    }

}
