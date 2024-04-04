import java.util.Scanner;

public class TestCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Loop through each test case
        for (int i = 0; i < T; i++) {
            // Read N, M, K, X for each test case
            long N = scanner.nextLong();
            long M = scanner.nextLong();
            long K = scanner.nextLong();
            long X = scanner.nextLong();

            // Calculate remaining distance after traveling M kms
            long remainingDistance = N - M;

            // Calculate the number of litres of petrol required
            long litresRequired = (remainingDistance + X - 1) / X;

            System.out.println(litresRequired);
        }

        scanner.close();
    }
}
