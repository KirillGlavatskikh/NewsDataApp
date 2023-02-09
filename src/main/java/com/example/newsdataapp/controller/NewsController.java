package com.example.newsdataapp.controller;

import com.example.newsdataapp.model.News;
import com.example.newsdataapp.service.NewsService.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
@RequiredArgsConstructor
public class NewsController {

    private final NewsService newsService;

    @GetMapping("/all")
    public List<News> getAllNews(
            @RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false, defaultValue = "4") int size
    ){
        return newsService.getAllNews(PageRequest.of(page, size));
    }

    @GetMapping("/allbysource/{source}")
    public List<News> getAllNewsBySource(
            @PathVariable String source,
            @RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false, defaultValue = "1") int size
    ){
        return newsService.getAllNewsBySource(source, PageRequest.of(page, size));
    }

    @GetMapping("/allbytopic/{topic}")
    private List<News> getAllNewsByTopic(
            @PathVariable String topic,
            @RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false, defaultValue = "2") int size
    ){
        return newsService.getAllNewsByTopic(topic, PageRequest.of(page, size));
    }
}
