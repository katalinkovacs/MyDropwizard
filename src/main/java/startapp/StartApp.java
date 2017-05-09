package startapp;

import configuration.MyAppConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import resources.DoSomethingResource;
import resources.EmployeeResource;
import resources.SaySomethingResource;

/**
 * Created by kati on 8/05/2017.
 */

public class StartApp extends Application<MyAppConfiguration> {

    public void run(MyAppConfiguration configuration, Environment e) throws Exception {

        String message = configuration.getMessage();
        String serverurl = configuration.getFtpserverurl();
        //add new resource --> SaySomethingResource
        e.jersey().register(new SaySomethingResource(message, serverurl));

        //add new resource --> DoSomethingResource
        e.jersey().register(new DoSomethingResource());

        //add new resource --> EmployeeResource
        e.jersey().register(new EmployeeResource());
    }


    public static void main(String[] args) throws Exception {
        new StartApp().run(args);
    }

}