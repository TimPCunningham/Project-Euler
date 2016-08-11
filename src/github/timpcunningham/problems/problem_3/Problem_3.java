package github.timpcunningham.problems.problem_3;

import github.timpcunningham.Problem;
import github.timpcunningham.Report;

/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
* */

public class Problem_3 implements Problem {
    @Override
    public void answer() {
        long bigNumber = 600851475143L;
        int sqrt = (int) Math.sqrt(bigNumber);
        int result = sqrt;

        while(bigNumber % result != 0 || !isPrime(result)) {
            result--;
        }

        Report.reportNumber(3, result);
    }

    public boolean isPrime(int number) {
        int sqrt = (int) Math.sqrt(number);

        for(int i = sqrt; i > 1; i--) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
