package com.ics.demo;

import com.ics.demo.models.Attachment;
import com.ics.demo.models.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TestingRest implements CommandLineRunner {

    private final FeignRestClient feignRestClient;

    public TestingRest(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }


    @Override
    public void run(String... args) throws Exception {
            RestTemplate restTemplate = new RestTemplate();
//
//            ResponseEntity<List<Movie>> response = restTemplate.exchange(
//                    "http://10.51.10.111:9090/movies",
//                    HttpMethod.GET,
//                    null,
//                    new ParameterizedTypeReference<List<Movie>>() {}
//            );
//            List<Movie> movies = response.getBody();
//            //System.out.println(movies.toString());
//
//
//            Movie movie = restTemplate.getForObject(
//                    "http://10.51.10.111:9090/movies/4",
//                    Movie.class
//            );
            //System.err.println(movie.toString());

//            String url = "http://10.51.10.111:9090/movies/search?name=" +movie.getName();
//            Movie movieByName = restTemplate.getForObject(
//                    url,
//                    Movie.class
//            );
            //System.err.println(movie.toString());


//        Movie newmovie=new Movie("IT","2019");
//        newmovie=feignRestClient.createMovie(newmovie);
//        System.out.println("Created Movie"+newmovie.toString());

//        movies=feignRestClient.getAllMovies();
//        System.err.println(movies.toString());
//
//          Movie updatemovie=new Movie("IT2","2019");
//          updatemovie=feignRestClient.update((long)11,updatemovie);
//          System.out.println("updated"+updatemovie.toString());

        //Student student =new Student(95244,"Me");
        //feignRestClient.createStudent(student);

        //feignRestClient.viewStudent((long) 90001);

        Attachment attachments = feignRestClient.requestAttachment(5,95244);
        System.out.println("Attachment:" + attachments);




        //feignRestClient.createStudent(student);
//        System.err.println("Created Appointment"+newappAppointment.toString());

       // Student student = feignexample.createStudent(
         //      new Student(9000,
           //            "B"));



        }
    }
