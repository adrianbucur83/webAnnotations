package com.scoalainformala.webAnnotations;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;

@RestController
@Controller
public class StudentController {

    @GetMapping(value = "/students/{id}")
    @RequestMapping(value = "/students", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public String sayHi(@PathVariable String name){

        return "Hello Student " + name;
    }

    @PutMapping(value = "/students")
    @RequestMapping(value = "/students", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteSomething(@RequestParam String studentId){
        return "deleted from the server student id: " + studentId;
    }


    @PostMapping(value = "/students/newData")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ResponseBody
    public String addStudent(){
        return "Added a student ";
    }



}
