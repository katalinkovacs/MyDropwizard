package resources;

import representation.DoSomething;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;



@Path("/dosomething")
@Produces(MediaType.APPLICATION_JSON)

public class DoSomethingResource {


    private String doing;
    private String something;

    public  DoSomethingResource(String doing, String something){
        this.doing = doing;
        this.something = something;
    }


    public String getDoing() {
        return doing;
    }

    public void setDoing(String doing) {
        this.doing = doing;
    }

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }


    @GET
    public DoSomething doSomething() throws IOException {
        // return new DoSomething("cooking" , "dinner");
        return new DoSomething("cooking", "dinner");
    }


    @GET
    @Path("/singing")
    public DoSomething doSomethingSing() throws IOException {
        return new DoSomething("singing", something);
    }


}
