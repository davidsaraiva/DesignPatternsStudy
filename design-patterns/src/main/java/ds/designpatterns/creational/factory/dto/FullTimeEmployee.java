package ds.designpatterns.creational.factory.dto;

import ds.designpatterns.creational.factory.impl.IEmployee;

public class FullTimeEmployee implements IEmployee
{

	private final String salaryPerHour = "8€";
	
	public String getSalaryPerHour() 
	{
		return salaryPerHour;
	}

}
