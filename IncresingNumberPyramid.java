class IncresingNumberPyramid{
  public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            // Print leading spaces
            for (int s = 5; s > i; s--) {
                System.out.print("  ");
            }

            // Print increasing numbers
            for (int j = i; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
            }

            // Print decreasing numbers
            for (int j = 2 * i - 2; j >= i; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}