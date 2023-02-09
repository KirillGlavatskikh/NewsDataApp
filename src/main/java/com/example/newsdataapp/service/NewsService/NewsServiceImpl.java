package com.example.newsdataapp.service.NewsService;

import com.example.newsdataapp.model.News;
import com.example.newsdataapp.repository.NewsDao;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {

    private final NewsDao newsDao;
    @Override
    public List<News> getAllNews(PageRequest pageRequest) {
        Page<News> getPage = newsDao.findAll(pageRequest);
        return getPage.getContent();
    }

    @Override
    public List<News> getAllNewsBySource(String source, PageRequest pageRequest) {
        return newsDao.findAllBySource(source, pageRequest);
    }

    @Override
    public List<News> getAllNewsByTopic(String topic, PageRequest pageRequest) {
        return newsDao.findAllByTopic(topic, pageRequest);
    }
}
