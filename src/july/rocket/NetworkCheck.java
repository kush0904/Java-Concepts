package july.rocket;


class NetworkCheck implements RocketCheck {
    private boolean isNetworkOk;

    public NetworkCheck(boolean isNetworkOk) {
        this.isNetworkOk = isNetworkOk;
    }

    @Override
    public boolean isCheckPassed() {
        return isNetworkOk;
    }

    @Override
    public String getCheckDescription() {
        return "Network Check";
    }
}