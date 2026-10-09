
class ExpandingContractingStarPattern
{
    public static void main(String[] args)
    {
        int n = 5;

        for(int i = 1; i <= 2 * n - 1; i++)
        {
            int count;

            if(i <= n)
            {
                count = i;
            }
            else
            {
                count = 2 * n - i;
            }

            if(i == n)
            {
                // Full middle row
                for(int j = 1; j <= 2 * n - 1; j++)
                {
                    System.out.print("* ");
                }
            }
            else
            {
                // Left stars
                for(int j = 1; j <= count; j++)
                {
                    System.out.print("* ");
                }

                // Middle spaces
                for(int j = 1; j <= 2 * (n - count) - 1; j++)
                {
                    System.out.print("  ");
                }

                // Right stars
                for(int j = 1; j <= count; j++)
                {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}
