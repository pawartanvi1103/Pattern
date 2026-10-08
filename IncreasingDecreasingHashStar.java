class IncreasingDecreasingHashStar
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 9; i++)
        {
            int count;

            if(i <= 5)
            {
                count = i;
            }
            else
            {
                count = 10 - i;
            }

            for(int j = 1; j <= count; j++)
            {
                if(j % 2 != 0)
                {
                    System.out.print("# ");
                }
                else
                {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}