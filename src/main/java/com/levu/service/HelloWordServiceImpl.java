package com.levu.service;

import com.levu.repository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWordServiceImpl implements HelloWordService {

    @Autowired
    private HelloWorldRepository repository;

    public String getNameFromDb() {
        return repository.getNameFromDb();
    }
}
