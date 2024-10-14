
public class LogicalExpressions {

    public static void main(String[] args) {
        System.out.println("Logical Expression                                     | True (T)/False (F)");
        System.out.println("----------------------------------------------------|------------------------");

        // 1. 6 / 8 >= 8 * 5
        System.out.printf("6 / 8 >= 8 * 5                                     | %s%n", (6.0 / 8 >= 8 * 5) ? "F" : "T");

        // 2. 3 * 2 <= 6 % 3
        System.out.printf("3 * 2 <= 6 %% 3                                     | %s%n", (3 * 2 <= 6 % 3) ? "T" : "F");

        // 3. 7 + 7 == 3 % 2
        System.out.printf("7 + 7 == 3 %% 2                                     | %s%n", (7 + 7 == 3 % 2) ? "F" : "T");

        // 4. 5 * 7 <= 3 * 4
        System.out.printf("5 * 7 <= 3 * 4                                     | %s%n", (5 * 7 <= 3 * 4) ? "F" : "T");

        // 5. 6 * 7 <= 2 + 8
        System.out.printf("6 * 7 <= 2 + 8                                     | %s%n", (6 * 7 <= 2 + 8) ? "T" : "F");

        // 6. 9 * 9 != 2 + 5
        System.out.printf("9 * 9 != 2 + 5                                     | %s%n", (9 * 9 != 2 + 5) ? "T" : "F");

        // 7. 3 / 4 == (3 / 7) || !(3 * 8 > 9 / 7)
        System.out.printf("3 / 4 == (3 / 7) || !(3 * 8 > 9 / 7)               | %s%n", (3 / 4.0 == (3 / 7.0) || !(3 * 8 > 9 / 7.0)) ? "T" : "F");

        // 8. 2 - Math.abs(-6) > 1 + 1
        System.out.printf("2 - Math.abs(-6) > 1 + 1                           | %s%n", (2 - Math.abs(-6) > 1 + 1) ? "F" : "T");

        // 9. !(7 / 3 < 3 + 1)
        System.out.printf("!(7 / 3 < 3 + 1)                                   | %s%n", !(7 / 3.0 < 3 + 1) ? "T" : "F");

        // 10. 2 % 9 != 9 / 2 && !(2 + 7 == 4 / 4)
        System.out.printf("2 %% 9 != 9 / 2 && !(2 + 7 == 4 / 4)              | %s%n", (2 % 9 != 9 / 2 && !(2 + 7 == 4 / 4)) ? "T" : "F");

        // 11. 4 % 4 > 7 * 8 || 3 / 5 == 1 / 4
        System.out.printf("4 %% 4 > 7 * 8 || 3 / 5 == 1 / 4                 | %s%n", (4 % 4 > 7 * 8 || 3 / 5.0 == 1 / 4.0) ? "T" : "F");

        // 12. 9 + 8 <= 2 % 7 && 8 % 7 >= 6 % 4
        System.out.printf("9 + 8 <= 2 %% 7 && 8 %% 7 >= 6 %% 4               | %s%n", (9 + 8 <= 2 % 7 && 8 % 7 >= 6 % 4) ? "T" : "F");
    }
}
