package net.eisele.test.swarm.sample;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * REST Web Service
 *
 * @author myfear
 */
@Path("customer")
public class CustomerService {

    /**
     * Creates a new instance of CustomerService
     */
    public CustomerService() {
    }

    /**
     * Retrieves representation of an instance of
     * net.eisele.test.swarm.sample.CustomerService
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        JsonObject model = Json.createObjectBuilder()
                .add("firstName", "Markus")
                .add("lastName", "Eisele")
                .add("streetAddress", "Werner-von-Siemens-Ring 14")
                .add("city", "Grasbrunn")
                .add("pcode", "85630")
                .add("phoneNumbers", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder()
                                .add("type", "mobile")
                                .add("number", "111-111-1111"))
                        .add(Json.createObjectBuilder()
                                .add("type", "home")
                                .add("number", "222-222-2222")))
                .build();

        return model.toString();

    }

}
