package inheritance;

public class Father extends GrandParent {


    public boolean reregistration;

    public boolean isReregistration() {
        return reregistration;
    }

    public void setReregistration(boolean reregistration) {
        this.reregistration = reregistration;
    }

    public Father(String car_name) {
        super(car_name);
    }
}
