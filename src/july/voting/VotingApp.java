package july.voting;

public class VotingApp {

    public static void main(String[] args) {
        Name name = new Name();
        if (name.takeInput()) {
            Age age = new Age();
            if (age.takeAgeInput()) {
                Country country = new Country();
                country.takeCountryInput();
            }
        }
    }
}
