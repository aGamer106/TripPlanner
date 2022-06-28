import java.util.ArrayList;
import java.util.List;

public class UserLocation extends Location{

    private List<UserLocation> locationsHistory;

    public UserLocation(int x, int y) {
        super(x, y);
        this.locationsHistory = new ArrayList<>();
    }

    public void setNewLocation(int x, int y) {
        locationsHistory.add(this);
        this.x = x;
        this.y = y;

    }

    public List<UserLocation> getLocationsHistory() {
        return locationsHistory;
    }
}
