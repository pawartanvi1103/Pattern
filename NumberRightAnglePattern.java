class NumberRightAnglePattern {
    public static void main(String[] args) {

        int num = 1;

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                if (j == 1 || j == i || i == 5) {
                    System.out.print(num + " ");
                    num++;
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
