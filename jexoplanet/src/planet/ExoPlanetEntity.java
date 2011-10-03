package planet;

/**
 * 
 * @author David Greenfield
 * This Class represents the ExoPlanet data that is pulled from the NsTed database.  
 * Overview of the NStED exoPlanet Table columns can be found here.  
 * http://nsted.ipac.caltech.edu/NStED/docs/API_planet_columns.html
 */


public class ExoPlanetEntity {
	
//	plnthostname
	private String PlanetHostStarName = "";
//	plntletter
	private String PlanetLetter = "";
//	(AU) Orbital semi-major axis error
	private String Orbital_SemiMajorAxis = "";
//	plntran	Is the planet known to transit? (1 = yes, 0 = no)
	private boolean IsPlanetKnownToTransit;
//	plnradj (jrad)	Radius of the planet (Jupiter Radii)
	private String PlanetRadius_JupiterRadii = "";
//	plnradjlim	Radius of the planet (Jupiter Radii) limit flag
	private String PlanetRadius_limitFlag_JupiterRadii = "";
//	plnradjerr1 (jrad)	Radius of the planet (Jupiter Radii) error +
	private String PlanetRadius_ErrorPlus_JupiterRadii = "";
//	plnradjerr2 (jrad)	Radius of the planet (Jupiter Radii) error -
	private String PlanetRadius_ErrorMinus_JupiterRadii = "";

//	plntrandep (perc)	Measured transit depth
	private String MeasuredTransitDepth = "";
//	plntrandeplim	Measured transit depth limit flag
	private String MeasuredTransitDepth_limitFlag = "";
//	plntrandeperr1 (perc)	Measured transit depth error +
	private String MeasuredTransitDepth_errorPlus = "";
//	plntrandeperr2 (perc)	Measured transit depth error -
	private String MeasuredTransitDepth_errorMinus = "";

//	plntrandur (days)	Measured transit duration
	private String MeasuredTransit_Duration = "";
//	plntrandurerr1 (days)	Measured transit duration error +
	private String MeasuredTransit_Duration_errorPlus = "";
//	plntrandurerr2 (days)	Measured transit duration error -
	private String MeasuredTransit_Duration_errorMinus = "";
//	plntrandurlim	Measured transit duration limit flag
	private String MeasuredTransit_Duration_limitFlag = "";

//	plntranmid (days)	Measured transit mid-point
	private String MeasuredTransit_Duration_midPoint = "";
//	plntranmidlim	Measured transit mid-point limit flag
	private String MeasuredTransit_Duration_midPoint_limitFlag = "";
//	plntranmiderr1 (days)	Measured transit mid-point error +
	private String MeasuredTransit_Duration_midPoint_errorPlus = "";
//	plntranmiderr2 (days)	Measured transit mid-point error -
	private String MeasuredTransit_Duration_midPoint_errorMinus = "";

//	plnorbeccen	Orbital eccentricity
	private String OrbitalEccentricity = "";
//	plnorbeccenlim	Orbital eccentricity limit flag
	private String OrbitalEccentricity_limitFlag = "";
//	plnorbeccenerr1	Orbital eccentricity error +
	private String OrbitalEccentricity_errorPlus = "";
//	plnorbeccenerr2	Orbital eccentricity error -
	private String OrbitalEccentricity_errorMinus = "";

//	plnorbincl (deg)	Orbital inclination
	private String OrbitalInclination = "";
//	plnorbincllim	Orbital inclination limit flag
	private String OrbitalInclination_limitFlag = "";
//	plnorbinclerr1 (deg)	Orbital inclination error +
	private String OrbitalInclination_errorPlus = "";
//	plnorbinclerr2 (deg)	Orbital inclination error -
	private String OrbitalInclination_errorMinus = "";

//	plnorbtper (days)	Orbital time of periastron passage
	private String OrbitalTimeOfPeriastronPassage= "";
//	plnorbtperlim	Orbital time of periastron passage limit flag
	private String OrbitalTimeOfPeriastronPassage_limitFlag = "";
//	plnorbtpererr1 (days)	Orbital time of periastron passage error +
	private String OrbitalTimeOfPeriastronPassage_errorPlus = "";
//	plnorbtpererr2 (days)	Orbital time of periastron passage error -
	private String OrbitalTimeOfPeriastronPassage_errorMinus = "";

	
//	plnorblper (deg)	Orbital longitude of periastron
	private String OrbitalLongitudeOfPeriastron = "";
//	plnorblperlim	Orbital longitude of periastron limit flag
	private String OrbitalLongitudeOfPeriastron_limitFlag = "";
//	plnorblpererr1 (deg)	Orbital longitude of periastron error +
	private String OrbitalLongitudeOfPeriastron_errorPlus = "";
//	plnorblpererr2 (deg)	Orbital longitude of periastron error -
	private String OrbitalLongitudeOfPeriastron_errorMinus = "";

//	plnmasse (emass)	Mass of the planet in Earth masses
	private String PlanetMass= "";
//	plnmasselim	Mass of the planet in Earth masses limit flag
	private String PlanetMass_limitFlag = "";
//	plnmasseerr1 (emass)	Mass of the planet in Earth masses error +
	private String PlanetMass_errorPlus = "";
//	plnmasseerr2 (emass)	Mass of the planet in Earth masses error -
	private String PlanetMass_errorMinus = "";

//	plnrade (erad)	Radius of the planet (Earth Radii)
	private String PlanetRadius_EarthRadii = "";
//	plnradelim	Radius of the planet (Earth Radii) limit flag
	private String PlanetRadius_limitFlag_EarthRadii = "";
//	plnradeerr1 (erad)	Radius of the planet (Earth Radii) error +
	private String PlanetRadius_errorPlus_EarthRadii = "";
//	plnradeerr2 (erad)	Radius of the planet (Earth Radii) error -
	private String PlanetRadius_errorMinus_EarthRadii = "";

//	plndisc	Year of discovery
	private String YearDiscovered = "";

//	plnmethod	Method of discovery (tran=transit, rv=radial velocity, micro=microlensing, ima=imaging, ast=astrometry, pul=pulsations) //plnradslim
	public enum MethodOfDiscovery {
		tran, rv, micro, ima, ast, pul;
		}
	
	//Corresponding DB table column names
	public final String DB_ColumnName_Orbital_Semi_MajorAxis = "plnorbsmaxerr2";
	public final String DB_ColumnName_IsPlanetKnownToTransit = "plntran";
	
	public void setOrbital_SemiMajorAxis(String orbital_SemiMajorAxis) {
		Orbital_SemiMajorAxis = orbital_SemiMajorAxis;
	}
	public String getOrbital_SemiMajorAxis() {
		return Orbital_SemiMajorAxis;
	}
	public void setIsPlanetKnownToTransit(int isPlanetKnownToTransit) {
		if (isPlanetKnownToTransit == 1){
			IsPlanetKnownToTransit = true;
		}else if(isPlanetKnownToTransit == 0){
			IsPlanetKnownToTransit = false;		
		}
	}
	public boolean isIsPlanetKnownToTransit() {
		return IsPlanetKnownToTransit;
	}
	

}
