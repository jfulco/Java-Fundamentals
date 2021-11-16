package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_JACKIE;

public class Movie extends Entertainment{
    //instance variables
    private String category;
    private String leadActor;
    private String supportingActor;
    private double boxOfficeSales;
    private String rating;

    //methods
    public Movie(String productionStudioName, String title, int releaseDate, double budget,
                 String category, String leadActor, String supportingActor,
                 double boxOfficeSales, String rating) {
        super(productionStudioName, title, releaseDate, budget);
        this.category = category;
        this.leadActor = leadActor;
        this.supportingActor = supportingActor;
        this.boxOfficeSales = boxOfficeSales;
        this.rating = rating;
    }

    @Override
    public void studioRanking(String productionStudioName){
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
                super.studioRanking(productionStudioName);
                break;
        }
    }

    public static void trackLossProfit(double boxOfficeSales, double budget) {
        double difference = (boxOfficeSales - budget);

        if (difference < 0) {
            System.out.println("The movie lost money :(");
            System.out.println("Loss: $" + difference);
        } else if (difference > 0) {
            System.out.println("The movie made a profit :)");
            System.out.println("Profit: $" + difference);
        } else {
            System.out.println("The movie broke even :|");
        }
    }


    //Getter & Setters
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLeadActor() {
        return leadActor;
    }

    public void setLeadActor(String leadActor) {
        this.leadActor = leadActor;
    }

    public String getSupportingActor() {
        return supportingActor;
    }

    public void setSupportingActor(String supportingActor) {
        this.supportingActor = supportingActor;
    }

    public double getBoxOfficeSales() {
        return boxOfficeSales;
    }

    public void setBoxOfficeSales(double boxOfficeSales) {
        this.boxOfficeSales = boxOfficeSales;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
