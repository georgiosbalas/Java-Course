
public class HeronArea {

    public static void main(String[] args) {
        double a = 5;
        double b = 6;
        double c = 7;

        double s = (a + b + c) / 2;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.printf("The area of the triangle with sides %.2f, %.2f and %.2f is: %.2f%n", a, b, c, area);
    }
}
