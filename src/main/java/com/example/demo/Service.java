package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private final Dao dao;
    @Autowired
    private final PostingDao postingDao;



    public Service (Dao dao,PostingDao postingDao){
        this.dao=dao;
        this.postingDao=postingDao;
    }

    public List<Entity> getQuestions() {
        return dao.findAll();
    }

    public PostingEntity PostQuestion(PostingEntity postingEntity){
        return postingDao.save(postingEntity);
    }
}
