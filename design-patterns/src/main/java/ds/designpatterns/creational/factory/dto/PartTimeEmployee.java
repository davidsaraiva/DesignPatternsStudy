package ds.designpatterns.creational.factory.dto;

import ds.designpatterns.creational.factory.impl.IEmployee;

public class PartTimeEmployee implements IEmployee
{

	private final String salaryPerHour = "4€";
	
	public String getSalaryPerHour() 
	{
		return salaryPerHour;
	}

}
