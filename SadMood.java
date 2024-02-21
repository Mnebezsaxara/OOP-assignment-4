public class SadMood implements Mood {
    @Override
    public void recommendMusic(String genre) {
        System.out.println("Recommended music for a sad mood (" + genre + "):");
        System.out.println("Taspa");
        System.out.println("Я не спал");
        System.out.println("Люовь HD1080");
    }

    @Override
    public void getRecommendedArtists() {
        System.out.println("Recommended artists for a sad mood:");
        System.out.println("Dosekesh");
        System.out.println("Amourski");
        System.out.println("Каспиский груз");
    }

    @Override
    public void playPreview(String song) {
        System.out.println("Playing preview of " + song);
    }
}
