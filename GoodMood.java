public class GoodMood implements Mood {
    @Override
    public void recommendMusic(String genre) {
        System.out.println("Recommended music for a good mood (" + genre + "):");
        System.out.println("Любовь");
        System.out.println("Uide");
        System.out.println("Оружие");
    }

    @Override
    public void getRecommendedArtists() {
        System.out.println("Recommended artists for a good mood:");
        System.out.println("WSB");
        System.out.println("Darkhan Juzz");
        System.out.println("Пицца");
    }

    @Override
    public void playPreview(String song) {
        System.out.println("Playing preview of " + song);
    }
}

