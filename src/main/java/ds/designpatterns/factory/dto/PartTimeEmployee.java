package ds.designpatterns.factory.dto;

import ds.designpatterns.factory.impl.IEmployee;

public class PartTimeEmployee implements IEmployee
{

	private final String salaryPerHour = "4€";
	
	public String getSalaryPerHour() 
	{
		return salaryPerHour;
	}

}
