package com.analytics.service.fb.impl;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.analytics.domain.fb.Datum;
import com.analytics.domain.fb.FbFeed;
import com.analytics.rest.social.SocialRestClient;
import com.analytics.service.fb.FbDataPopulateService;

@Service
public class FbDataPopulateServiceImpl implements FbDataPopulateService{
	
	@Autowired
	private SocialRestClient socialRestClient;
	
	/**
	 * Fetching Facebook posts of the group for the last 24 hours
	 */
	@Override
	@Transactional
	public void getFacebookFeedData() {
		
		try {
		Long currentTs = new Long(Math.round(System.currentTimeMillis() / 1000));	
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR, -1);
		Long tsOneDayAgo = new Long(cal.getTimeInMillis()/1000);
			
		FbFeed fbFeed = socialRestClient.getFacebookGroupFeed(tsOneDayAgo.toString(),currentTs.toString());
		
		for(Datum data : fbFeed.getFeed()) {
			System.out.println(data.getId() +  " - " + data.getFrom().getName() + " - " + data.getMessage());
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		//return null;
	}
	
	
	
}
