package resources;

import representation.Employee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

/**
 * Created by kati on 8/05/2017.
 */

@Path("/employee")
@Produces(MediaType.APPLICATION_JSON)

public class EmployeeResource {

    @GET
    public Employee employee() throws IOException {
        // return new Employee("cooking" , "dinner");
        return new Employee("Katalin", "Kovacs");
    }

}
