import java.util.Random;

public class Seven {
    public static void main(String[] args) {

        // Temperature Decision Example
        Random random = new Random();
        int daysUntilExtremeWeather = random.nextInt(12);
        int temperatureDrop = 0;

        if (daysUntilExtremeWeather == 1) {
            temperatureDrop = 20;
        }
        if (daysUntilExtremeWeather <= 5) {
            temperatureDrop = 10;
        }
        if (daysUntilExtremeWeather < 1) {
            System.out.println("Warning! The temperature has dropped dangerously!");
        } else if (daysUntilExtremeWeather == 1) {
            System.out.println("Extreme weather expected within a day!");
            System.out.println("Prepare now! Temperature will drop by " + temperatureDrop + "°C!");
        } else if (daysUntilExtremeWeather <= 5) {
            System.out.println("Extreme weather expected in: " + daysUntilExtremeWeather + " days.");
            System.out.println("Prepare now! Temperature will drop by " + temperatureDrop + "°C!");
        } else if (daysUntilExtremeWeather <= 10) {
            System.out.println("Mild temperature changes expected in: " + daysUntilExtremeWeather + " days.");
            System.out.println("Be aware of possible weather shifts.");
        }

    }
}
