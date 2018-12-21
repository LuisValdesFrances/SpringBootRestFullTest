package com.springbootrestfulltest.service;

import java.util.List;

import com.springbootrestfulltest.pojo.Notification;

public interface NotificationService {
	
	/**
	 * Get all notifications
	 * @return
	 * @throws Exception
	 */
	public List<Notification> findAll() throws Exception;
	
	/**
	 * Find one notification by id
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Notification findById(int id)  throws Exception;
	
	/**
	 * Delete one notification by id
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(int id) throws Exception;
	
	/**
	 * Save one notification
	 * @param notification
	 * @return
	 * @throws Exception
	 */
	public Notification save(Notification notification) throws Exception;
}
