package com.example.newsdataapp.repository;

import com.example.newsdataapp.model.NewsSource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsSourceDao extends JpaRepository<NewsSource, Integer> {
}
