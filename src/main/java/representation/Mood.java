package representation;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Mood {

    private String mood;
    private int scale;


    public Mood(String mood, int scale) {
        this.mood = mood;
        this.scale = scale;
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
