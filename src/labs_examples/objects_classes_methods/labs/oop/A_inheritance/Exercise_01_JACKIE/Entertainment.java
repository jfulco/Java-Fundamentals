package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_JACKIE;


public class Entertainment {
    protected String productionStudioName;
    protected String title;
    protected int releaseDate;
    protected double budget;


    public Entertainment(String productionStudioName, String title, int releaseDate, double budget) {
        this.productionStudioName = productionStudioName;
        this.title = title;
        this.releaseDate = releaseDate;
        this.budget = budget/1000000;
    }
    public static void studioRanking(String productionStudioName){
        switch (productionStudioName) {
            case "Warner Brothers":
                System.out.println(productionStudioName + " is rated #1 best movie studio in the US.");
                break;
            case "Walt Disney Pictures":
                System.out.println(" is rated #2 best movie studio in the US.");
                break;
            case "20th Century Studios":
                System.out.println(" is rated #3 best movie studio in the US.");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + productionStudioName);

        }
    }

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