public class App {


    public static void main(String[] args) {

        TripPlanner tripPlanner = new TripPlanner();

        Landmark landmark = new Landmark(100, 100, "Palatul Copiilor", 50, LandmarkType.CULTURAL);

        tripPlanner.addLocation(landmark);
        tripPlanner.addLocation(new Landmark(30, 30, "Gradina Botanica", 50, LandmarkType.BIOLOGICAL));
        tripPlanner.addLocation(new Landmark(70, 73, "Muntele Ceahlau", 50, LandmarkType.GEOLOGICAL));

        tripPlanner.addLocation(new City(13, 19, "Paris"));
        tripPlanner.addLocation(new City(26, 34, "Hannover"));
        tripPlanner.addLocation(new City(58, 74, "Zaragoza"));

        tripPlanner.addLocation(new UserLocation(39, 42));

        landmark.setNewFee(-30);

        System.out.println(tripPlanner.getClosestCityTo(landmark));

    }
}
