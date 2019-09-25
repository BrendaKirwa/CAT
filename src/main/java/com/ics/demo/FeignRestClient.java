package com.ics.demo;

import com.ics.demo.models.Attachment;
import com.ics.demo.models.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

//@FeignClient(name = "client", url = "http://10.51.10.111:9090")


@FeignClient(name = "client", url = "http://10.51.10.111:2000", configuration = FeignConfig.class)
public interface FeignRestClient {


    @RequestMapping(method = RequestMethod.POST, value = "students")
    Student registerStudent(@RequestBody Student student);

    @RequestMapping(method = RequestMethod.POST, value = "companies/{companyId}/attachments")
    Attachment requestAttachment(@PathVariable int companyId, @RequestParam(name = "studentId")Integer studentId);



    // @RequestMapping(method = RequestMethod.GET,value = "movies")
    //List<Movie> getAllMovies();

    //@RequestMapping(method = RequestMethod.GET,value = "movies/{id}")
    //Movie findById(@PathVariable(name = "id") Long id);

    //@RequestMapping(method = RequestMethod.POST, value = "movies")
    //Movie createMovie(@RequestBody Movie movie);

    //@RequestMapping(method = RequestMethod.PATCH, value = "movies/{id}")
    //Movie update(@PathVariable("id") Long id,@RequestBody Movie movie);


    //@RequestMapping(method = RequestMethod.GET, value = "students")
    //Student viewStudent(@RequestParam(name = "studentNumber")Long studentNumber);

    //@RequestMapping(method = RequestMethod.POST, value = "appointments")
    //Appointment createAppointment(@RequestBody Appointment appointment);

   // @RequestMapping(method = RequestMethod.PATCH, value = "appointments/{appointmentId}")
    //Appointment ConfirmAppointment(@PathVariable("appointmentId") Long id,@RequestParam(name = "studentId") Long studentId);




}
