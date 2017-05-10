package representation;

import com.fasterxml.jackson.annotation.JsonProperty;


public class DoSomething {

    private String verb;

    private String item;


    public DoSomething(String verb, String item) {
        this.verb = verb;
        this.item = item;
    }

    @JsonProperty
    public String getVerb() {
        return verb;
    }

    @JsonProperty
    public String getItem() {
        return item;
    }

}
