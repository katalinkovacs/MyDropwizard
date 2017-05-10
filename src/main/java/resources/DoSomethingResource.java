package resources;

import representation.DoSomething;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

/**
 * Created by kati on 8/05/2017.
 */

@Path("/dosomething")
@Produces(MediaType.APPLICATION_JSON)

public class DoSomethingResource {

    @GET
    public DoSomething doSomething() throws IOException {
        // return new DoSomething("cooking" , "dinner");
        return new DoSomething("cooking", "dinner");
    }



}
