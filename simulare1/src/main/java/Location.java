import java.util.List;

public abstract class Location {

    protected int x;

    protected int y;



    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public City getClosestCity(List<City> cities) {
        int minDistance = -1;
        int i = 0;
        City foundCity = null;
        for (City city : cities) {
            int val = (int) (Math.pow((x - city.x), 2) + Math.pow((y - city.y), 2));
            if (i == 0) {
                minDistance = val;
                i++;
            }
            else if (Math.pow(minDistance, 2) > val) {
                minDistance = val;
                foundCity = city;
            }
        }
        return foundCity;
    };
}
