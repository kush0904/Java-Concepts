package inheritance;

public class GrandParent {

    private String car_name;

    private boolean isRegistered;

    public GrandParent(String car_name){
        this.car_name = car_name;
    }

    public String getCar_name() {
        return car_name;
    }


    //registration
    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        this.isRegistered = registered;
    }
}
