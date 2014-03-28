package first;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by 1 on 27.03.2014.
 */
@Path("/hello")
public class Hello {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPlainTextHello(){
        return "Xx1xxxxxxX";
    }

    @GET
    @Produces(MediaType.TEXT_XML)
    public String sayXMLHello(){
        return "<?xml version=\"1.0\"?>"+"<hello>Готово xml</hello>";
    }


}
