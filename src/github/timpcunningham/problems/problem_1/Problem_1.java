package github.timpcunningham.problems.problem_1;

import github.timpcunningham.Problem;
import github.timpcunningham.Report;

public class Problem_1 implements Problem {
    @Override
    public void answer() {
        int result = 0;

        for(int i = 1; i < 1000; i ++) {
            if(i % 3 ==0 || i % 5 == 0) {
                result += i;
            }
        }

        Report.reportNumber(1, result);
    }
}
