package startapp;

import configuration.MyAppConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import resources.SebisWorld;
import resources.SaySomethingResource;


public class StartApp extends Application<MyAppConfiguration> {

    //T --> MyAppConfiguration  --> java generics

    @Override
    public void run(MyAppConfiguration configuration, Environment e) throws Exception {

        String message = configuration.getMessage();
        String serverurl = configuration.getFtpserverurl();

        String yourdrink = configuration.getYourdrink();
        String yourfood = configuration.getYourfood();
        String yourdessert = configuration.getYourdessert();



        //add new resource --> SaySomethingResource
        e.jersey().register(new SaySomethingResource(message, serverurl));

        e.jersey().register(new SebisWorld());


    }


    public static void main(String[] args) throws Exception {
        new StartApp().run(args);
    }

}