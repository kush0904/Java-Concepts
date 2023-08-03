package july.rocket;


class WeatherCheck implements RocketCheck {
    private boolean isWeatherOk;

    public WeatherCheck(boolean isWeatherOk) {
        this.isWeatherOk = isWeatherOk;
    }

    @Override
    public boolean isCheckPassed() {
        return isWeatherOk;
    }

    @Override
    public String getCheckDescription() {
        return "Weather Check";
    }
}