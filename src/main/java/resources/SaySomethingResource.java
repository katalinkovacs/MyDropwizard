package resources;

import representation.SaySomething;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

/**
 * Created by kati on 8/05/2017.
 */


@Path("/saysomething")
@Produces(MediaType.APPLICATION_JSON)

public class SaySomethingResource {

    @GET
    public SaySomething saySomething() throws IOException {
        // return new SayHello("greetings" , fileZillaClient.getFileFromFTPServer());
        return new SaySomething("welcome" , "Kati");
    }


}
