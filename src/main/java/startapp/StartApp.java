package startapp;

import configuration.MyAppConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import resources.SaySomethingResource;

/**
 * Created by kati on 8/05/2017.
 */

public class StartApp extends Application<MyAppConfiguration> {

    public void run(MyAppConfiguration configuration, Environment e) throws Exception {
        //add new resource
        e.jersey().register(new SaySomethingResource());

    }


    public static void main(String[] args) throws Exception {
        new StartApp().run(args);
    }

}