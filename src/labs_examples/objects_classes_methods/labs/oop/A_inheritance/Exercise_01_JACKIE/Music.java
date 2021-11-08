package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_JACKIE;

public class Music extends Entertainment{
    private double numDownloadsApple;
    private double numSold;
    private String artist;

    public Music(String productionStudioName, String title, int releaseDate,
                 double budget, double numDownloadsApple, double numSold, String artist) {
        super(productionStudioName, title, releaseDate, budget);
        this.numDownloadsApple = numDownloadsApple;
        this.numSold = numSold;
        this.artist = artist;
    }

    public double getNumDownloadsApple() {
        return numDownloadsApple;
    }

    public void setNumDownloadsApple(double numDownloadsApple) {
        this.numDownloadsApple = numDownloadsApple;
    }

    public double getNumSold() {
        return numSold;
    }

    public void setNumSold(double numSold) {
        this.numSold = numSold;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
