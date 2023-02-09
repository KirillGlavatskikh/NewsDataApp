package com.example.newsdataapp.service.NewsTopic;

import com.example.newsdataapp.model.NewsTopic;
import com.example.newsdataapp.repository.NewsTopicDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsTopicServiceImpl implements NewsTopicService{

    private final NewsTopicDao newsTopicDao;
    @Override
    public List<NewsTopic> getAll() {
        return newsTopicDao.findAll();
    }
}
