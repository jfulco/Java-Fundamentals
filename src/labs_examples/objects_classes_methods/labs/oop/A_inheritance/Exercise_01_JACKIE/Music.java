package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_JACKIE;

public class Music extends Entertainment {
    //instance variables
    private double numAppleSales;
    private double numRecordSales;
    private String artist;

    //Used for Music methods
    private double totalSales;
    private double applePercent;
    private double recordsPercent;

    //Methods
    public Music(String productionStudioName, String title, int releaseDate,
                 double budget, double numAppleSales, double numRecordSales, String artist) {
        super(productionStudioName, title, releaseDate, budget);
        this.numAppleSales = numAppleSales;
        this.numRecordSales = numRecordSales;
        this.artist = artist;
    }


    public static void trackLossProfit(double totalSales, double budget) {
        double difference = (totalSales - budget);

        if (difference < 0) {
            System.out.println("The album lost money :(");
            System.out.println("Loss: $" + difference);
        } else if (difference > 0) {
            System.out.println("The album made a profit :)");
            System.out.println("Profit: $" + difference);
        } else {
            System.out.println("The album broke even :|");
        }
    }

    @Override
    public void studioRanking(String productionStudioName){
        switch (productionStudioName) {
            case "Sony":
                System.out.println(productionStudioName + " is rated #1 best music studio in the US.");
                break;
            case "Universal Group":
                System.out.println(" is rated #2 best music studio in the US.");
                break;
            case "Warner Music Group":
                System.out.println(" is rated #3 best music studio in the US.");
                break;
            default:
            super.studioRanking(productionStudioName);
            break;
        }
    }

    public double percentageOfSalesApple() {
        applePercent = ((numAppleSales/totalSales))*100;
        return applePercent;
    }

    public double percentageOfSalesRecords() {
        recordsPercent = (numRecordSales/totalSales)*100;
        return recordsPercent;
    }

    //Getter & Setters
    public double getNumDownloadsApple() {
        return numAppleSales;
    }

    public double getNumAppleSales() {
        return numAppleSales;
    }

    public void setNumAppleSales(double numAppleSales) {
        this.numAppleSales = numAppleSales;
    }

    public double getNumRecordSales() {
        return numRecordSales;
    }

    public void setNumRecordSales(double numRecordSales) {
        this.numRecordSales = numRecordSales;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getTotalSales(double numAppleSales, double numRecordSales) {
        totalSales = (numAppleSales + numRecordSales);
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getApplePercent() {
        return applePercent;
    }

    public double setApplePercent(double applePercent) {
        this.applePercent = applePercent;
        return applePercent;
    }

    public double getRecordsPercent() {
        return recordsPercent;
    }

    public void setRecordsPercent(double recordsPercent) {
        this.recordsPercent = recordsPercent;
    }
}



