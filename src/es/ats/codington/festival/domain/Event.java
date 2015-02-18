package es.ats.codington.festival.domain;

/**
*  POJO class to represent EVENT domain class
*/


public class Event {

	// Attributes

	     // Declaring  People and Places variables. Both classes are now composed in People
	
		private People people;
		private Places places;
	
	
		
		/** Methods 
		 *  GETTER and SETTER methods for composed classes
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
	
	     //Encapsulated data fields for EVENT class 
	
		private String eventName;
		private String description;
		private int duration;
		private String eventType;
		private String schedule;
		private int ticketPrice;
	
	
		/** Methods 
		 *  GETTER and SETTER methods for EVENT class
		 */
	 
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
		public int getTicketPrice() {
			return ticketPrice;
		}
		public void setTicketPrice(int ticketPrice) {
			this.ticketPrice = ticketPrice;
		}
	
		// Constructor 
		
		public Event() {
			super();
		}
		public Event(People people, Places places, String eventName,
				String description, int duration, String eventType,
				String schedule, int ticketPrice) {
			super();
			this.people = people;
			this.places = places;
			this.eventName = eventName;
			this.description = description;
			this.duration = duration;
			this.eventType = eventType;
			this.schedule = schedule;
			this.ticketPrice = ticketPrice;
		}

	
	
}
