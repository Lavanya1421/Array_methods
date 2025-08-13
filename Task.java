package crt;
import java.util.Scanner;

public class Task{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                break; // Exit if an empty line is encountered
            }
            String[] parts = line.split(" ");
            if (parts.length != 2) {
                continue; // Skip invalid lines
            }
            String s = parts[0];
            int n = Integer.parseInt(parts[1]);

            // Format string: left justified in 15 characters
            // Format integer: 3 digits with leading zeros
            System.out.printf("%-15s%03d\n", s, n);
        }
        System.out.println("================================");
        scanner.close();
    }
}