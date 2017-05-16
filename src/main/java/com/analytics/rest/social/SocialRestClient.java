package com.analytics.rest.social;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.analytics.domain.fb.Datum;
import com.analytics.domain.fb.FbFeed;
import com.analytics.domain.fb.FbGroupFeedDomain;

@Component
public class SocialRestClient {
	
	
	private final String fbGroupFeedRequest = "https://graph.facebook.com/v2.8/1234567890/feed?"; // Mention your group id in place of 1234567890
	private final String fields = "id,message,updated_time,created_time,likes.limit(1000).summary(true),comments.limit(100).summary(true),shares,from,attachments";
	private final String fbAccessToken ="XXXXXXXXXXXXXXX"; //Replace with your app's fbAccessToken
	private final String limit = "100";
	
	private static final Logger logger = LoggerFactory.getLogger(SocialRestClient.class);
		
	public FbFeed getFacebookGroupFeed(String sinceTs, String untilTs) throws Exception {
		
		
		String groupFeedFullRequestUrl;
		try {
			
			RestTemplate rt = new RestTemplate();
			MultiValueMap<String, Object> headers = new LinkedMultiValueMap<String, Object>();
	        headers.add("Accept", "application/json");
		    headers.add("Content-Type", "application/json");
	    	HttpEntity entity = new HttpEntity(headers);
	    	
			groupFeedFullRequestUrl = fbGroupFeedRequest+"fields="+fields+"&access_token="+fbAccessToken+"&since="+sinceTs+"&limit="+limit+"&until="+untilTs;
				    	
	    	String nextPagingUrl = groupFeedFullRequestUrl;
	    	List<Datum> feed = new ArrayList<Datum>();
	    	
	    	while(nextPagingUrl != null) {
	    		
		    	
		    	ResponseEntity<FbGroupFeedDomain> response = rt.exchange(nextPagingUrl, HttpMethod.GET, entity, FbGroupFeedDomain.class);
		    	if(CollectionUtils.isEmpty(response.getBody().getData())) {
		    		break;
		    	}
		    	feed.addAll(response.getBody().getData());
		    	nextPagingUrl = response.getBody().getPaging().getNext();
		    	
		    	nextPagingUrl = java.net.URLDecoder.decode(response.getBody().getPaging().getNext(), "UTF-8");
		    
	    	}
	    	
	    	System.out.println("Total posts received : " + feed.size());
	    	
	    	FbFeed finalFeed = new FbFeed();
	    	finalFeed.setFeed(feed);
	    	return finalFeed;
    	
		}catch(Exception e) {
			e.printStackTrace();
	   }
	  return null;	
	}
	
	
		    
}
