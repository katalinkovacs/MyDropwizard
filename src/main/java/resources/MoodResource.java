package resources;

import representation.Mood;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/sebi")
public class MoodResource {

    private String yourmood;
    private String yourthing;
    private int yourscale;

    //constructor
    public  MoodResource(String yourmood, String yourthing, int yourscale){
        this.yourmood = yourmood;
        this.yourthing = yourthing;
        this.yourscale = yourscale;
    }


    @GET
    @Path("/mood1")
    @Produces(MediaType.APPLICATION_JSON)

    public Mood mood() throws IOException {
        return new Mood("sebi" , "good", 9);
    }

    @GET
    @Path("/mood2")
    @Produces(MediaType.APPLICATION_JSON)

    public Mood mood2() throws IOException {
        return new Mood("sebi" , yourmood, 4);
    }

    @GET
    @Path("/mood3")
    @Produces(MediaType.APPLICATION_JSON)

    public Mood mood3() throws IOException {
        return new Mood("sebi" , yourmood, yourscale);
    }





}
