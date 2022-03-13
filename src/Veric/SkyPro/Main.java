package Veric.SkyPro;

public class Main {

    public static void main(String[] args) {
// Task-1
        int countNumber = 0;
        while (countNumber < 10) {
            countNumber++;
            System.out.print(countNumber + " ");
        }
        System.out.println();
        for (; countNumber > 0; countNumber--) {
            System.out.print(countNumber + " ");
        }
        System.out.println();
// Task-2
        int firstFriday = 2; // Friday is 2h day of month
        for (int i = firstFriday; i < 32; i += 7) {
            System.out.println("Сегодня пятница," + i + "-е число. Необходимо подготовить отчет.");
        }
// Task-3
        int currentYear = 2022;
        int yearObserved = 1580; //StartYear = 0 A.D.
        int loopYear = 79;
        int endRange = 100;
        int startRange = 200;
        int firstYearInRanged = (currentYear - startRange - yearObserved) / loopYear * loopYear + yearObserved;
        if ( (currentYear - startRange - yearObserved) % loopYear != 0) {
            firstYearInRanged += loopYear;
        }
        for (int i = firstYearInRanged; i <= (currentYear + endRange); i += loopYear) {
            System.out.println(i);
        }
    }
}