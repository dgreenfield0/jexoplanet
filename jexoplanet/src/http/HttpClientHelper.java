package http;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
//import org.apache.commons.

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * Basic http helper class
 * @author Dgreenfield
 *
 */
public class HttpClientHelper {

	public static void main(String[] args) throws Exception {	
		HttpClientHelper test = new HttpClientHelper();
		test.HTTP_GET("http://nsted.ipac.caltech.edu/cgi-bin/nstedAPI/nph-nstedAPI?table=st_d24_plnt&select=plnthostname&format=xml");
	}
	
	public String HTTP_GET (String URL){
		 HttpClient httpclient = new DefaultHttpClient();
		 String responseBody = "";
	        try {
	            HttpGet httpget = new HttpGet(URL);
	            ResponseHandler<String> responseHandler = new BasicResponseHandler();
	            responseBody = httpclient.execute(httpget, responseHandler);
	        } catch (ClientProtocolException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
	        	httpclient.getConnectionManager().shutdown();
	        }
			return responseBody;
}


}