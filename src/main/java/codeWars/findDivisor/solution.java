package codeWars.findDivisor;

public class solution {
    public long numberOfDivisors(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum++;
            }
        }
        return sum;
    }
}


/*
 return IntStream.range(1, n+1).filter(i -> n%i==0).count();
 */