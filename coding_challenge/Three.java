
public class Three {
    public static void main(String[] args) {

        // Converting to Kelvin

        int degrees = 94;
        double temperatureK = ((degrees - 32) * 5.0 / 9) + 273.15;
        System.out.println("The temperature is " + temperatureK + " Kelvin");

        int degreesF = 94;
        double tempKelvin = ((degreesF - 32) * 5.0 / 9) + 273.15;
        System.out.println("The temperature is " + Math.round(tempKelvin) + " Kelvin");

    }
}
