class NumberPattern53 {
    public static void main(String[] args) {

        int num = 1;

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 6 - i; j++) {

                if (i == 1 || j == 1 || j == 6 - i) {
                    System.out.print(num + "\t");
                } else {
                    System.out.print("\t");
                }

                if (i == 1 || j == 1 || j == 6 - i) {
                    num++;
                }
            }

            System.out.println();
        }
    }
}
