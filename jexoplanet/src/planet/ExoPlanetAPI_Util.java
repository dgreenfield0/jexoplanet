package planet;

public class ExoPlanetAPI_Util {

	private static final String baseURI = "http://nsted.ipac.caltech.edu/cgi-bin/nstedAPI/nph-nstedAPI?";
	public static String NStED_APIPage = "http://nsted.ipac.caltech.edu/NStED/docs/program_interfaces.html";
	private static final String Planet_TableName="st_d24_plnt";
	private static final String HostStart_TableName="st_l07_def";
	
	
	public static String getBaseuri() {
		return baseURI;
	}


	public static String getPlanetTablename() {
		return Planet_TableName;
	}


	public static String getHostStarTablename() {
		return HostStart_TableName;
	}

}
