package com.example.newsdataapp.repository;

import com.example.newsdataapp.model.NewsTopic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsTopicDao extends JpaRepository<NewsTopic, Integer> {
}
