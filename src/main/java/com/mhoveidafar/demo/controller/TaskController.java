package com.mhoveidafar.demo.controller;

import com.mhoveidafar.demo.models.Task;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @PostMapping(value = "/{name}")
    public ResponseEntity<UUID> addTask(@PathVariable String name, @RequestBody String description) {
        Task task = new Task(name, description);

        return new ResponseEntity(task.getId(), HttpStatus.OK);
        // another way of return
        // return ResponseEntity.ok(task.getId());
    }
}
