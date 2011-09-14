import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/**
 * Basic http helper class
 * @author Dgreenfield
 *
 */
public class HttpClientHelper {

	public static void main(String[] args) throws Exception {	
		HttpClientHelper test = new HttpClientHelper();
		test.HTTP_GET("http://www.google.com/");
	}
	
	public String HTTP_GET (String URL){
		URL url;
		StringBuffer data = new StringBuffer();
		try {
			url = new URL(URL);
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			String inputLine;			
			while ((inputLine = in.readLine()) != null){
				System.out.println(inputLine);
				data.append(inputLine);
			}
			in.close();
	} catch (MalformedURLException e) {
		//TODO Add Logger
		e.printStackTrace();
	} catch (IOException e) {
		//TODO Add Logger
		e.printStackTrace();
	}
	return data.toString();
}


}