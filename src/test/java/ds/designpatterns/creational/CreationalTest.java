package ds.designpatterns.creational;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import ds.designpatterns.creational.factory.EmployeeFactory;
import ds.designpatterns.factory.impl.IEmployee;

public class CreationalTest 
{
	
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
