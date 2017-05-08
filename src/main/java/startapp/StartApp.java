package startapp;

import io.dropwizard.setup.Environment;
import resources.SaySomethingResource;

/**
 * Created by kati on 8/05/2017.
 */

public class StartApp {

    public void run( Environment e) throws Exception {

        //add new resource
        e.jersey().register(new SaySomethingResource());

    }


    public static void main(String[] args) throws Exception {
        new StartApp().run(args);
    }

}