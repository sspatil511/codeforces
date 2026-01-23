

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class BoyOrGirl_236A {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String username = br.readLine();
        int[] alphabets = new int[26];

        for(char c : username.toCharArray()) {

            alphabets[c - 'a'] += 1;
        }

        int distinctCount = 0;

        for(int i : alphabets) {

            if(i > 0) {
                distinctCount += 1;
            }
        }

        if((distinctCount & 1) == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        br.close();
    }

}
