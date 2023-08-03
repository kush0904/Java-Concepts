package abstraction;

public interface SocialMediaPlatform {

    String COMPLETE_NAME = "Abstract Platforms";

    String getName();

    void setUrl(String url);
    String getUrl();

    void setCountry(String country);
    String getCountry();

    void setFounder(String founder);
    String getFounder();

    void setFounderDate(String founderDate);
    String getFounderDate();
}
