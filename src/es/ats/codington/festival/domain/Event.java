package es.ats.codington.festival.domain;

/**
 * POJO class to represent EVENT domain class
 * @author: EquipoVerde
 * @version: 1.0   Feb 18, 2015
 * @see es.ats.codington.festival.domain.People
 * 
 */


public class Event {
	/**
	 * Attributes of Event class 
	 */
			private int idEvent;
			private String eventName;
			private String description;
			private int duration;
			private String eventType;
			private String schedule;
			
	/**
	 * Declaring  People and Places variables. Both classes are now composed in People
	 */
	
		private People people;
		private Places places;
		
		/**
		 * Default constructor	
		 */
		
		public Event() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		/**
		 * Constructed using fields
		 * @param idEvent
		 * @param eventName
		 * @param description
		 * @param duration
		 * @param eventType
		 * @param schedule
		 * @param people
		 * @param places
		 */
		public Event(int idEvent, String eventName, String description,
				int duration, String eventType, String schedule, People people,
				Places places) {
			super();
			this.idEvent = idEvent;
			this.eventName = eventName;
			this.description = description;
			this.duration = duration;
			this.eventType = eventType;
			this.schedule = schedule;
			this.people = people;
			this.places = places;
		}
		
		
		/** Methods 
		 *  GETTER and SETTER methods for composed classes 
		 * @return
		 */
		
	     public People getPeople() {
	    	 return people;
	     }
	     public void setPeople(People people) {
	    	 this.people = people;
	     }
	     public Places getPlaces() {
	    	 return places;
	     }
	     public void setPlaces(Places places) {
	    	 this.places = places;
	     }
	
	   
	
	
		/** Methods 
		 *  GETTER and SETTER methods for EVENT class
		 */
	     
	 	public int getIdEvent() {
			return idEvent;
		}
		public void setIdEvent(int idEvent) {
			this.idEvent = idEvent;
		}
	 
		public String getEventName() {
			return eventName;
		}
		public void setEventName(String eventName) {
			this.eventName = eventName;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public int getDuration() {
			return duration;
		}
		public void setDuration(int duration) {
			this.duration = duration;
		}
		public String getEventType() {
			return eventType;
		}
		public void setEventType(String eventType) {
			this.eventType = eventType;
		}
		public String getSchedule() {
			return schedule;
		}
		public void setSchedule(String schedule) {
			this.schedule = schedule;
		}
		
	
		
	
		
		

	
	
}
