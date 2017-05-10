package startapp;

import configuration.MyAppConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import resources.DoSomethingResource;
import resources.SaySomethingResource;



public class StartApp extends Application<MyAppConfiguration> {

    public void run(MyAppConfiguration configuration, Environment e) throws Exception {

        String message = configuration.getMessage();
        String serverurl = configuration.getFtpserverurl();

        String doing = configuration.getDoing();
        String something = configuration.getSomething();

        //add new resource --> SaySomethingResource
        e.jersey().register(new SaySomethingResource(message, serverurl));

        //add new resource --> DoSomethingResource
        e.jersey().register(new DoSomethingResource(doing, something));


}


    public static void main(String[] args) throws Exception {
        new StartApp().run(args);
    }

}