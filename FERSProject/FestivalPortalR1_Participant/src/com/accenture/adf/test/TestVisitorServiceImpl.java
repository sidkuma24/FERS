package com.accenture.adf.test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.accenture.adf.businesstier.dao.EventDAO;
import com.accenture.adf.businesstier.entity.Event;
import com.accenture.adf.businesstier.entity.Visitor;
import com.accenture.adf.businesstier.service.VisitorServiceImpl;

/**
 * Junit test class for VisitorServiceImpl
 *
 */
public class TestVisitorServiceImpl {

	private List<Event> visitorList;	
	private Visitor visitor;
	private VisitorServiceImpl visitorServiceImpl;

	/**
	 * Set up the initial methods 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {		
		visitorServiceImpl = new VisitorServiceImpl();
		visitor = new Visitor();
	}

	/**
	 * Deallocates the objects after execution of every method
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		/**
		 * @TODO: Release all the objects here by assigning them null  
		 */
		visitor=null;
		visitorServiceImpl=null;
		visitorList = null;
	}

	/**
	 * Test case for method createVisitor
	 */
	@Test
	public void testCreateVisitor() {
		/**
		 * @TODO: Set the appropriate values for visitor object and
		 * call the method createVisitor by passing an argument of this visitor 
		 * object and then asserting the returned type of this method
		 */	
		visitor = new Visitor();
		visitor.setFirstName("kumari");
		visitor.setLastName("supriya");
		visitor.setEmail("k.supriya2012@gmail.com");
		visitor.setAddress("odisha");
		visitor.setPassword("abcd1234");
		visitor.setPhoneNumber("6478809899");
		visitor.setUserName("suppi");
		visitor.setVisitorId(123);
		boolean x=visitorServiceImpl.createVisitor(visitor);
		System.out.println("x=" + x);
		assertEquals(x,true);
		
	}

	/**
	 * Test case for method createVisitor
	 */
	@Test
	public void testSearchVisitor() {
		/**
		 * @TODO: Call searchVisitor method by passing the appropriate arguments 
		 * and then asserting the returned type visitor username with the argument passed
		 */	
		Visitor Nvisitor;
		Nvisitor=visitorServiceImpl.searchVisitor("npatel","password");
		assertEquals(Nvisitor.getUserName(),"npatel");
	}

	/**
	 * Test case for method RegisterVisitor
	 */
	@Test
	public void testRegisterVisitor() {
		/**
		 * @TODO: Call RegisterVisitor method by passing visitor object which 
		 * can be retrieved using searchVisitor method and then asserting the returned
		 * type of RegisterVisitor method 
		 */	
	 
		VisitorServiceImpl v1=new VisitorServiceImpl();
		Visitor v2=v1.searchVisitor("npatel", "password");
		
		
		v1.RegisterVisitor(v2, 1001);
		
		EventDAO ev=new EventDAO();
		
		try {
			assertTrue("unregisterd for the event",(ev.checkEventsofVisitor(v2, 1001)));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Visitor visitor= visitorServiceImpl.searchVisitor("npatel", "password");
//		Visitor v2=visitorServiceImpl.RegisterVisitor(visitor, 1001);
//		assert(visitorServiceImpl.RegisterVisitor(visitor, 1001), true);
//		
		
		
//		VisitorSerrviceImpl vis2=new VisitorServiceImpl();
//		Visitor v3=vis2.searchVisitor("npate1","password");
//		visitorServiceImpl.RegisterVisitor(visitor, 101);
//		visitorList= visitorServiceImpl.showRegisteredEvents(visitor);
//		Event event = new Event();
//		event.setEventid(101);
//		assertEquals(visitorList.contains(event),true);
//		assertTrue(visitor.getRegisteredEvents().contains(101));
//		
	}

	/**
	 * Test case for method showRegisteredEvents
	 */
	@Test
	public void testShowRegisteredEvents() {
		/**
		 * @TODO: Call showRegisteredEvents method by passing visitor object which 
		 * can be retrieved using searchVisitor method and then asserting the returned
		 * type of showRegisteredEvents method 
		 */	
		visitor=visitorServiceImpl.searchVisitor("npatel","password");
		visitorList=visitorServiceImpl.showRegisteredEvents(visitor);
		assertEquals(visitor.getUserName(),"npatel");
	}

	/**
	 * Test case for method updateVisitorDetails
	 */
	@Test
	public void testUpdateVisitorDetails() {
		/**
		 * @TODO: Call updateVisitorDetails method by passing the visitor object which
		 * can be retrieved using searchVisitor method and then asserting the returned
		 * type of updateVisitorDetails
		 */		
		
		VisitorServiceImpl v1= new VisitorServiceImpl();
		Visitor v2= v1.searchVisitor("npatel", "password");
		int x=visitorServiceImpl.updateVisitorDetails(v2);
		System.out.println("x= " +x);
		assertEquals(x > 0,true);
	}

	/**
	 * Test case for method unregisterEvent
	 */
	@Test
	public void testUnregisterEvent() {
		/**
		 * @TODO: Call unregisterEvent method by passing the visitor object which can be
		 * retrieved using searchVisitor method and then asserting the returned type 
		 * of unregisterEvent
		 */		
		visitorServiceImpl.unregisterEvent(visitor, 1001);
		Visitor Nvisitor;
		Nvisitor=visitorServiceImpl.searchVisitor("npatel","password");
		assertEquals(Nvisitor,null);
		visitorList= visitorServiceImpl.showRegisteredEvents(visitor);
		assertFalse(visitorList.contains(1001));
		//assertTrue(visitor.getRegisteredEvents().contains(101));
		
	}

}
