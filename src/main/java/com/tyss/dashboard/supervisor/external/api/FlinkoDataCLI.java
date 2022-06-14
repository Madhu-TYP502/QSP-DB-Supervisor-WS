package com.tyss.dashboard.supervisor.external.api;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FlinkoDataCLI {

	 private static final String uri = "https://gorest.co.in/public/v2/users";
	    public String getStudents()
		{
		    return new RestTemplate().getForObject(uri, String.class);
		}
}
