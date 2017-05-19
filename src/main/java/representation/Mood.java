package representation;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Mood {

    private String person;

    private String mood;

    private int scale;


    public Mood(String person, String mood, int scale) {
        this.person = person;
        this.mood = mood;
        this.scale = scale;
    }

    @JsonProperty
    public String getPerson() {
        return person;
    }

    @JsonProperty
    public String getMood() {
        return mood;
    }

    @JsonProperty
    public int getScale() {
        return scale;
    }
}
