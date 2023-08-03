package abstraction;

public abstract class AbstractPlatforms implements SocialMediaPlatform {

    private String name;
    private String url;
    private String country;
    private String founder;
    private String founderDate;

    public AbstractPlatforms(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getFounderDate() {
        return founderDate;
    }

    public void setFounderDate(String founderDate) {
        this.founderDate = founderDate;
    }

    public abstract void getAllPlatformDetails();
}
