package com.quartz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quartz.model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message,Integer> {

}
