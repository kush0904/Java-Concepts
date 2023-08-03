
package july.rocket;

public class FuelCheck implements RocketCheck {
    private boolean isFuelOk;

    public FuelCheck(boolean isFuelOk) {
        this.isFuelOk = isFuelOk;
    }

    @Override
    public boolean isCheckPassed() {
        return isFuelOk;
    }

    @Override
    public String getCheckDescription() {
        return "Fuel Check";
    }
}