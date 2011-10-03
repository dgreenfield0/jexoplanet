package planet;

import java.util.ArrayList;

import http.HttpClientHelper;


public class ExoPlanetProxy {

//	public XmlParser parser;
	
	HttpClientHelper HTTPCALL = new HttpClientHelper();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Testing Proxy
		System.out.println("ExoPlanet");
		ExoPlanetProxy test = new ExoPlanetProxy();
//		test.getPlanetsOrbitingStart("Gliese+876");
		
		String exoPlanetCount = test.getPlanetCount();
		System.out.println("********************\nExoPlanet count: "+exoPlanetCount+"\n********************");
		
//		String StarCount = test.getPlanetHostingStarCount();
//		System.out.println("********************\nPlanet Hosting Stars count: "+StarCount+"\n********************");

	}
	
	public void getPlanetsOrbitingStart(String starName){
//		http://nsted.ipac.caltech.edu/cgi-bin/nstedAPI/nph-nstedAPI?table=st_d24_plnt&where=plnthostname+like+'Gliese+876'&format=xml
		HTTPCALL.HTTP_GET(ExoPlanetAPI_Util.getBaseuri()+"table="+ExoPlanetAPI_Util.getHostStarTablename()+"&where=plnthostname+like+'"+starName+"'&format=xml");
	}
	
	public String getPlanetHostingStarCount(){
//		http://nsted.ipac.caltech.edu/cgi-bin/nstedAPI/nph-nstedAPI?table=st_l07_def&select=defname&format=xml
		String URL = ExoPlanetAPI_Util.getBaseuri()+"table="+ExoPlanetAPI_Util.getHostStarTablename()+"&select=defname&format=xml";
		String starData = HTTPCALL.HTTP_GET(URL);
		XmlParser parser = new XmlParser(starData);
		ArrayList list = parser.getXpath("//PARAM[@name='RowsRetrieved']/@value");
		return list.get(0).toString();
	}
	
	public String getStarCount(){
//		http://nsted.ipac.caltech.edu/cgi-bin/nstedAPI/nph-nstedAPI?table=st_l07_def&select=defname&format=xml
		String URL = ExoPlanetAPI_Util.getBaseuri()+"table="+ExoPlanetAPI_Util.getHostStarTablename()+"&select=defname&format=xml";
		String starData = HTTPCALL.HTTP_GET(URL);
		XmlParser parser = new XmlParser(starData);
		ArrayList list = parser.getXpath("//PARAM[@name='RowsRetrieved']/@value");
		return list.get(0).toString();
	}
	
	public String getPlanetCount(){
//		http://nsted.ipac.caltech.edu/cgi-bin/nstedAPI/nph-nstedAPI?table=st_d24_plnt&select=plnthostname&format=xml
		String URL = ExoPlanetAPI_Util.getBaseuri()+"table="+ExoPlanetAPI_Util.getPlanetTablename()+"&select=plnthostname&format=xml";
//		System.out.println("URL (EXO):"+URL);
		String HTTPDATA = HTTPCALL.HTTP_GET(URL);	
//		System.out.println("Parsing data, data size (EXO):"+HTTPDATA.length());
		XmlParser parser = new XmlParser(HTTPDATA);
		ArrayList list = parser.getXpath("//PARAM[@name='RowsRetrieved']/@value");
		return list.get(0).toString();
		}
		
}
