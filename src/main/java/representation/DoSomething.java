package representation;

import com.fasterxml.jackson.annotation.JsonProperty;


public class DoSomething {

    private String doing;

    private String something;


    public DoSomething(String doing, String something) {
        this.doing = doing;
        this.something = something;
    }

    @JsonProperty
    public String getDoing() {
        return doing;
    }

    @JsonProperty
    public String getSomething() {
        return something;
    }

}
