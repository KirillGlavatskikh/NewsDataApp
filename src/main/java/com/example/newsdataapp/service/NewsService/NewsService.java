package com.example.newsdataapp.service.NewsService;

import com.example.newsdataapp.model.News;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface NewsService {
    List<News> getAllNews(PageRequest pageRequest);

    List<News> getAllNewsBySource(String source, PageRequest pageRequest);

    List<News> getAllNewsByTopic(String topic, PageRequest pageRequest);
}
