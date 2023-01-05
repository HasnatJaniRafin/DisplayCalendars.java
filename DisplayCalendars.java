import java.time.Year;                // Name : Hasnat Jani Rafin
import java.time.format.TextStyle;      // ID : 20172507
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;
import java.util.Locale;
public class DisplayCalendars {
    public static void main(String[] strings) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int year = ip.nextInt();
        System.out.print(" First day of Year: ");
        int startDay = ip.nextInt();
        ip.close();
        int nmbrDAYmnth = 0;
        for (int month = 1; month <= 12; month++) {
            LocalDate date = LocalDate.of(year, Month.of(month), 10);
            String monthDisplayName = date.getMonth().getDisplayName(
                TextStyle.FULL, Locale.US);
                nmbrDAYmnth = date.getMonth().length(Year.isLeap(year));
            System.out.print("          ");
            System.out.println(monthDisplayName + " " + year);
            System.out.println("-----------------------------");
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
            for (int i = 0; i < startDay; i++) {
                System.out.print("    ");
            }for (int i = 1; i <= nmbrDAYmnth; i++) {
                if (i < 10) {    System.out.print("   " + i);
                } else { System.out.print("  " + i);
                }if ((i + startDay) % 7 == 0) {
                    System.out.println();}
            } System.out.println("");
            startDay = (startDay + nmbrDAYmnth) % 7;}
        System.out.println(" ***** [ Copyright (20172507) - Hasnat Jani Rafin ] *****" );
    }       
}