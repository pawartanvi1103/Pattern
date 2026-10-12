
class NumberPattern57 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int s = 5; s > i; s--) {
                System.out.print("  ");
            }

            if (i == 5) {
                for (int j = 1; j <= 4; j++) {
                    System.out.print(j + "   ");
                }
                System.out.print(1);
            } else {
                System.out.print(1);

                if (i > 1) {
                    for (int j = 1; j <= 2 * i - 3; j++) {
                        System.out.print("  ");
                    }
                    System.out.print(1);
                }
            }

            System.out.println();
        }
    }
}
