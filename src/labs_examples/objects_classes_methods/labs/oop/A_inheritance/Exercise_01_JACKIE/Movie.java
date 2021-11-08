package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_JACKIE;

public class Movie extends Entertainment{
    private String category;
    private String leadActor;
    private String supportingActor;
    private double boxOfficeSales;
    private String rating;

    public Movie(String productionStudioName, String title, int releaseDate, double budget,
                 String category, String leadActor, String supportingActor,
                 double boxOfficeSales, String rating) {
        super(productionStudioName, title, releaseDate, budget);
        this.category = category;
        this.leadActor = leadActor;
        this.supportingActor = supportingActor;
        this.boxOfficeSales = boxOfficeSales/1000000;
        this.rating = rating;
    }

    public static void trackLossProfit(double boxOfficeSales, double budget) {
        double difference = (boxOfficeSales - budget)/1000000;

        if (difference < 0) {
            System.out.println("The movie lost money :(");
            System.out.println("Loss: $" + difference + " million");
        } else if (difference > 0) {
            System.out.println("The movie made a profit :)");
            System.out.println("Profit: $" + difference + " million");
        } else {
            System.out.println("The movie broke even :|");
        }
    }

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
