import java.awt.*;

public class Main {

    public static void printYearsAndDays(int minutes){
        int years;
        int days;
        if(minutes < 0){
            System.out.println("Invalid Value");
            return;
        }
        years = minutes / (365*24*60);
        days = (minutes % (365*24*60)) / (24*60);

        System.out.println(minutes + " min = " + years + " y and " + days + " d.");

    }

    public static void main(String[] args) {
        Main.printYearsAndDays(525600);
        Main.printYearsAndDays(1051200);
        Main.printYearsAndDays(561600);
    }
}
