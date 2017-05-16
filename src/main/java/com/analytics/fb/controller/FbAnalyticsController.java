package com.analytics.fb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.analytics.service.fb.FbDataPopulateService;

@Controller
@RequestMapping("/data")
public class FbAnalyticsController {


	@Autowired
	private FbDataPopulateService fbDataPopulateService;

	@RequestMapping(method= RequestMethod.GET, value="fetch")
	public @ResponseBody String getFacebookFeedAndPopulateHistoricalData() {
		
		fbDataPopulateService.getFacebookFeedData();
		return null;
		
	}
	
		
}
