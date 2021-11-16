package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_JACKIE;


public class Entertainment {
    //instance variables
    protected String productionStudioName;
    protected String title;
    protected int releaseDate;
    protected double budget;

    //methods
    public Entertainment(String productionStudioName, String title, int releaseDate, double budget) {
        this.productionStudioName = productionStudioName;
        this.title = title;
        this.releaseDate = releaseDate;
        this.budget = budget;
    }

    public void studioRanking(String productionStudioName){
        System.out.println("This studio is not ranked");
    }

    //Getter & Setters

    public String getProductionStudioName() {
        return productionStudioName;
    }

    public void setProductionStudioName(String productionStudioName) {
        this.productionStudioName = productionStudioName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}