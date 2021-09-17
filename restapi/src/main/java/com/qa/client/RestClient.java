package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {

	    // Get Method
	    public void get(String url) throws ClientProtocolException, IOException{
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);											// Http get request
		CloseableHttpResponse closableHttpResponse = httpclient.execute(httpget); 	// hit the GET URL
		
		// a. Status code
		int Statuscode = closableHttpResponse.getStatusLine().getStatusCode();	
		System.out.println("Status code:-- "+ Statuscode);
		
		// b. JSON String
		String responseString = EntityUtils.toString(closableHttpResponse.getEntity(),"UTF-8");	
		
		JSONObject responseJson = new JSONObject(responseString);
		System.out.println("Response Json from API:-- "+ responseJson );
		
		// c. All headers
		Header[] headersArray = closableHttpResponse.getAllHeaders();
		
		HashMap<String,String> allHeaders = new HashMap<String,String>();
		
		for(Header header: headersArray){
			allHeaders.put(header.getName(), header.getValue());
		}
		System.out.println("Headers Array: "+ allHeaders );
	}
	
	
}
