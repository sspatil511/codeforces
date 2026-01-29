import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class OddQueries_1807D {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            long[] nums = new long[n];
            long totalSum = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                nums[i] = Long.parseLong(st.nextToken());
                totalSum += nums[i];
            }

            
            long[] prefix = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                prefix[i] = prefix[i - 1] + nums[i - 1];
            }

           
            while (q-- > 0) {

                st = new StringTokenizer(br.readLine());
                int l = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                long k = Long.parseLong(st.nextToken());

                long removedSum = prefix[r] - prefix[l - 1];
                long newSum = totalSum - removedSum + (r - l + 1) * k;

                out.append((newSum & 1) == 1 ? "YES\n" : "NO\n");
            }
        }

        System.out.print(out.toString());
        br.close();
    }
}