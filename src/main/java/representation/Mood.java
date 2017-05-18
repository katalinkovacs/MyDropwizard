package representation;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Mood {

    private String person;

    private String mood;


    public Mood(String person, String mood) {
        this.person = person;
        this.mood = mood;
    }

    @JsonProperty
    public String getPerson() {
        return person;
    }

    @JsonProperty
    public String getMood() {
        return mood;
    }
}
