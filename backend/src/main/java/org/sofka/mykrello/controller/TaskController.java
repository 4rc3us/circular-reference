package org.sofka.mykrello.controller;

import org.sofka.mykrello.model.service.TaskService;
import org.sofka.mykrello.utilities.MyResponseUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(value = "*")
@RestController
public class TaskController {

    @Autowired
    private MyResponseUtility response;

    @Autowired
    private TaskService taskService;
//
//    @GetMapping(path = "/api/v1/task/{id}")
//    public ResponseEntity<MyResponseUtility> getTaskById(@PathVariable(value = "id") Integer id) {
//        response.data = taskService.findById(id);
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }

}
