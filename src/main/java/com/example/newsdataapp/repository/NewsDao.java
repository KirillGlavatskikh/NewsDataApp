package com.example.newsdataapp.repository;

import com.example.newsdataapp.model.News;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NewsDao extends JpaRepository<News, Integer> {
    @Query("SELECT n FROM News n, NewsSource ns WHERE ns.id = n.source.id AND ns.name = :source")
    List<News> findAllBySource(String source, PageRequest pageRequest);

    @Query("SELECT n FROM News n, NewsTopic nt WHERE nt.id = n.topic.id AND nt.name = :topic")
    List<News> findAllByTopic(String topic, PageRequest pageRequest);
}
