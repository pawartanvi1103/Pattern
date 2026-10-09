class RightAlignedDecresingTriagle{
   public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {

            for (int s = 5; s > i; s--) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}