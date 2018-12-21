package com.springbootrestfulltest.repo;

import org.springframework.data.repository.CrudRepository;

import com.springbootrestfulltest.pojo.Notification;

public interface NotificationRepo extends CrudRepository<Notification, Integer> {

}
