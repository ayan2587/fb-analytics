package com.analytics.domain.fb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FbFeed {

	private List<Datum> feed = new ArrayList<Datum>();

	public List<Datum> getFeed() {
		return feed;
	}

	public void setFeed(List<Datum> feed) {
		this.feed = feed;
	}
	
}
