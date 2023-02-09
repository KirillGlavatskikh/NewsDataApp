package com.example.newsdataapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "news_topic")
public class NewsTopic {

    @Id
    private Integer id;
    @Column(name = "name")
    private String name;
}
