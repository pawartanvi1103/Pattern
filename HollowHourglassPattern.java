
class HollowHourglassPattern
{
    public static void main(String[] args)
    {
        int n = 9;

        for(int i = 1; i <= n; i++)
        {
            int stars;
            int spaces;

            if(i <= 5)
            {
                stars = 5 - i + 1;
                spaces = 2 * i - 3;
            }
            else
            {
                stars = i - 4;
                spaces = 2 * (n - i) - 1;
            }

            // Left stars
            for(int j = 1; j <= stars; j++)
            {
                System.out.print("* ");
            }

            // Middle spaces
            for(int j = 1; j <= spaces; j++)
            {
                System.out.print("  ");
            }

            // Right stars
            for(int j = 1; j <= stars; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
