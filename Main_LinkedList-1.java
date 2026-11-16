import java.util.Scanner;
import java.io.IOException;

public class Main_Pangca {

    public static void main(String[] args)
            throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Subject sub = new Subject();

        System.out.printf("====DATA ENTRY====%n");

        System.out.print("Code: ");
        sub.setCode(scanner.nextLine());

        System.out.print("Name: ");
        sub.setName(scanner.nextLine());

        System.out.print("Section: ");
        sub.setSection(scanner.nextLine());

        System.out.print("Units: ");
        sub.setUnits(scanner.nextDouble());

        new ProcessBuilder("cmd", "/c", "cls")
                .inheritIO().start().waitFor();

        System.out.printf("====DATA ENTERED====%n");

        System.out.printf("Code: %s%n", sub.getCode());
        System.out.printf("Name: %s%n", sub.getName());
        System.out.printf("Section: %s%n", sub.getSection());
        System.out.printf("Units: %s%n", sub.getUnits());

        scanner.close();
    }
}

class Subject {

    private String code;
    private String name;
    private String section;
    private double units;

    // SETTER METHODS

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setUnits(double units) {
        this.units = units;
    }

    // GETTER METHODS

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getSection() {
        return section;
    }

    public double getUnits() {
        return units;
    }
} 
	