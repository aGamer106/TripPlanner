public class Landmark extends Location{

    private String name;

    private int fee;

    private LandmarkType landmarkType;

    public Landmark(int x, int y, String name, int fee, LandmarkType landmarkType) {
        super(x, y);
        this.name = name;
        setNewFee(fee);
        this.landmarkType = landmarkType;
    }



    public void setNewFee(int newFee) {
        if(newFee < 0) {
            System.out.println("Not a positive value.");
        }
        else {
            this.fee = newFee;
        }
    }

}
