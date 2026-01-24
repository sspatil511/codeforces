
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Football_96A {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int count = 1;
        char currPlayer = s.charAt(0);
        
        for(int i = 1; i < s.length(); i++) {

            if(s.charAt(i) == currPlayer) {

                count += 1;

                if(count == 7) {
                    System.out.println("YES");
                    return;
                } 
            }
            else{

                currPlayer = s.charAt(i);
                count = 1;
            }
        }

        System.out.println("NO");

        br.close();
    }

}
