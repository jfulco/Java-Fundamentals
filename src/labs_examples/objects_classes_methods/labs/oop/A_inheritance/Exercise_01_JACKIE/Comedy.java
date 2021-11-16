package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_JACKIE;

public class Comedy extends Movie {
    private boolean isRaunchy;
    private boolean isRomantic;

    public Comedy(String productionStudioName, String title, int releaseDate, double budget,
                  String category, String leadActor, String supportingActor,
                  double boxOfficeSales, String rating, boolean isRaunchy, boolean isRomantic) {
        super(productionStudioName, title, releaseDate, budget, category, leadActor, supportingActor,
                boxOfficeSales, rating);
        this.isRaunchy = isRaunchy;
        this.isRomantic = isRomantic;
    }



    public boolean isRaunchy() {
        return isRaunchy;
    }

    public void setRaunchy(boolean raunchy) {
        isRaunchy = raunchy;
    }

    public boolean isRomantic() {
        return isRomantic;
    }

    public void setRomantic(boolean romantic) {
        isRomantic = romantic;
    }

    
}
