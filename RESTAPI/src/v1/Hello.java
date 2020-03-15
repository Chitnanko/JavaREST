package v1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Path("/hello")
public class Hello extends Application{

	@GET
	@Produces(javax.ws.rs.core.MediaType.TEXT_HTML)
	public String sayHello() {
		String resource="<h6>Hello</h6>";
		return resource;
	}
	
}
