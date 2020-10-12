package Problemas;

import java.util.Random;
import java.util.Scanner;

/* Your job is to find the seed between A and B (both inclusively) that produces N pseudorandom numbers from 0 (inclusive) to K (exclusive). It should also have the maximum of these N numbers to be the minimum among all maximums of other seeds in this range.

Sounds complicated? Take a look at the example.

Here we have A = 7, B = 9, N = 4, K = 100. Let's suppose:

For the seed 7, we get sequence 45, 99, 23, 67 – the maximum is 99.
For the seed 8, we get 64, 34, 23, 9 – the maximum is 64.
For the seed 9, we get 78, 34, 0, 11 – the maximum is 78.
Then the minimum among these maximums is 64. That means, in this example, the seed we are looking for is 8.

The input contains numbers A, B, N, K in a single line in this order.

Your task is to output 2 numbers: a seed and it's maximum. If there are some seeds with equal minimal maximums, you should output the seed that is less than all other seeds. */

public class P25_Seed_Random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();
        int num;
        int seed = 0;
        int max = 0;
        int min = k;
        for (int i = a; i <= b; i++) {
            Random random = new Random(i);
            for (int j = 0; j < n; j++) {
                num = random.nextInt(k);
                if (num > max) {
                    max = num;
                }
            }
            if (max < min) {
                seed = i;
                min = max;
            }
            max = 0;
        }
        System.out.println(seed + "\n" + min);
    }
}
