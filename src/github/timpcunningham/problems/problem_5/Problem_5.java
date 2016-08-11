package github.timpcunningham.problems.problem_5;

import github.timpcunningham.Problem;
import github.timpcunningham.Report;

/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
* */

public class Problem_5 implements Problem {
    @Override
    public void answer() {
        int result = 0;
        int number = 2520;

        while(result == 0) {
            if(canBeDivided(number)) {
                result = number;
            }
            number++;
        }
        Report.reportNumber(5, result);
    }

    private boolean canBeDivided(int number) {
        for(int i = 1; i <= 20; i++) {
            if(number % i != 0) {
                return false;
            }
        }
        return true;
    }
}
