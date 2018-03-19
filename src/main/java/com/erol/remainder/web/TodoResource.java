package com.erol.remainder.web;

import com.erol.remainder.domain.TodoService;
import com.erol.remainder.web.data.RemainderDTO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Path("remainders")
@Produces("application/json")
@Consumes("application/json")
public class TodoResource {

    private TodoService todoService;

    @GET
    public Response getRemainders(){

        List<RemainderDTO> remainderDTOList = Arrays.asList(RemainderDTO.builder().build());
        return Response.ok(remainderDTOList).build();

    }

    @GET
    public Response getRemainderById(@PathParam("id") UUID id){

        RemainderDTO remainderDto = RemainderDTO.builder().build();
        return Response.ok(remainderDto).build();

    }
}
