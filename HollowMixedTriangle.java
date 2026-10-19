class HollowMixedTriangle{
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Print starting spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            // First row: number
            if (i == 1) {
                System.out.print("1");
            }

            // Middle rows: alphabets on boundaries
            else if (i < n) {
                System.out.print("A");

                for (int s = 1; s <= 2 * i - 3; s++) {
                    System.out.print("  ");
                }

                System.out.print((char)('A' + i - 2));
            }

            // Last row: numbers
            else {
                for (int j = 1; j <= 2 * n - 1; j++) {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
    }
}
