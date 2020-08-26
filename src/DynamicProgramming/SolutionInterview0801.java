package DynamicProgramming;

public class SolutionInterview0801 {

    public int waysToStep(int n) {
        long[] way = new long[n + 1];
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        if(n == 3)
            return 4;
        way[1] = 1;
        way[2] = 2;
        way[3] = 4;
        for(int i = 4; i <= n; i++) {
            way[i] = (way[i - 1] + way[i - 2] + way[i - 3]) % 1000000007;
        }
        return (int)way[n];
    }
}
