
public class TimeConversion {

    public static void main(String[] args) {
        int seconds = 4700;

        int hours = seconds / 3600;
        seconds %= 3600;
        int minutes = seconds / 60;
        seconds %= 60;

        System.out.println("4700 seconds are " + hours + " hours " + minutes + " minutes and " + seconds + " seconds.");
    }
}
