public class StudyMood implements Mood {
    @Override
    public void recommendMusic(String genre) {
        System.out.println("Recommended music for a study mood (" + genre + "):");
        System.out.println("Begimai");
        System.out.println("I wanna be yours");
        System.out.println("Bari biled");
    }

    @Override
    public void getRecommendedArtists() {
        System.out.println("Recommended artists for a study mood:");
        System.out.println("Dastan");
        System.out.println("Arctik Monkeys");
        System.out.println("91");
    }

    @Override
    public void playPreview(String song) {
        System.out.println("Playing preview of " + song);
    }
}
