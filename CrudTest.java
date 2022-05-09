import java.time.LocalDate;

import java.time.LocalDateTime;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CrudTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Trying to read persistence.xml file...");
		
		//3
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory created....");
		
		EntityManager em = emf.createEntityManager();
		System.out.println("EntityManager created....");
		
		EntityTransaction et = em.getTransaction();
		System.out.println("EntityTransaction created....");
		
		System.out.println("Trying to create record.....");
		
		Flight theFlight= new Flight();
		theFlight.setFlightNumber(103);
		theFlight.setFlightName("Air India");
		theFlight.setFlightSource("Mumbai");
		theFlight.setFlightDestination("Delhi");
		theFlight.setFlightTicketCost(8500);
		theFlight.setNumberOfPassengers(200);
		theFlight.setFlightDepartureFromSource(LocalDateTime.now());
		theFlight.setFlightArrivalAtDestination(LocalDateTime.now());
		
		et.begin();
			
		et.commit();
		System.out.println("=================");
		
		
		et.begin();
			Flight f = em.find(Flight.class, 101);
			f.setFlightDestination("USA");
			em.merge(f);
		et.commit(); 

		et.begin();
		Flight f1 = em.find(Flight.class, 83);
		em.remove(f1);			
	    et.commit();  
	    
		System.out.println("Deleting the record.....");
		
		
		
		
		Flight f1 = em.find(Flight.class, 84);
		System.out.println("Flight Number    "+f1.getFlightNumber());
			System.out.println("Flight Destination    "+f1.getFlightDestination());
			System.out.println("Flight Source   "+f1.getFlightSource());
		System.out.println("Deleting the record.....");
			
		
	    
		
			
			
			
			
			Query q =em.createNativeQuery("SELECT * FROM FLIGHT_INFO", Flight.class) ;
					
					    List<Flight> flight1 = (List<Flight>) q.getResultList();
					    
					    
					    for(Flight list:flight1) {
					    	
					    	System.out.println("Flight Number is    "+list.getFlightNumber());
					    	System.out.println("Flight Name is    "+list.getFlightName());
					    	System.out.println("Flight Source is    "+list.getFlightSource());
					    	System.out.println("Flight Destination is    "+list.getFlightDestination());
					    	System.out.println("================================================");
					    }
		
	}

}