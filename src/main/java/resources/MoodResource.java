package resources;

import representation.Mood;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/mood")
public class MoodResource {

    private String yourmood;
    private String yourthing;

    //constructor
    public  MoodResource(String yourmood, String yourthing){
        this.yourmood = yourmood;
        this.yourthing = yourthing;
    }



    @GET
    @Path("/sebi")
    @Produces(MediaType.APPLICATION_JSON)

    public Mood mood() throws IOException {
        return new Mood("sebi" , "good");
    }

    GET
    @Path("/sebi2")
    @Produces(MediaType.APPLICATION_JSON)

    public Mood mood2() throws IOException {
        return new Mood("sebi" , yourmood);
    }





}
