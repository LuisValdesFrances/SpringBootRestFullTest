package com.springbootrestfulltest.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbootrestfulltest.pojo.Notification;
import com.springbootrestfulltest.service.NotificationService;

@org.springframework.web.bind.annotation.RestController

@RequestMapping("/SpringBootTest/Notification/api/v1")
public class NotificationController {
	
	@Autowired
	private NotificationService notificationService;
	
	@RequestMapping(value = "/getAllNotification", method = RequestMethod.GET)
	public ResponseEntity<Collection<Notification>> getAllNotification() {
		
		List<Notification> nList = null;
		
		try {
			nList = (List<Notification>) notificationService.findAll();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(nList == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}else if(nList.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<Collection<Notification>>(nList, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/getNotification/{id}", method = RequestMethod.GET)
	public ResponseEntity<Notification> getNotification(
			@PathVariable("id") int id) {
		
		Notification n = null;
		
		try {
			n = notificationService.findById(id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(n == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Notification>(n, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/deleteNotification/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteNotification(@PathVariable("id") Integer id) {
		
		try {
			notificationService.deleteById(id);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/addNotification", method = RequestMethod.POST)
	public ResponseEntity<Notification> addNotification(
			@RequestBody Notification notification) {
		
		Notification n = null;
		try {
			n = notificationService.save(notification);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if (n == null) {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
		
		return new ResponseEntity<Notification>(n, HttpStatus.CREATED);
	}
	
	
	@RequestMapping(value = "/updateNotification", method = RequestMethod.PUT)
	public ResponseEntity<Notification> updateNotification(
			@RequestBody Notification notification) {
		
		
		Notification n = null;
		Notification save = null;
		
		try {
			n = notificationService.findById(notification.getId());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(n == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		try {
			save = notificationService.save(notification);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if (save == null) {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
		
		return new ResponseEntity<Notification>(save, HttpStatus.OK);
	}

}
