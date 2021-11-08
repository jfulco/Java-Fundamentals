package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_JACKIE;

public class EntertainmentController {
    public static void main(String[] args) {
        String productionStudioName = "Warner Brothers";
        double boxOfficeSales = 104000000;
        double budget = 2700000;
        Movie movie = new Movie(productionStudioName, "Pineapple Express",
                2007, budget, "Comedy", "Seth Rogen",
                "James Franco", boxOfficeSales, "R-rated");
        Music music = new Music("Sony", "Oops I Did It Again",
                2000, 150000, 88900000, 20000000, "Britney Spears");
        System.out.println("Movie Title: " + movie.title);
        System.out.println("Production Company: " + movie.productionStudioName);
        movie.studioRanking(productionStudioName);
        System.out.println("Budget: $" + movie.budget + " million");
        System.out.println("Box Office Sales: $" + movie.getBoxOfficeSales() + " million");
        movie.trackLossProfit(boxOfficeSales, budget);
        System.out.println("___________________________________________");
        System.out.println("Album Title: " + music.title);
        System.out.println("");

    }
}