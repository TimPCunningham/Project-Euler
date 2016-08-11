package github.timpcunningham.problems.problem_6;

import github.timpcunningham.Problem;
import github.timpcunningham.Report;

/*
The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
* */

public class Problem_6 implements Problem {

    @Override
    public void answer() {
        long sumOfSq = 0;
        long sqOfSum = 0;
        long result = 0;

        for(int i = 1; i <= 100; i++) {
            sumOfSq += Math.pow(i, 2);
            sqOfSum += i;
        }

        sqOfSum = (long) Math.pow(sqOfSum, 2);

        result = sqOfSum - sumOfSq;
        Report.reportNumber(6, result);
    }
}
