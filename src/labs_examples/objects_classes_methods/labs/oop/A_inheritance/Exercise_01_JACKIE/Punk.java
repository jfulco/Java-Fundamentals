package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_JACKIE;

public class Punk extends Music{
    private boolean hasSwearing;

    public Punk(String productionStudioName, String title, int releaseDate,
                double budget, double numDownloadsApple, double numSold,
                String artist, boolean hasSwearing) {
        super(productionStudioName, title, releaseDate, budget, numDownloadsApple, numSold, artist);
        this.hasSwearing = hasSwearing;
    }

    public boolean isHasSwearing() {
        return hasSwearing;
    }

    public void setHasSwearing(boolean hasSwearing) {
        this.hasSwearing = hasSwearing;
    }
}
