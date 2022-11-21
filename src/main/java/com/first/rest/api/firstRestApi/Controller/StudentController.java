package com.first.rest.api.firstRestApi.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import  com.first.rest.api.firstRestApi.model.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class StudentController {

    //http://localhost:8081/student
    @GetMapping("/student")
    public student getStudent(){
        return  new student("ayham","alkhalaf");
    }

    //http://localhost:8081/students
    @GetMapping("/students")
    public List<student> getStudents(){

        List <student>  students = new ArrayList<>();

        students.add(new student("ayham", "alkhalaf"));
        students.add(new student("asmaa", "albosh"));
        students.add(new student("tya", "alkhalaf"));
        students.add(new student("aesha", "shhada"));
        students.add(new student("ali", "alkhalaf"));

        return students;
    }

    //http://localhost:8081/firstName/lastName
    //ex: http://localhost:8081/tya/alkhalaf
    //@pathVaribale annothion
    @GetMapping("{firstName}/{lastName}")
    public student studentPathVriable(@PathVariable("firstName")  String firstName,
                                      @PathVariable("lastName")  String lastName) {
        return  new student(firstName, lastName);
    }

    //http://localhost:8081/student/firstName/lastName
    //ex: http://localhost:8081/student/tya/alkhalaf
    //@pathVaribale annothion
    @GetMapping("/student/{firstName}/{lastName}")
    public student studentsPathVriable(@PathVariable("firstName")  String firstName,
                                      @PathVariable("lastName")  String lastName) {
        return  new student(firstName, lastName);
    }

    //build rest API to handle query parameters
    //http://localhost:8081/student/query?firstName=ali&lastName=alkhalaf
    @GetMapping("/student/query")
    public student  studentQueryParam(@RequestParam(name ="firstName") String firstName ,
                                      @RequestParam(name ="lastName") String lastName){
        return new student(firstName , lastName);
    }


}
