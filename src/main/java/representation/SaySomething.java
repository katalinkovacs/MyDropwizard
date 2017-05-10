package representation;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SaySomething {

    private String message;

    private String name;


    public SaySomething(String message, String name) {
        this.message = message;
        this.name = name;
    }

    @JsonProperty
    public String getMessage() {
        return message;
    }

    @JsonProperty
    public String getName() {
        return name;
    }

}
