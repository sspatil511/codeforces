import java.util.Scanner;

public class Watermelon_4A {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int weight = scanner.nextInt();

        if((weight & 1) == 0 && weight > 2) {

            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        scanner.close();
    }
}
