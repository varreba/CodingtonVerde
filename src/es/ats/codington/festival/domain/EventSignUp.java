package es.ats.codington.festival.domain;

/**
 * EventSignUp POJO class for domain model 
 */

public class EventSignUp {

	/** Attributes
	 *  Encapsulated data fields for EventSignUp class 
	*/
	
	private Event events;
	private People people;
	
	/** Methods 
	 *  GETTER and SETTER methods for EVENT class
	 */
	 
	public Event getEvents() {
		return events;
	}
	public void setEvents(Event events) {
		this.events = events;
	}
	public People getPeople() {
		return people;
	}
	public void setPeople(People people) {
		this.people = people;
	}
	
	//Constructor
	
	public EventSignUp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EventSignUp(Event events, People people) {
		super();
		this.events = events;
		this.people = people;
	}
	
	
	
}

