package representation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by kati on 8/05/2017.
 */
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
