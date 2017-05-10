package representation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by kati on 8/05/2017.
 */
public class Employee {

    private String fname;

    private String lname;


    public Employee(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    @JsonProperty
    public String getFname() {
        return fname;
    }

    @JsonProperty
    public String getLname() {
        return lname;
    }

}
