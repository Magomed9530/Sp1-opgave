public class Main {
    public static void main(String[] args) {

        // Opgave 1

        String name = "The Static Waves";
        int fans = 8500;
        int maxFans = 15000;
        int fameLevel = 2;
        int experiencePoints = 3200;
        double money = 4750.50;
        boolean isActive = true;
        char genre = 'E';

        String[] repertoire = {
                "Midnight Drive",
                "Neon Lights",
                "Electric Hearts",
                "Digital Dreams"
        };

        System.out.println("Name: " + name);
        System.out.println("Fans: " + fans);
        System.out.println("Max fans: " + maxFans);
        System.out.println("Fame level: " + fameLevel);
        System.out.println("Experience points: " + experiencePoints);
        System.out.println("Money: " + money);
        System.out.println("Active: " + isActive);
        System.out.println("Genre: " + genre);


        // OUTPUT OPGAVE 1:
        /*
        Name: The Static Waves
        Fans: 8500
        Max fans: 15000
        Fame level: 2
        Experience points: 3200
        Money: 4750.5
        Active: true
        Genre: E
        */


        // Opgave 2: Control Structures

        // Status checks
        if (fans < maxFans * 0.25) {
            System.out.println("WARNING: Losing relevance! Consider a comeback strategy.");
        }

        if (fans <= 0) {
            isActive = false;
            System.out.println("The band has broken up...");
        }

        switch (genre) {
            case 'R':
                System.out.println("Rock band!");
                break;

            case 'E':
                System.out.println("Electronic music!");
                break;

            case 'H':
                System.out.println("Hip-Hop artist!");
                break;

            case 'P':
                System.out.println("Pop artist!");
                break;

            default:
                System.out.println("Unknown genre.");
                break;
        }


        // OUTPUT STATUS CHECKS:
        /*
        Electronic music!
        */


        // Fame system
        int threshold = 2000 * fameLevel;

        if (experiencePoints > threshold) {
            System.out.println("Ready to level up!");
        }

        switch (fameLevel) {
            case 1:
                System.out.println("Unknown - Playing in garages");
                break;

            case 2:
                System.out.println("Local Hero - Small venues await");
                break;

            case 3:
                System.out.println("Rising Star - Festival invitations coming in");
                break;

            case 4:
                System.out.println("Mainstream - Arena tours possible");
                break;

            case 5:
                System.out.println("Superstar - Stadium glory!");
                break;

            default:
                System.out.println("Unknown fame level.");
                break;
        }


        // OUTPUT FAME SYSTEM:
        /*
        Local Hero - Small venues await
        */


        // Repertoire
        for (String song : repertoire) {
            System.out.println(song);
        }

        System.out.println("The band has " + repertoire.length + " songs.");


        // OUTPUT REPERTOIRE:
        /*
        Midnight Drive
        Neon Lights
        Electric Hearts
        Digital Dreams
        The band has 4 songs.
        */


        // Simpel "gig" simulation
        int venueCapacity = 500;
        int attendance = 420;

        double percentageFull = (double) attendance / venueCapacity * 100;

        System.out.println("Venue capacity: " + venueCapacity);
        System.out.println("Attendance: " + attendance);
        System.out.println("Concert was " + percentageFull + "% full.");

        if (percentageFull > 80) {
            fans += 200;
        } else {
            fans += 50;
        }

        money += 1500;

        System.out.println("Fans after concert: " + fans);
        System.out.println("Money after concert: " + money);


        // OUTPUT GIG:
        /*
        Venue capacity: 500
        Attendance: 420
        Concert was 84.0% full.
        Fans after concert: 8700
        Money after concert: 6250.5
        */


        // Random event
        int eventType = 1;

        if (eventType == 1) {
            System.out.println("Great review! +500 fans");
            fans += 500;

        } else if (eventType == 2) {
            System.out.println("Quiet week. Nothing happens.");

        } else if (eventType == 3) {
            System.out.println("Scandal! -300 fans");
            fans -= 300;
        }


        // OUTPUT RANDOM EVENT:
        /*
        Great review! +500 fans
        */

        // Fans ender på 9200 efter eventet.
    }
}
