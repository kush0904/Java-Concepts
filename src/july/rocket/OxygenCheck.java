package july.rocket;

class OxygenCheck implements RocketCheck {
    private boolean isOxygenAvailable;

    public OxygenCheck(boolean isOxygenAvailable) {
        this.isOxygenAvailable = isOxygenAvailable;
    }

    @Override
    public boolean isCheckPassed() {
        return isOxygenAvailable;
    }

    @Override
    public String getCheckDescription() {
        return "Oxygen Check";
    }
}