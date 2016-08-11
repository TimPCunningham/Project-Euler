package github.timpcunningham.problems.problem_4;

import github.timpcunningham.Problem;
import github.timpcunningham.Report;

/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
* */

public class Problem_4 implements Problem {
    @Override
    public void answer() {
        int largest = 0;
        int temp;

        for(int x = 999; x > 99; x--) {
            for(int y = 999; y > 99; y--) {
                temp = x * y;

                if(isPalindromeNumber(temp) && temp > largest) {
                    largest = temp;
                }
            }
        }
        Report.reportNumber(4, largest);
    }

    private boolean isPalindromeNumber(int number) {
        String temp = String.valueOf(number);
        String reverse = new StringBuilder(temp).reverse().toString();

        return temp.equalsIgnoreCase(reverse);
    }
}
