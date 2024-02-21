public class GymMood implements Mood {
    @Override
    public void recommendMusic(String genre) {
        System.out.println("Recommended music for a gym mood (" + genre + "):");
        System.out.println("Brazilian fonk");
        System.out.println("Kazakh fonk");
        System.out.println("Japannes Fonk");
    }

    @Override
    public void getRecommendedArtists() {
        System.out.println("Recommended artists for a gym mood:");
        System.out.println("Brazilia");
        System.out.println("Kazakhstan");
        System.out.println("Japan");
    }

    @Override
    public void playPreview(String song) {
        System.out.println("Playing preview of " + song);
    }
}
