package abstraction;

public class Platform extends AbstractPlatforms {

    public Platform(String name) {
        super(name);
    }

    public String getPlatformName() {
        return getName();
    }

    @Override
    public void getAllPlatformDetails() {
        System.out.println("All Platforms Details");

        System.out.println("Name: " + getName());
        System.out.println("URL: " + getUrl());
        System.out.println("Country: " + getCountry());
        System.out.println("Founder: " + getFounder());
        System.out.println("Founder Date: " + getFounderDate());
    }
}
