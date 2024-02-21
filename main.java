import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1) Good mood");
            System.out.println("2) Sad mood");
            System.out.println("3) Another mood");
            System.out.println("4) Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Mood goodMood = new GoodMood();
                    processMood(goodMood, scanner);
                    break;
                case 2:
                    Mood sadMood = new SadMood();
                    processMood(sadMood, scanner);
                    break;
                case 3:
                    System.out.println("Choose another mood:");
                    System.out.println("1) Gym mood");
                    System.out.println("2) Study mood");
                    int anotherMoodChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (anotherMoodChoice == 1) {
                        MoodFactory sp = new ConcreteMoodFactory();
                        Mood gymMood = sp.createMood("gym");
                        processMood(gymMood, scanner);
                    } else if (anotherMoodChoice == 2) {
                        MoodFactory sp = new ConcreteMoodFactory();
                        Mood studyMood = sp.createMood("study");
                        processMood(studyMood, scanner);
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void processMood(Mood mood, Scanner scanner) {
        System.out.println("Enter your favorite genre:");
        String userGenre = scanner.nextLine();
        mood.recommendMusic(userGenre);
        System.out.println("Do you need the list of artists?");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            mood.getRecommendedArtists();
        } else {
            System.out.println("They have another good musics!!!");
        }
        System.out.println("\nEnter the song you want to preview:");
        String song = scanner.nextLine();
        mood.playPreview(song);
    }
}
