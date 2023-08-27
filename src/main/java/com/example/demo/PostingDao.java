package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostingDao extends JpaRepository<PostingEntity,Integer> {

}
