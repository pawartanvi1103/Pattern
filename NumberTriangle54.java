
class NumberTriangle54 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int s = 5; s > i; s--) {
                System.out.print("  ");
            }

            if (i == 5) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print("5 ");
                }
            } else {
                System.out.print(i);

                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("  ");
                }

                System.out.print(i);
            }

            System.out.println();
        }
    }
}
