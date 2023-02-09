package com.example.newsdataapp.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class TaskDao {

    @PersistenceContext
    private EntityManager entityManager;

    private final String FIND_COUNT_CONTENT_BY_TOPIC = "SELECT CONCAT(nt.name, ',', COUNT(News.content)) " +
            "FROM News, NewsTopic nt, NewsSource ns " +
            "WHERE News.topic.id = nt.id AND ns.id = News.source.id AND ns.name = 'irbis.plus' GROUP BY nt.name";


    public List<String> findCountContentByTopic(){
       Query query = entityManager.createQuery(FIND_COUNT_CONTENT_BY_TOPIC);
       return Collections.singletonList(query.getResultList().toString());
    }
}
