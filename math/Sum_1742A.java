import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Sum_1742A {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {

            String[] str = br.readLine().split(" ");
            int[] nums = new int[3];

            for (int i = 0; i < 3; i++) {
                nums[i] = Integer.parseInt(str[i]);
            }

            Arrays.sort(nums);

            if (nums[0] + nums[1] == nums[2]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
