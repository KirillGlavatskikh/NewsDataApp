package com.example.newsdataapp.controller;

import com.example.newsdataapp.model.NewsSource;
import com.example.newsdataapp.service.NewsSourceService.NewsSourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/source")
@RequiredArgsConstructor
public class NewsSourceController {

    private final NewsSourceService sourceService;

    @GetMapping("/all")
    public List<NewsSource> getAll() {
        return sourceService.getAll();
    }
}
