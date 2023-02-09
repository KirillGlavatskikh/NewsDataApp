package com.example.newsdataapp.model;

import com.example.newsdataapp.repository.NewsDao;
import com.example.newsdataapp.repository.TaskDao;
import com.example.newsdataapp.service.NewsService.NewsServiceImpl;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.List;

@Component
@RequiredArgsConstructor
public class Task implements Runnable {

    private final TaskDao taskDao;
    private static final String PATH_IRBIS_PLUS_FILE = "D:/NewsDataApp/src/main/java/com/example/newsdataapp/file/irbis.plus.csv";
    private static final String PATH_PRAKTIKA_IRBIS_PLUS_FILE = "D:/NewsDataApp/src/main/java/com/example/newsdataapp/file/praktika.irbis.plus.csv";

    @Override
    public void run() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH_IRBIS_PLUS_FILE))) {
            List<String> countContentByTopic = taskDao.findCountContentByTopic();
            oos.writeObject(countContentByTopic);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}