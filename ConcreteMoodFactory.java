public class ConcreteMoodFactory extends MoodFactory {
    @Override
    public Mood createMood(String moodType) {
        switch (moodType.toLowerCase()) {
            case "gym":
                return new GymMood();
            case "study":
                return new StudyMood();
            default:
                throw new IllegalArgumentException("Invalid mood type");
        }
    }
}
