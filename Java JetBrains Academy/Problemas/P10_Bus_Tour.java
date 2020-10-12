package Problemas;

import java.util.Scanner;

/* A bus tour of Europe has been very successful. Due to an increase in the number of people that want to go on a tour, the tour company decided to increase the height of the bus. The new height of the bus is exactly N centimeters.

But the tour’s route runs under a lot of bridges, and there is a chance that the bus will crash into one of these bridges. Can you find out if this will happen?

The first line of the input contains the height of the bus and the number of bridges under which the bus passes. The second line contains the heights of these bridges.

You should output "Will not crash" if everything will be all right; otherwise, output "Will crash on bridge i" (where i is a number of a bridge) into which the bus will crash. If the height of a bridge equals the height of the bus, the bus will crash. */

public class P10_Bus_Tour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heightOfBus = scanner.nextInt();
        int numOfBridges = scanner.nextInt();
        int bridgeHeight;
        boolean crash = false;
        for (int i = 1; i <= numOfBridges; i++) {
            bridgeHeight = scanner.nextInt();
            if (heightOfBus >= bridgeHeight) {
                System.out.println("Will crash on bridge " + i);
                crash = true;
                break;
            }
        }
        if (!crash) {
            System.out.println("Will not crash");
        }
        scanner.close();
    }
}