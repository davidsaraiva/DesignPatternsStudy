package ds.designpatterns.creational.factory;

import ds.designpatterns.creational.factory.dto.FullTimeEmployee;
import ds.designpatterns.creational.factory.dto.PartTimeEmployee;
import ds.designpatterns.creational.factory.dto.TemporaryEmployee;
import ds.designpatterns.creational.factory.impl.IEmployee;

/**
 * 
 * @author DS
 * 
 * The factory pattern creates objects without exposing the creation logic
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
