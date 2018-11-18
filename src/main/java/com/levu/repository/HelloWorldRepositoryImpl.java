package com.levu.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloWorldRepositoryImpl implements HelloWorldRepository {

    public String getNameFromDb() {
        return "Hello Spring MVC -> Mr.Vu example";
    }
}
