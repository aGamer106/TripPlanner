import java.util.ArrayList;
import java.util.List;

public class TripPlanner {

    private List<Location> locations;


    public TripPlanner() {
        this.locations = new ArrayList<>();
    }

    private List<City> getCities() {
        List<City> cities = new ArrayList<>();
        for (Location location : locations) {
            if(location instanceof City)
                cities.add((City) location);
        }
        return cities;
    }

    public void addLocation(Location location) {
        locations.add(location);
    }

    public City getClosestCityTo(Location location) {
        if (!locations.contains(location)) {
            System.out.println("This location does not exist.");
        }
        return location.getClosestCity(getCities());
    }

}
