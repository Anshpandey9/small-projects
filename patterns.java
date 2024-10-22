public class patterns {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; i--) { // Loop from 4 down to 1, creating a pattern of asterisks
            //  The inner loop to print asterisks for the current level
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print an asterisk for each j
            }
            // Move to the next line after finishing the current row
            System.out.println();
        }
    }
}

