/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.User;
import service.UserService;

/**
 *
 * @author spaceman33
 */
/**
 * Questa classe servirà ad implementare i controlli della classe, ovvero i
 * metodi come GET, PUT, POST, DELETE Perciò serviranno le annotazioni di
 * JakartaEE come
 *
 * @PATH ad indicare l'indirizzo al quale risponde/richiede
 * @GET @POST @PUT @DELETE Se passiamo dei file in formato JSON annotteremo con:
 * @Produces -> Ovvero che risponde con un file in formato.JSON
 * @Consumes -> Ovvero che richiede un file in formato.JSON
 */
@Path("/test")
public class UsersController {

    @Inject
    UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public void getUser(User user) {
        userService.getAllUsers();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void addUser(User user) {
        userService.addUser(user);
    }

}
