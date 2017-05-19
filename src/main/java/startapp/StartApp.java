package startapp;

import configuration.MyAppConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import resources.DoSomethingResource;
import resources.SebisWorld;
import resources.SaySomethingResource;


public class StartApp extends Application<MyAppConfiguration> {

    //T --> MyAppConfiguration  --> java generics

    @Override
    public void run(MyAppConfiguration configuration, Environment e) throws Exception {

        String message = configuration.getMessage();
        String serverurl = configuration.getFtpserverurl();

        String doing = configuration.getDoing();
        String something = configuration.getSomething();

        String yourmood = configuration.getYourmood();
        String yourthing = configuration.getYourthing();
        int yourscale = configuration.getYourscale();

        String yourdrink = configuration.getYourdrink();
        String yourfood = configuration.getYourfood();
        String yourdessert = configuration.getYourdessert();



        //add new resource --> SaySomethingResource
        e.jersey().register(new SaySomethingResource(message, serverurl));

        //add new resource --> DoSomethingResource
        e.jersey().register(new DoSomethingResource(doing, something));

        e.jersey().register(new SebisWorld(yourmood, yourthing, yourscale));

        e.jersey().register(new SebisWorld(yourdrink, yourfood, yourdessert));


    }


    public static void main(String[] args) throws Exception {
        new StartApp().run(args);
    }

}