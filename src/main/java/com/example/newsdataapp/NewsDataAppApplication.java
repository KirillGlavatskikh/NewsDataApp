package com.example.newsdataapp;

import com.example.newsdataapp.model.Task;
import com.example.newsdataapp.repository.NewsDao;
import com.example.newsdataapp.repository.TaskDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewsDataAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsDataAppApplication.class, args);
        Task task = new Task(new TaskDao());
        task.run();
    }

}
