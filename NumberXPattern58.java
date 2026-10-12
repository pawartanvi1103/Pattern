class NumberXPattern58 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int s = 1; s < i; s++) {
                System.out.print("  ");
            }

            System.out.print(i);

            if (i < 5) {
                for (int s = 1; s <= 2 * (5 - i) - 1; s++) {
                    System.out.print("  ");
                }
                System.out.print(10 - i);
            }

            System.out.println();
        }

        for (int i = 4; i >= 1; i--) {
            for (int s = 1; s < i; s++) {
                System.out.print("  ");
            }

            System.out.print(i);

            for (int s = 1; s <= 2 * (5 - i) - 1; s++) {
                System.out.print("  ");
            }

            System.out.print(10 - i);
            System.out.println();
        }
    }
}
