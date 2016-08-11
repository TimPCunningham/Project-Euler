package github.timpcunningham;


public class Report {
    private static String SEPERATOR = "==============================";

    public static void reportNumber(int problem, int number) {
        printHeader(problem);
        print("Answer: " + number);
    }

    public static void reportNumber(int problem, double number) {
        printHeader(problem);
        print("Answer: " + number);
    }

    public static void reportNumber(int problem, float number) {
        printHeader(problem);
        print("Answer: " + number);
    }

    public static void reportNumber(int problem, long number) {
        printHeader(problem);
        print("Answer: " + number);
    }

    private static void printHeader(int problem) {
        print("");
        print(SEPERATOR);
        print("Problem " + problem);
    }

    private static void print(String message) {
        System.out.println(message);
    }
}
