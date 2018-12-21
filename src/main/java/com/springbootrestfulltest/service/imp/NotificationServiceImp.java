package com.springbootrestfulltest.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springbootrestfulltest.pojo.Notification;
import com.springbootrestfulltest.repo.NotificationRepo;
import com.springbootrestfulltest.service.NotificationService;

@Component
public class NotificationServiceImp implements NotificationService{
	
	
	@Autowired
	private NotificationRepo notificationRepo;

	@Override
	public List<Notification> findAll() throws Exception{
		return  (List<Notification>) notificationRepo.findAll();
	}

	@Override
	public Notification findById(int id) throws Exception {
		return notificationRepo.findById(id).get();
	}

	@Override
	public Notification save(Notification notification) throws Exception {
		return notificationRepo.save(notification);
	}

	@Override
	public void deleteById(int id) throws Exception {
		notificationRepo.deleteById(id);
		
	}

}
