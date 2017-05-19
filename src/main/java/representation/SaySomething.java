package representation;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SaySomething {

    private String greetings;

    private String people;


    public SaySomething(String greetings, String people) {
        this.greetings = greetings;
        this.people = people;
    }

    @JsonProperty
    public String getGreetings() {
        return greetings;
    }

    @JsonProperty
    public String getPeople() {
        return people;
    }

}
