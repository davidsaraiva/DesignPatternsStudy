package ds.designpatterns.factory;

import ds.designpatterns.factory.dto.FullTimeEmployee;
import ds.designpatterns.factory.dto.PartTimeEmployee;
import ds.designpatterns.factory.dto.TemporaryEmployee;
import ds.designpatterns.factory.impl.IEmployee;

/**
 * 
 * @author DS
 * 
 * The factory pattern creates objects without exposing the creation logic
 * The user knows what he wants, but does not know how to create it
 * 
 */
public class EmployeeFactory 
{

	public IEmployee getEmployee(String employeeType) 
	{
		switch (employeeType)
		{
			case "fullTime" : return new FullTimeEmployee();
			case "partTime"	: return new PartTimeEmployee();
			case "temporary": return new TemporaryEmployee();
			default 		: return null;
		}
	}
}
