public class hillpattern
{
    public static void main(String args[])
    {
        int rows=5;
        for(int i=1;i<=rows;i++)
        {
            int num=1;
            for(int k=rows;k>=i;k--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(num);
                num++;
            }
            System.out.println();

        }
    }
}