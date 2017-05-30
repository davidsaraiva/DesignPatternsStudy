package ds.designpatterns.creational;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ds.designpatterns.factory.EmployeeFactory;
import ds.designpatterns.factory.impl.IEmployee;

public class CreationalDesignPatternTest 
{
	
	/**
	 * Test Factory Pattern, and make sure the correct instances are created
	 */
    @Test 
    public void testFactoryDP()
    {
    	EmployeeFactory factory = new EmployeeFactory();
    	
    	IEmployee partTime = factory.getEmployee("partTime");
    	assertEquals(partTime.getSalaryPerHour(), "4€");
    	
    	IEmployee fullTime = factory.getEmployee("fullTime");
    	assertEquals(fullTime.getSalaryPerHour(), "8€");
    	
    	IEmployee temporary = factory.getEmployee("temporary");
    	assertEquals(temporary.getSalaryPerHour(), "5€");
    }
}
