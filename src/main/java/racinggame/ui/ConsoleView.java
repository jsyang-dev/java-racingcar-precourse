package racinggame.ui;

import nextstep.utils.Console;

public class ConsoleView {

    public static final String ERROR_PREFIX = "[ERROR]";

    public static String input(String message) {
        System.out.println(message);
        return Console.readLine();
    }

    public static void printErrorMessage(IllegalArgumentException e) {
        System.out.printf("%s %s%n", ERROR_PREFIX, e.getMessage());
    }
}
