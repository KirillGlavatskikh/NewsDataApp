package com.example.newsdataapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "source_id", referencedColumnName = "id")
    private NewsSource source;
    @ManyToOne
    @JoinColumn(name = "topic_id", referencedColumnName = "id")
    private NewsTopic topic;
    @Column(name = "content")
    private String content;
}
