package es.ats.codington.festival.domain;

/**
 * Places POJO class for domain model 
 */

public abstract class Places {

	/** Attributes
	 *  Encapsulated data fields for PLACES class 
	*/
	
	private int idPlace;
	private String placeName;
	private int capacity;
	private String placeDescription;
	private String workingHours;
	
	/** Methods 
	 *  GETTER and SETTER methods for PLACES class
	 */
		
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getPlaceDescription() {
		return placeDescription;
	}
	public void setPlaceDescription(String placeDescription) {
		this.placeDescription = placeDescription;
	}
	public String getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
	}
	public int getIdPlace() {
		return idPlace;
	}
	public void setIdPlace(int idPlace) {
		this.idPlace = idPlace;
	}
	
	//Constructor
	
	public Places() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Places(int idPlace, String placeName, int capacity,
			String placeDescription, String workingHours) {
		super();
		this.idPlace = idPlace;
		this.placeName = placeName;
		this.capacity = capacity;
		this.placeDescription = placeDescription;
		this.workingHours = workingHours;
	}
	

	
	
	
	
	
}
