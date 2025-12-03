package com.shinki.athena.resource;

import com.shinki.athena.dto.UserDTO;
import com.shinki.athena.entity.User;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/auth")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AuthResource {

    @POST
    @Path("/register")
    @Transactional
    public Response register(@NotNull(message = "The body cannot be empty") @Valid UserDTO dto) {
        if (User.findByEmail(dto.email()) != null) {
            return Response.status(400).entity("Email already registered").build();
        }

        User newUser = new User();
        newUser.name = dto.name();
        newUser.email = dto.email();
        // TODO: password with Bcript
        newUser.password = dto.password();

        newUser.persist();

        return Response.status(200).entity(newUser).build();
    }
}
