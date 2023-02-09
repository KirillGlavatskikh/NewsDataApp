package com.example.newsdataapp.controller;

import com.example.newsdataapp.model.NewsTopic;
import com.example.newsdataapp.service.NewsTopic.NewsTopicService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/topic")
@RequiredArgsConstructor
public class NewsTopicController {

    private final NewsTopicService topicService;

    @GetMapping("/all")
    public List<NewsTopic> getAll(){
        return topicService.getAll();
    }
}
