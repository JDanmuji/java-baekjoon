import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int count = 0;
        for(int i = 1; i <= num; i++) {
            count+=i;
        }

        System.out.println(count);
    }
}