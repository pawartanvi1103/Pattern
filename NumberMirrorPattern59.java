class NumberMirrorPattern59 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print spaces in the middle
            for (int s = 1; s <= 2 * (5 - i); s++) {
                System.out.print("  ");
            }

            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
