CREATE TABLE news(
    id SERIAL NOT NULL PRIMARY KEY,
    source_id INTEGER NOT NULL REFERENCES news_source(id),
    topic_id INTEGER NOT NULL REFERENCES news_topic(id),
    content VARCHAR(1000) NOT NULL
)