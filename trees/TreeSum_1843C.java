

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TreeSum_1843C {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {

            long n = Long.parseLong(br.readLine());
            long sum = 0;

            while(n > 0) {

                sum += n;
                n >>= 1;
            }

            System.out.println(sum);
        }

        br.close();
        
    }
}
