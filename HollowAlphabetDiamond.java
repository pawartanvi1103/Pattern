
class HollowAlphabetDiamond {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {

            int n;

            if (i <= 4) {
                n = i;
            } else {
                n = 8 - i;
            }

            // Print left-side alphabets
            for (int j = 1; j <= n; j++) {
                System.out.print((char)('A' + j - 1) + "\t");
            }

            // Print middle spaces
            for (int s = 1; s <= 2 * (4 - n); s++) {
                System.out.print("\t");
            }

            // Print right-side alphabets
            for (int j = n; j >= 1; j--) {
                System.out.print((char)('A' + j - 1) + "\t");
            }

            System.out.println();
        }
    }
}
