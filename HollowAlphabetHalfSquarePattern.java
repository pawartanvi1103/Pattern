class HollowAlphabetHalfSquarePattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            if (i == 1) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print((char)('A' + j - 1) + "\t");
                }

                for (int j = 4; j >= 1; j--) {
                    System.out.print((char)('A' + j - 1) + "\t");
                }
            } else {
                System.out.print("A\t");

                for (int s = 1; s <= 7; s++) {
                    System.out.print("\t");
                }

                System.out.print("A");
            }

            System.out.println();
        }
    }
}
