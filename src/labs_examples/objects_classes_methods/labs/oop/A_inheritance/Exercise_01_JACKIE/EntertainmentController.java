package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_JACKIE;

public class EntertainmentController {
    public static void main(String[] args) {

        Movie movie = new Movie("Warner Brothers", "Pineapple Express",
                2007, 2700000, "Comedy", "Seth Rogen",
                "James Franco", 104000000, "R-rated");


        Music music = new Music("Sony", "Oops I Did It Again",
                2000, 150000, 411000, 10000000, "Britney Spears");

        Punk punkMusic = new Punk("Epic", "Agony & Irony", 2008, 8800,
                0,150000,"Alkaline Trio",true);

        System.out.println("Movie Title: " + movie.title);
        System.out.println("Production Company: " + movie.productionStudioName);
        movie.studioRanking(movie.productionStudioName);
        System.out.println("Release Date: " + movie.releaseDate);
        System.out.println("Budget: $" + movie.budget);
        System.out.println("Box Office Sales: $" + movie.getBoxOfficeSales());
        movie.trackLossProfit(movie.getBoxOfficeSales(), movie.budget);

        System.out.println("___________________________________________");

        System.out.println("Album Title: " + music.title);
        System.out.println("Artist: " + music.getArtist());
        System.out.println("Production Company: " + music.productionStudioName);
        music.studioRanking(music.productionStudioName);
        System.out.println("Release Date: " + music.releaseDate);
        System.out.println("Budget: $" + music.budget);

        System.out.println("Total sales are: $" + music.getTotalSales(music.getNumAppleSales(), music.getNumRecordSales()));

        music.trackLossProfit(music.getTotalSales(music.getNumAppleSales(), music.getNumRecordSales()), music.getBudget());

        System.out.println("The percent of Apple sales: " + music.percentageOfSalesApple() + " %");
        System.out.println("The percent of Records sales: " + music.percentageOfSalesRecords() + " %");

        System.out.println("___________________________________________");

        System.out.println("Punk Album Title: " + punkMusic.title);
        System.out.println("Artist: " + punkMusic.getArtist());
        System.out.println("Production Company: " + punkMusic.productionStudioName);
        punkMusic.studioRanking(punkMusic.productionStudioName);
        System.out.println("Release Date: " + punkMusic.releaseDate);
        System.out.println("Budget: $" + punkMusic.budget);
        System.out.println("Total sales are: $" + punkMusic.getTotalSales(punkMusic.getNumAppleSales(), punkMusic.getNumRecordSales()));
        punkMusic.trackLossProfit(punkMusic.getTotalSales(music.getNumAppleSales(), music.getNumRecordSales()), punkMusic.budget);
        System.out.println("The percent of Apple sales: " + punkMusic.percentageOfSalesApple() + " %");
        System.out.println("The percent of Records sales: " + punkMusic.percentageOfSalesRecords()  + " %");


    }
}