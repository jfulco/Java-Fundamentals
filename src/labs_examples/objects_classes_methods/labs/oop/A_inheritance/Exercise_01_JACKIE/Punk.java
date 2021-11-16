package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_JACKIE;

public class Punk extends Music {
    //instance variables
    private boolean hasSwearing;

    //methods

    public Punk(String productionStudioName, String title, int releaseDate, double budget, double numAppleSales, double numRecordSales, String artist, boolean hasSwearing) {
        super(productionStudioName, title, releaseDate, budget, numAppleSales, numRecordSales, artist);
        this.hasSwearing = hasSwearing;
    }

    @Override
    public double percentageOfSalesApple() {
        if (hasSwearing == true){
            System.out.println("There are no Apple sales because the album has swearing - Apple doesn't allow swearing.");
        } else {
            super.percentageOfSalesApple();
        }
        return super.setApplePercent(0);
    }

    //Getter & Setters
    public boolean isHasSwearing() {
        return hasSwearing;
    }

    public void setHasSwearing(boolean hasSwearing) {
        this.hasSwearing = hasSwearing;
    }
}
