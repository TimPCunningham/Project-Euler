package github.timpcunningham;

import github.timpcunningham.problems.problem_1.Problem_1;
import github.timpcunningham.problems.problem_2.Problem_2;
import github.timpcunningham.problems.problem_3.Problem_3;
import github.timpcunningham.problems.problem_4.Problem_4;
import github.timpcunningham.problems.problem_5.Problem_5;
import github.timpcunningham.problems.problem_6.Problem_6;

public class Main {
    public static void main(String[] args) {
        Problem[] problems = {
                new Problem_1(),
                new Problem_2(),
                new Problem_3(),
                new Problem_4(),
                new Problem_5(), //Takes a bit long
                new Problem_6()
        };

        System.out.println("Solving problems.... ");

        for(Problem problem : problems) {
            problem.answer();
        }
    }
}
