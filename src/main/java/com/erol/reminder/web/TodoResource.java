package com.erol.reminder.web;

import com.erol.reminder.domain.TodoService;
import com.erol.reminder.web.data.ReminderDTO;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.*;

@Path("reminders")
@Produces("application/json")
@Consumes("application/json")
public class TodoResource {

    private TodoService todoService;

    @GET
    public Response getReminders(){

        List<ReminderDTO> reminderDTOList = Arrays.asList(ReminderDTO.builder().build());

        Map<String, String > someMap = new HashMap<>();
        someMap.hashCode();
        return Response.ok(reminderDTOList).build();

    }

    @GET
    public Response getReminderById(@PathParam("id") UUID id){

        ReminderDTO reminderDto = ReminderDTO.builder().build();
        return Response.ok(reminderDto).build();

    }
}
