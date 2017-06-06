public class Optimization {
    public void optimize(float W, Item[] Item_array, int N)
    {
        int negative_infinity = Integer.MIN_VALUE;
        int[][] m = new int[N + 1][(int) (W + 1)];
        int[][] sol = new int[N + 1][(int) (W + 1)];
        for (int i = 1; i <= N; i++)
        {
            for (int j = 0; j <= W; j++)
            {
                int m1 = m[i - 1][j];
                int m2 = negative_infinity; 
                if (j >= Item_array[i-1].weight)
                    m2 = m[i - 1][ (int) (j - Item_array[i-1].weight)] + Item_array[i-1].cost;
                m[i][(int) j] = Math.max(m1, m2);
                sol[i][(int) j] = m2 >= m1 ? 1 : 0;
            }
        }        
        int[] selected = new int[N + 1];
        for (int n = N, w = (int) W; n > 0; n--)
        {
            if (sol[n][w] != 0)
            {
                selected[n] = 1;
                w = (int) (w - Item_array[n-1].weight);
            }
            else
                selected[n] = 0;
        }
        for (int i = 1; i < N + 1; i++)

            if (selected[i] == 1)
            {
                System.out.print(Item_array[i-1].index_number+" ");
            }
        System.out.println();
    }
}


