import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        //ask the user to input a degree in celcius
        System.out.print("Enter a degree in Celcius: ");

        // instantiate scanner class
        Scanner input = new Scanner(System.in);

        // retrieve celcius from input
        double celcius = input.nextDouble();

        // calculate conversion of fahrenheit = (9.0/5) * celcius + 32
        double fahrenheit = (9.0/5) * celcius + 32;

        // DISPLAY celcius and farenheit results
        System.out.println(celcius + " Celcius is " + fahrenheit + " Fahrenheit");
    }

}
