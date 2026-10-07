class RightAlignedDecreasingStarTriangle
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 5; i++)
        {
            // spaces
            for(int j = 1; j <= i - 1; j++)
            {
                System.out.print("  ");
            }

            // stars
            for(int j = 1; j <= 5 - i + 1; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}