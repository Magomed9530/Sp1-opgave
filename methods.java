public class Main {

    // Variabler
    static String name = "The Static Waves";
    static int fans = 8500;
    static int maxFans = 15000;
    static int fameLevel = 2;
    static int experiencePoints = 3200;
    static double money = 4750.50;
    static boolean isActive = true;
    static char genre = 'E';

    static String[] repertoire = {
            "Midnight Drive",
            "Neon Lights",
            "Electric Hearts",
            "Digital Dreams"
    };


    public static void main(String[] args) {

        // Her kalder jeg metoderne
        printBandProfile();

        playGig(500, 420);

        gainFans(200);

        loseFans(100);
    }


    // METODER


    static void printBandProfile() {
        System.out.println("Name: " + name);
        System.out.println("Fans: " + fans);
        System.out.println("Money: " + money);
    }


    static void playGig(int venueCapacity, int attendance) {
        double percentageFull = (double) attendance / venueCapacity * 100;

        System.out.println("Venue capacity: " + venueCapacity);
        System.out.println("Attendance: " + attendance);
        System.out.println("Concert was " + percentageFull + "% full.");

        if (percentageFull > 80) {
            gainFans(200);
        } else {
            gainFans(50);
        }

        money += 1500;
    }


    static void gainFans(int amount) {
        fans += amount;
    }


    static void loseFans(int amount) {
        fans -= amount;
    }
}
