package com.example.newsdataapp.service.NewsSourceService;

import com.example.newsdataapp.model.NewsSource;
import com.example.newsdataapp.repository.NewsSourceDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsSourceServiceImpl implements NewsSourceService{

    private final NewsSourceDao newsSourceDao;
    @Override
    public List<NewsSource> getAll() {
        return newsSourceDao.findAll();
    }
}
