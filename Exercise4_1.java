Ad Soyad: Şevval Ekmen
Öğrenci No: 250541080
    
    import java.util.Scanner;

public class Dates {

    public static void printAmerican(String day, int date, String month, int year) {
        // American Format: Monday, July 22, 2019
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        // European Format: 22 July 2019, Monday
        System.out.println(date + " " + month + " " + year + ", " + day);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter day (e.g., Monday): ");
        String day = scan.nextLine();

        System.out.print("Enter month (e.g., July): ");
        String month = scan.nextLine();

        System.out.print("Enter date (number): ");
        int date = scan.nextInt();

        System.out.print("Enter year: ");
        int year = scan.nextInt();

        System.out.println("\nAmerican Format");
        printAmerican(day, date, month, year);

        System.out.println("European Format");
        printEuropean(day, date, month, year);
    }
}
